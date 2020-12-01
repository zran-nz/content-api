package nz.co.zran.content.entity

import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Entity

@EntityFeature
@DynamicUpdate
@DynamicInsert
@Entity
data class ComponentInput(
        var value: String?,
        val fieldId: String? = null
) : BaseComponent()