package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceInputController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceInputService

@RestController
@RequestMapping("/v1/resource-input")
class ResourceInputController : BaseResourceInputController()