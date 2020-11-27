package nz.co.zran.cannon.content.entity.json

import com.fasterxml.jackson.annotation.*
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("label", "required", "appearance", "placeholder", "focus", "disabled", "hideFieldUnderline", "indeterminate", "floatLabel", "hideLabel", "align", "color")
class TemplateOptions {
    @get:JsonProperty("label")
    @set:JsonProperty("label")
    @JsonProperty("label")
    var label: String? = null

    @get:JsonProperty("required")
    @set:JsonProperty("required")
    @JsonProperty("required")
    var required: Any? = null

    @get:JsonProperty("appearance")
    @set:JsonProperty("appearance")
    @JsonProperty("appearance")
    var appearance: String? = null

    @get:JsonProperty("placeholder")
    @set:JsonProperty("placeholder")
    @JsonProperty("placeholder")
    var placeholder: String? = null

    @get:JsonProperty("focus")
    @set:JsonProperty("focus")
    @JsonProperty("focus")
    var focus: Boolean? = null

    @get:JsonProperty("disabled")
    @set:JsonProperty("disabled")
    @JsonProperty("disabled")
    var disabled: Boolean? = null

    @get:JsonProperty("hideFieldUnderline")
    @set:JsonProperty("hideFieldUnderline")
    @JsonProperty("hideFieldUnderline")
    var hideFieldUnderline: Boolean? = null

    @get:JsonProperty("indeterminate")
    @set:JsonProperty("indeterminate")
    @JsonProperty("indeterminate")
    var indeterminate: Boolean? = null

    @get:JsonProperty("floatLabel")
    @set:JsonProperty("floatLabel")
    @JsonProperty("floatLabel")
    var floatLabel: String? = null

    @get:JsonProperty("hideLabel")
    @set:JsonProperty("hideLabel")
    @JsonProperty("hideLabel")
    var hideLabel: Boolean? = null

    @get:JsonProperty("align")
    @set:JsonProperty("align")
    @JsonProperty("align")
    var align: String? = null

    @get:JsonProperty("color")
    @set:JsonProperty("color")
    @JsonProperty("color")
    var color: String? = null

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