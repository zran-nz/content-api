package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.ComponentSelect
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ComponentSelectExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ComponentSelect> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "value")
    fileParser.addCell(2, "optionsUrl")
    fileParser.addCell(3, "optionLabel")
    fileParser.addCell(4, "optionValue")
    fileParser.addCell(5, "multiChoice")
    fileParser.addCell(6, "id", LongConvertor())
    fileParser.addCell(7, "label")
    fileParser.addCell(8, "fieldId")
    fileParser.addCell(9, "cssClassName")
    fileParser.addCell(10, "required")
    fileParser.addCell(11, "sort")
        return fileParser
    }

    override val entityClass: Class<*>
    get() = ComponentSelect::class.java

    override val ruleName: String
    get() = "componentSelect"

    override fun process(data: List<ComponentSelect>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
