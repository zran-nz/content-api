package nz.co.zran.content.entity

import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.Type
import javax.persistence.ElementCollection
import javax.persistence.Entity

@EntityFeature
@DynamicUpdate
@DynamicInsert
@Entity
data class ComponentSelect(
        @ElementCollection
        val value: MutableList<String> = mutableListOf(),
        var optionsUrl: String?,
        var optionLabel: String?,
        var optionValue: String?,
        @Type(type = "yes_no")
        var multiChoice: Boolean
) : BaseComponent()