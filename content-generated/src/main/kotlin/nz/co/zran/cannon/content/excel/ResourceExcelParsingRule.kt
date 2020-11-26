package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.Resource
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ResourceExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<Resource> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "id", LongConvertor())
    fileParser.addCell(2, "hint")
    fileParser.addCell(3, "field")
    fileParser.addCell(4, "value")
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
    get() = Resource::class.java

    override val ruleName: String
    get() = "resource"

    override fun process(data: List<Resource>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
