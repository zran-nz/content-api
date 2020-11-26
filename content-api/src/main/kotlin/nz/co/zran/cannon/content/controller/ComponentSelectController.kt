package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseComponentSelectController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ComponentSelectService

@RestController
@RequestMapping("/v1/component-select")
class ComponentSelectController : BaseComponentSelectController()