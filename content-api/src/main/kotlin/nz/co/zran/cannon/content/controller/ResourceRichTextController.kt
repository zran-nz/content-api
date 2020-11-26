package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseResourceRichTextController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ResourceRichTextService

@RestController
@RequestMapping("/v1/resource-rich-text")
class ResourceRichTextController : BaseResourceRichTextController()