package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.PageConfig
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class PageConfigExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<PageConfig> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "name")
    fileParser.addCell(2, "pageId")
    fileParser.addCell(3, "json")
    fileParser.addCell(4, "id", LongConvertor())
    fileParser.addCell(5, "version", LongConvertor())
    fileParser.addCell(6, "createdAt")
    fileParser.addCell(7, "updatedAt")
    fileParser.addCell(8, "deletedAt")
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
    get() = PageConfig::class.java

    override val ruleName: String
    get() = "pageConfig"

    override fun process(data: List<PageConfig>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
