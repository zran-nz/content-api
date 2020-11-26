package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.ComponentRadio
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ComponentRadioExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ComponentRadio> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "value")
    fileParser.addCell(2, "optionsUrl")
    fileParser.addCell(3, "optionLabel")
    fileParser.addCell(4, "optionValue")
    fileParser.addCell(5, "id", LongConvertor())
    fileParser.addCell(6, "label")
    fileParser.addCell(7, "fieldId")
    fileParser.addCell(8, "cssClassName")
    fileParser.addCell(9, "required")
    fileParser.addCell(10, "sort")
        return fileParser
    }

    override val entityClass: Class<*>
    get() = ComponentRadio::class.java

    override val ruleName: String
    get() = "componentRadio"

    override fun process(data: List<ComponentRadio>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
