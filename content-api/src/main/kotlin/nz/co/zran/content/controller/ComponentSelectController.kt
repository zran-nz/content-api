package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseComponentSelectController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ComponentSelectService

@RestController
@RequestMapping("/v1/component-select")
class ComponentSelectController : BaseComponentSelectController()