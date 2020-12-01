package nz.co.zran.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.email.entity.Attachment
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany

@EntityFeature
@Entity
@DynamicUpdate
@DynamicInsert
data class ComponentAttachment(
        @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
        val attachments: MutableList<Attachment> = mutableListOf(),
        val fieldId: String? = null
) : BaseComponent()