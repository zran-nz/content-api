package nz.co.zran.content.excel

import nz.co.zran.content.entity.BaseComponent
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
    fileParser.addCell(1, "label")
    fileParser.addCell(2, "fieldId")
    fileParser.addCell(3, "cssClassName")
    fileParser.addCell(4, "required")
    fileParser.addCell(5, "sort")
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
    get() = BaseComponent::class.java

    override val ruleName: String
    get() = "baseComponent"

    override fun process(data: List<BaseComponent>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
