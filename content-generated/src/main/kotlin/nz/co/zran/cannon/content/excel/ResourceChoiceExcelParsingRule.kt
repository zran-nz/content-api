package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.ResourceChoice
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ResourceChoiceExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ResourceChoice> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "title")
    fileParser.addCell(2, "resourceChoiceType")
    fileParser.addCell(3, "options")
    fileParser.addCell(4, "choiceHint")
    fileParser.addCell(5, "id", LongConvertor())
    fileParser.addCell(6, "hint")
    fileParser.addCell(7, "field")
    fileParser.addCell(8, "value")
    fileParser.addCell(9, "sort")
        return fileParser
    }

    override val entityClass: Class<*>
    get() = ResourceChoice::class.java

    override val ruleName: String
    get() = "resourceChoice"

    override fun process(data: List<ResourceChoice>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
