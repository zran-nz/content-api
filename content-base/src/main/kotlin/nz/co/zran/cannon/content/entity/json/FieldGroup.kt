package nz.co.zran.cannon.content.entity.json

import com.fasterxml.jackson.annotation.*
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("type", "key", "className", "templateOptions", "attributes", "id", "hooks", "modelOptions", "wrappers", "_keyPath", "appearance", "required")
class FieldGroup {
    @get:JsonProperty("type")
    @set:JsonProperty("type")
    @JsonProperty("type")
    var type: String? = null

    @get:JsonProperty("key")
    @set:JsonProperty("key")
    @JsonProperty("key")
    var key: String? = null

    @get:JsonProperty("className")
    @set:JsonProperty("className")
    @JsonProperty("className")
    var className: String? = null

    @get:JsonProperty("templateOptions")
    @set:JsonProperty("templateOptions")
    @JsonProperty("templateOptions")
    var templateOptions: TemplateOptions? = null

    @get:JsonProperty("attributes")
    @set:JsonProperty("attributes")
    @JsonProperty("attributes")
    var attributes: Attributes? = null

    @get:JsonProperty("id")
    @set:JsonProperty("id")
    @JsonProperty("id")
    var id: String? = null

    @get:JsonProperty("hooks")
    @set:JsonProperty("hooks")
    @JsonProperty("hooks")
    var hooks: Hooks? = null

    @get:JsonProperty("modelOptions")
    @set:JsonProperty("modelOptions")
    @JsonProperty("modelOptions")
    var modelOptions: ModelOptions? = null

    @get:JsonProperty("wrappers")
    @set:JsonProperty("wrappers")
    @JsonProperty("wrappers")
    var wrappers: List<String>? = null

    @get:JsonProperty("_keyPath")
    @set:JsonProperty("_keyPath")
    @JsonProperty("_keyPath")
    var keyPath: KeyPath? = null

    @get:JsonProperty("appearance")
    @set:JsonProperty("appearance")
    @JsonProperty("appearance")
    var appearance: String? = null

    @get:JsonProperty("required")
    @set:JsonProperty("required")
    @JsonProperty("required")
    var required: Any? = null

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