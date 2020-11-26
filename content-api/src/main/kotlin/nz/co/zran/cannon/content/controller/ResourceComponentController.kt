package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceComponentController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceComponentService

@RestController
@RequestMapping("/v1/resource-component")
class ResourceComponentController : BaseResourceComponentController()