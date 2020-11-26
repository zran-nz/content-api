package nz.co.zran.cannon.content.entity

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
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
        JsonSubTypes.Type(value = ResourceInput::class, name = "input"),
        JsonSubTypes.Type(value = ResourceChoice::class, name = "choice"),
)
class Resource(

) : BaseEntity() {
    override var id: Long?=null
    val hint: String? = null
    val field: String? = null
    val value: String? = null
    val sort: Int? = null
}