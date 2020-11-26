package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceInputDao
import nz.co.zran.cannon.content.entity.ResourceInput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceInputService(
@Autowired
val dao: ResourceInputDao
) : BaseService<ResourceInput, Long>(dao = dao)
