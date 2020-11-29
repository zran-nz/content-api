package nz.co.zran.content.excel

import nz.co.zran.content.entity.ContentComponent
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ContentComponentExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ContentComponent> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "name")
    fileParser.addCell(2, "components")
    fileParser.addCell(3, "externalConfig")
    fileParser.addCell(4, "externalName")
    fileParser.addCell(5, "externalId")
    fileParser.addCell(6, "id", LongConvertor())
    fileParser.addCell(7, "version", LongConvertor())
    fileParser.addCell(8, "createdAt")
    fileParser.addCell(9, "updatedAt")
    fileParser.addCell(10, "deletedAt")
        fileParser.addCell(2, "category", EntityConvertor().apply {
                name = "Creator"
                em = entityManager
        })
        fileParser.addCell(2, "category", EntityConvertor().apply {
                name = "Modifier"
                em = entityManager
        })
        return fileParser
    }

    override val entityClass: Class<*>
    get() = ContentComponent::class.java

    override val ruleName: String
    get() = "contentComponent"

    override fun process(data: List<ContentComponent>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
