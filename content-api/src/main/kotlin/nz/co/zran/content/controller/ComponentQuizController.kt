package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseComponentQuizController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ComponentQuizService

@RestController
@RequestMapping("/v1/component-quiz")
class ComponentQuizController : BaseComponentQuizController()