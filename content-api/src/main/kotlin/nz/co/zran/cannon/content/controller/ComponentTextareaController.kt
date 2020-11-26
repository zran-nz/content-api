package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseComponentTextareaController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ComponentTextareaService

@RestController
@RequestMapping("/v1/component-textarea")
class ComponentTextareaController : BaseComponentTextareaController()