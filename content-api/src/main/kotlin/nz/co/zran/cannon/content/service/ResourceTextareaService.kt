package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceTextareaDao
import nz.co.zran.cannon.content.entity.ResourceTextarea
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceTextareaService(
@Autowired
val dao: ResourceTextareaDao
) : BaseService<ResourceTextarea, Long>(dao = dao)
