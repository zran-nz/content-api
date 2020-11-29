package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseComponentRadioController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ComponentRadioService

@RestController
@RequestMapping("/v1/component-radio")
class ComponentRadioController : BaseComponentRadioController()