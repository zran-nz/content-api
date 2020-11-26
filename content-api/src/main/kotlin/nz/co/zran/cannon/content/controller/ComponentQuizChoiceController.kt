package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseComponentQuizChoiceController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ComponentQuizChoiceService

@RestController
@RequestMapping("/v1/component-quiz-choice")
class ComponentQuizChoiceController : BaseComponentQuizChoiceController()