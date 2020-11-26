package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.ComponentCheckbox
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ComponentCheckboxExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ComponentCheckbox> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "checked")
    fileParser.addCell(2, "id", LongConvertor())
    fileParser.addCell(3, "label")
    fileParser.addCell(4, "fieldId")
    fileParser.addCell(5, "cssClassName")
    fileParser.addCell(6, "required")
    fileParser.addCell(7, "sort")
        return fileParser
    }

    override val entityClass: Class<*>
    get() = ComponentCheckbox::class.java

    override val ruleName: String
    get() = "componentCheckbox"

    override fun process(data: List<ComponentCheckbox>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
