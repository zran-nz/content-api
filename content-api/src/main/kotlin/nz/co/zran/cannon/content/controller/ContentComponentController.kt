package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BaseContentComponentController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.ContentComponentService

@RestController
@RequestMapping("/v1/content-component")
class ContentComponentController : BaseContentComponentController()