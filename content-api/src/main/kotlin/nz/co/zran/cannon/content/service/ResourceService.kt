package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceDao
import nz.co.zran.cannon.content.entity.Resource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceService(
@Autowired
val dao: ResourceDao
) : BaseService<Resource, Long>(dao = dao)
