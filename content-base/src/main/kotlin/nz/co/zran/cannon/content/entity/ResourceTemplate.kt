package nz.co.zran.cannon.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*
import javax.validation.constraints.NotNull

@EntityFeature
@Entity
@DynamicUpdate
@DynamicInsert
data class ResourceTemplate(
        val name: String,
        @NotNull
        @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
        val resourceComponents: MutableList<ResourceComponent> = mutableListOf()
) : BaseEntity()