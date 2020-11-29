package nz.co.zran.content.entity.json

import com.fasterxml.jackson.annotation.*
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("data-testid")
class Attributes {
    @get:JsonProperty("data-testid")
    @set:JsonProperty("data-testid")
    @JsonProperty("data-testid")
    var dataTestid: String? = null

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