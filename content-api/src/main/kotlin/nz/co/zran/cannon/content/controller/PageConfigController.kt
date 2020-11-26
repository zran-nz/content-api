package nz.co.zran.cannon.content.controller

import nz.co.zran.cannon.content.controller.base.BasePageConfigController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.service.PageConfigService

@RestController
@RequestMapping("/v1/page-config")
class PageConfigController : BasePageConfigController()