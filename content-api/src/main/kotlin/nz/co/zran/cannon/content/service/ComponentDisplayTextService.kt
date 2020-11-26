package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ComponentDisplayTextDao
import nz.co.zran.cannon.content.entity.ComponentDisplayText
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentDisplayTextService(
@Autowired
val dao: ComponentDisplayTextDao
) : BaseService<ComponentDisplayText, Long>(dao = dao)
