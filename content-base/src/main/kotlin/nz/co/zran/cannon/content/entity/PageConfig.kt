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
data class PageConfig(
        @NotNull
        val name: String?,
        @NotNull
        val pageId: String?,
        @NotNull
        @Column(columnDefinition = "TEXT")
        val json: String?
) : BaseEntity()