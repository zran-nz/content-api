package nz.co.zran.cannon.content.entity.json

import com.fasterxml.jackson.annotation.*
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("key", "path")
class KeyPath {
    @get:JsonProperty("key")
    @set:JsonProperty("key")
    @JsonProperty("key")
    var key: String? = null

    @get:JsonProperty("path")
    @set:JsonProperty("path")
    @JsonProperty("path")
    var path: List<String>? = null

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