package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.ResourceInput
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ResourceInputExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ResourceInput> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "lable")
    fileParser.addCell(2, "id", LongConvertor())
    fileParser.addCell(3, "hint")
    fileParser.addCell(4, "field")
    fileParser.addCell(5, "value")
    fileParser.addCell(6, "sort")
        return fileParser
    }

    override val entityClass: Class<*>
    get() = ResourceInput::class.java

    override val ruleName: String
    get() = "resourceInput"

    override fun process(data: List<ResourceInput>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
