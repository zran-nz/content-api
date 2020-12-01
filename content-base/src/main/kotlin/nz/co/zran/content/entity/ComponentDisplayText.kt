package nz.co.zran.content.entity

import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Column
import javax.persistence.Entity

@EntityFeature
@DynamicUpdate
@DynamicInsert
@Entity
data class ComponentDisplayText(
        val fieldId: String? = null,
        @Column(columnDefinition = "Text")
        var value: String?
) : BaseComponent()