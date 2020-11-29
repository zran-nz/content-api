package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseComponentQuizChoiceController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ComponentQuizChoiceService

@RestController
@RequestMapping("/v1/component-quiz-choice")
class ComponentQuizChoiceController : BaseComponentQuizChoiceController()