package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.ResourceRichText
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ResourceRichTextExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ResourceRichText> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "hint")
    fileParser.addCell(2, "field")
    fileParser.addCell(3, "sort")
    fileParser.addCell(4, "value")
    fileParser.addCell(5, "id", LongConvertor())
    fileParser.addCell(6, "version", LongConvertor())
    fileParser.addCell(7, "createdAt")
    fileParser.addCell(8, "updatedAt")
    fileParser.addCell(9, "deletedAt")
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
    get() = ResourceRichText::class.java

    override val ruleName: String
    get() = "resourceRichText"

    override fun process(data: List<ResourceRichText>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
