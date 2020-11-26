package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceLinkController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceLinkService

@RestController
@RequestMapping("/v1/resource-link")
class ResourceLinkController : BaseResourceLinkController()