package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceChoiceOptionController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceChoiceOptionService

@RestController
@RequestMapping("/v1/resource-choice-option")
class ResourceChoiceOptionController : BaseResourceChoiceOptionController()