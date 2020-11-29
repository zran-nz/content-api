package nz.co.zran.content.excel

import nz.co.zran.content.entity.ComponentQuizChoice
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ComponentQuizChoiceExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ComponentQuizChoice> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "value")
    fileParser.addCell(2, "rightAnswer")
    fileParser.addCell(3, "id", LongConvertor())
    fileParser.addCell(4, "version", LongConvertor())
    fileParser.addCell(5, "createdAt")
    fileParser.addCell(6, "updatedAt")
    fileParser.addCell(7, "deletedAt")
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
    get() = ComponentQuizChoice::class.java

    override val ruleName: String
    get() = "componentQuizChoice"

    override fun process(data: List<ComponentQuizChoice>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
