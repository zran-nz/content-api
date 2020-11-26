package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceChoiceController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceChoiceService

@RestController
@RequestMapping("/v1/resource-choice")
class ResourceChoiceController : BaseResourceChoiceController()