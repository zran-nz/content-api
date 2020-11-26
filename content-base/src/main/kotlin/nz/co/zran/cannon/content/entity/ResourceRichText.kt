package nz.co.zran.cannon.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Column
import javax.persistence.Entity
import javax.validation.constraints.NotNull

@EntityFeature
@Entity
@DynamicUpdate
@DynamicInsert
data class ResourceRichText(
        @NotNull
        val hint: String?,
        val field: String?,
        val sort: Int?,
        @Column(columnDefinition = "mediumtext")
        val value: String? = null
) : BaseEntity()