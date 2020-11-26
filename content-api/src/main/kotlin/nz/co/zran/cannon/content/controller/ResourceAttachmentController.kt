package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceAttachmentController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceAttachmentService

@RestController
@RequestMapping("/v1/resource-attachment")
class ResourceAttachmentController : BaseResourceAttachmentController()