package nz.co.zran.cannon.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Entity
import javax.validation.constraints.NotNull

@EntityFeature
@DynamicUpdate
@DynamicInsert
@Entity
data class ResourceSelect(
        @NotNull
        val hint: String?,
        val field: String?,
        val sort: Int?,
        val url: String?
) : BaseEntity()