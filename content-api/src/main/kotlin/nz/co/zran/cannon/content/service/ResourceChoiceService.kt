package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceChoiceDao
import nz.co.zran.cannon.content.entity.ResourceChoice
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceChoiceService(
@Autowired
val dao: ResourceChoiceDao
) : BaseService<ResourceChoice, Long>(dao = dao)
