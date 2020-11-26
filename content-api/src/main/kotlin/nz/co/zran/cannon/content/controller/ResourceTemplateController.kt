package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceTemplateController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceTemplateService

@RestController
@RequestMapping("/v1/resource-template")
class ResourceTemplateController : BaseResourceTemplateController()