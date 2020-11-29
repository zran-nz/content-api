package nz.co.zran.content.excel

import nz.co.zran.content.entity.ComponentAttachment
import com.github.b1412.excel.service.ExcelParsingRule
import com.github.b1412.files.parser.FileParser
import com.github.b1412.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class ComponentAttachmentExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<ComponentAttachment> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "attachments")
    fileParser.addCell(2, "id", LongConvertor())
    fileParser.addCell(3, "version", LongConvertor())
    fileParser.addCell(4, "createdAt")
    fileParser.addCell(5, "updatedAt")
    fileParser.addCell(6, "deletedAt")
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
    get() = ComponentAttachment::class.java

    override val ruleName: String
    get() = "componentAttachment"

    override fun process(data: List<ComponentAttachment>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
