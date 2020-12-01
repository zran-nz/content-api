package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseComponentCKEditorController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ComponentCKEditorService

@RestController
@RequestMapping("/v1/component-c-k-editor")
class ComponentCKEditorController : BaseComponentCKEditorController()