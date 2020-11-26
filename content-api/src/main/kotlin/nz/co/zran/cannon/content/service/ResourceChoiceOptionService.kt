package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceChoiceOptionDao
import nz.co.zran.cannon.content.entity.ResourceChoiceOption
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceChoiceOptionService(
@Autowired
val dao: ResourceChoiceOptionDao
) : BaseService<ResourceChoiceOption, Long>(dao = dao)
