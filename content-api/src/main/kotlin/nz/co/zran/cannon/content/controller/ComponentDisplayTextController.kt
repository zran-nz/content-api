package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseComponentDisplayTextController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ComponentDisplayTextService

@RestController
@RequestMapping("/v1/component-display-text")
class ComponentDisplayTextController : BaseComponentDisplayTextController()