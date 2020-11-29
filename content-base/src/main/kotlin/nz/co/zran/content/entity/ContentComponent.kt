package nz.co.zran.content.entity

import com.github.b1412.api.entity.BaseEntity
import com.github.b1412.generator.metadata.EntityFeature
import com.github.b1412.permission.graphql.annotation.GraphQLIgnore
import nz.co.zran.content.entity.json.ExternalConfig
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.Type
import javax.persistence.CascadeType
import javax.persistence.Column
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
        @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
        val components: MutableList<BaseComponent> = mutableListOf(),

        @Type(type = "json")
        @Column(columnDefinition = "json")
        @GraphQLIgnore
        val externalConfig: List<ExternalConfig> = mutableListOf(),
        val externalConfigString: String? = null,
        val externalName: String? = null,
        val externalId: String? = null
) : BaseEntity()