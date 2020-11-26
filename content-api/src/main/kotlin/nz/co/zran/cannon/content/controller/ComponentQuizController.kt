package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseComponentQuizController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ComponentQuizService

@RestController
@RequestMapping("/v1/component-quiz")
class ComponentQuizController : BaseComponentQuizController()