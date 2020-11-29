package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseBaseComponentController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.BaseComponentService

@RestController
@RequestMapping("/v1/base-component")
class BaseComponentController : BaseBaseComponentController()