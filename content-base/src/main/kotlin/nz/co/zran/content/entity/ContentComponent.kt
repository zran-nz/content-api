package nz.co.zran.content.entity

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
data class ContentComponent(
    @NotNull
    val name: String?,
//        @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
//        val components: MutableList<BaseComponent> = mutableListOf(),

//        @Type(type = "json")
//        @Column(columnDefinition = "json")
//        @GraphQLIgnore
//        val externalConfigJson: List<ExternalConfig> = mutableListOf(),
    @Column(columnDefinition = "mediumtext")
    val externalConfig: String? = null,
    @Column
    val externalValue: String? = null,
    val externalName: String? = null,
    val externalId: String? = null
) : BaseEntity()