package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.BaseComponent
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class BaseComponentExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<BaseComponent> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "id", LongConvertor())
    fileParser.addCell(2, "label")
    fileParser.addCell(3, "fieldId")
    fileParser.addCell(4, "cssClassName")
    fileParser.addCell(5, "required")
    fileParser.addCell(6, "sort")
    fileParser.addCell(7, "externalConfig")
    fileParser.addCell(8, "externalName")
    fileParser.addCell(9, "externalId")
    fileParser.addCell(10, "id", LongConvertor())
    fileParser.addCell(11, "version", LongConvertor())
    fileParser.addCell(12, "createdAt")
    fileParser.addCell(13, "updatedAt")
    fileParser.addCell(14, "deletedAt")
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
    get() = BaseComponent::class.java

    override val ruleName: String
    get() = "baseComponent"

    override fun process(data: List<BaseComponent>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
