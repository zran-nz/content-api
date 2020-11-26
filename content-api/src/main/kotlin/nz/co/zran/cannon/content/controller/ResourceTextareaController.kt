package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceTextareaController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceTextareaService

@RestController
@RequestMapping("/v1/resource-textarea")
class ResourceTextareaController : BaseResourceTextareaController()