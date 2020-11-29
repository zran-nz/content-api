package nz.co.zran.content.controller

import nz.co.zran.content.controller.base.BaseContentComponentController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.content.service.ContentComponentService

@RestController
@RequestMapping("/v1/content-component")
class ContentComponentController : BaseContentComponentController()