package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceSelectController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceSelectService

@RestController
@RequestMapping("/v1/resource-select")
class ResourceSelectController : BaseResourceSelectController()