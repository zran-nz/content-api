package nz.co.zran.cannon.content.excel

import nz.co.zran.cannon.content.entity.ComponentQuiz
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ComponentQuizExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ComponentQuiz> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "title")
    fileParser.addCell(2, "quizChoiceType")
    fileParser.addCell(3, "quizChoices")
    fileParser.addCell(4, "hint")
    fileParser.addCell(5, "id", LongConvertor())
    fileParser.addCell(6, "label")
    fileParser.addCell(7, "fieldId")
    fileParser.addCell(8, "cssClassName")
    fileParser.addCell(9, "required")
    fileParser.addCell(10, "sort")
    fileParser.addCell(11, "externalConfig")
    fileParser.addCell(12, "externalName")
    fileParser.addCell(13, "externalId")
        return fileParser
    }

    override val entityClass: Class<*>
    get() = ComponentQuiz::class.java

    override val ruleName: String
    get() = "componentQuiz"

    override fun process(data: List<ComponentQuiz>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
