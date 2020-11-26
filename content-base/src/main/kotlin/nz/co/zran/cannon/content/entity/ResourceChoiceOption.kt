package nz.co.zran.cannon.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import nz.co.zran.cannon.content.enums.ResourceChoiceType
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.Type
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@EntityFeature
@Entity
@DynamicUpdate
@DynamicInsert
data class ResourceChoiceOption(
        val value: String?,
        @Type(type = "yes_no")
        val answer: Boolean?
) : BaseEntity()