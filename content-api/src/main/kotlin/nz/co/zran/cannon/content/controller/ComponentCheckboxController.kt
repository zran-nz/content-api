package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseComponentCheckboxController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ComponentCheckboxService

@RestController
@RequestMapping("/v1/component-checkbox")
class ComponentCheckboxController : BaseComponentCheckboxController()