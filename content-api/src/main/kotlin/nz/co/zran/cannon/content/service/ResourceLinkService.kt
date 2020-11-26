package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceLinkDao
import nz.co.zran.cannon.content.entity.ResourceLink
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceLinkService(
@Autowired
val dao: ResourceLinkDao
) : BaseService<ResourceLink, Long>(dao = dao)
