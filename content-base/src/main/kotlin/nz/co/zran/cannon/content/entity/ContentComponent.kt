package nz.co.zran.cannon.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull

@EntityFeature
@Entity
@DynamicUpdate
@DynamicInsert
data class ContentComponent(
        @NotNull
        val name: String?,
        @NotNull
        val externalId: String?,
        @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
        val components: MutableList<BaseComponent> = mutableListOf()
) : BaseEntity()