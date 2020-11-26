package nz.co.zran.cannon.content.entity

import com.github.b1412.generator.metadata.EntityFeature
import nz.co.zran.cannon.content.enums.ResourceChoiceType
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*
import javax.validation.constraints.NotNull

@EntityFeature
@DynamicUpdate
@DynamicInsert

@Entity
data class ResourceChoice(
        @NotNull
        val title: String?,
        @Enumerated(EnumType.STRING)
        @NotNull
        val resourceChoiceType: ResourceChoiceType?,
        @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
        val options: MutableList<ResourceChoiceOption> = mutableListOf(),
        val choiceHint: String?
) : Resource()