package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceSelectDao
import nz.co.zran.cannon.content.entity.ResourceSelect
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceSelectService(
@Autowired
val dao: ResourceSelectDao
) : BaseService<ResourceSelect, Long>(dao = dao)
