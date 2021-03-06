package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.ComponentDisplayTextDao
import nz.co.zran.content.entity.ComponentDisplayText
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentDisplayTextService(
@Autowired
val dao: ComponentDisplayTextDao
) : BaseService<ComponentDisplayText, Long>(dao = dao)
