package nz.co.zran.cannon.content.entity.json

import com.fasterxml.jackson.annotation.*
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("fieldGroupClassName", "fieldGroup", "id", "hooks", "modelOptions", "templateOptions", "type", "defaultValue", "wrappers")
class ExternalConfig {
    @get:JsonProperty("fieldGroupClassName")
    @set:JsonProperty("fieldGroupClassName")
    @JsonProperty("fieldGroupClassName")
    var fieldGroupClassName: String? = null

    @get:JsonProperty("fieldGroup")
    @set:JsonProperty("fieldGroup")
    @JsonProperty("fieldGroup")
    var fieldGroup: List<FieldGroup>? = null

    @get:JsonProperty("id")
    @set:JsonProperty("id")
    @JsonProperty("id")
    var id: Int? = null

    @get:JsonProperty("hooks")
    @set:JsonProperty("hooks")
    @JsonProperty("hooks")
    var hooks: Hooks_? = null

    @get:JsonProperty("modelOptions")
    @set:JsonProperty("modelOptions")
    @JsonProperty("modelOptions")
    var modelOptions: ModelOptions_? = null

    @get:JsonProperty("templateOptions")
    @set:JsonProperty("templateOptions")
    @JsonProperty("templateOptions")
    var templateOptions: TemplateOptions_? = null

    @get:JsonProperty("type")
    @set:JsonProperty("type")
    @JsonProperty("type")
    var type: String? = null

    @get:JsonProperty("defaultValue")
    @set:JsonProperty("defaultValue")
    @JsonProperty("defaultValue")
    var defaultValue: DefaultValue? = null

    @get:JsonProperty("wrappers")
    @set:JsonProperty("wrappers")
    @JsonProperty("wrappers")
    var wrappers: List<Any>? = null

    @JsonIgnore
    private val additionalProperties: MutableMap<String, Any> = HashMap()

    @JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return additionalProperties
    }

    @JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        additionalProperties[name] = value
    }
}