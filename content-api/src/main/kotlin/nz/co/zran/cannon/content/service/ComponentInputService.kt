package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ComponentInputDao
import nz.co.zran.cannon.content.entity.ComponentInput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentInputService(
@Autowired
val dao: ComponentInputDao
) : BaseService<ComponentInput, Long>(dao = dao)
