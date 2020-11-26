package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceTemplateDao
import nz.co.zran.cannon.content.entity.ResourceTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceTemplateService(
@Autowired
val dao: ResourceTemplateDao
) : BaseService<ResourceTemplate, Long>(dao = dao)
