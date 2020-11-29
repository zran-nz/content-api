package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseComponentAttachmentController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ComponentAttachmentService

@RestController
@RequestMapping("/v1/component-attachment")
class ComponentAttachmentController : BaseComponentAttachmentController()