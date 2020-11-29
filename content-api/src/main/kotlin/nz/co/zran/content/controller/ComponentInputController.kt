package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseComponentInputController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ComponentInputService

@RestController
@RequestMapping("/v1/component-input")
class ComponentInputController : BaseComponentInputController()