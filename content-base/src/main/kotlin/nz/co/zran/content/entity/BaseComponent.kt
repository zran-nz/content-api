package nz.co.zran.content.entity

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.Type
import javax.persistence.Entity
import javax.persistence.Inheritance
import javax.persistence.InheritanceType

@EntityFeature
@Inheritance(strategy = InheritanceType.JOINED)
@Entity

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = ComponentInput::class, name = "input"),
    JsonSubTypes.Type(value = ComponentSelect::class, name = "select"),
    JsonSubTypes.Type(value = ComponentCheckbox::class, name = "checkbox"),
    JsonSubTypes.Type(value = ComponentTextarea::class, name = "textarea"),
    JsonSubTypes.Type(value = ComponentRadio::class, name = "radio"),
    JsonSubTypes.Type(value = ComponentDisplayText::class, name = "displayText"),
    JsonSubTypes.Type(value = ComponentQuiz::class, name = "quiz"),
    JsonSubTypes.Type(value = ComponentEditor::class, name = "editor"),
    JsonSubTypes.Type(value = ComponentRepeat::class, name = "repeat")
)
class BaseComponent : BaseEntity() {
    val label: String? = null
    val cssClassName: String? = null

    @Type(type = "yes_no")
    var required: Boolean? = false
    val sort: Int? = null
}