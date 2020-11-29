package nz.co.zran.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.Type
import javax.persistence.Entity

@EntityFeature
@Entity
@DynamicUpdate
@DynamicInsert
data class ComponentQuizChoice(
        val value: String?,
        @Type(type = "yes_no")
        val rightAnswer: Boolean?
) : BaseEntity()