package nz.co.zran.content.entity

import com.github.b1412.generator.metadata.EntityFeature
import nz.co.zran.content.enums.ComponentQuizChoiceType
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*
import javax.validation.constraints.NotNull

@EntityFeature
@DynamicUpdate
@DynamicInsert

@Entity
data class ComponentQuiz(
        val value: String?,
        @NotNull
        val title: String?,
        @Enumerated(EnumType.STRING)
        @NotNull
        val choiceType: ComponentQuizChoiceType?,
        @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
        val choices: MutableList<ComponentQuizChoice> = mutableListOf(),
        val hint: String?
) : BaseComponent()