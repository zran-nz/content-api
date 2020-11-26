package nz.co.zran.cannon.content.entity

import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Entity

@EntityFeature
@DynamicUpdate
@DynamicInsert
@Entity
data class ComponentRadio(
    var value: String?,
    var optionsUrl: String?,
    var optionLabel: String?,
    var optionValue: String?
) : BaseComponent()