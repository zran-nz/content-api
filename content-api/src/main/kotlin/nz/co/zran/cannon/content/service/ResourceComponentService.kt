package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceComponentDao
import nz.co.zran.cannon.content.entity.ResourceComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceComponentService(
@Autowired
val dao: ResourceComponentDao
) : BaseService<ResourceComponent, Long>(dao = dao)
