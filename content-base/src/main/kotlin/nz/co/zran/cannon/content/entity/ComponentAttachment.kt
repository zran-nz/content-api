package nz.co.zran.cannon.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.email.entity.Attachment
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull

@EntityFeature
@Entity
@DynamicUpdate
@DynamicInsert
data class ComponentAttachment(
//        @OneToMany
//        val attachments: MutableList<Attachment> = mutableListOf()
        val temp: String?
) : BaseEntity()