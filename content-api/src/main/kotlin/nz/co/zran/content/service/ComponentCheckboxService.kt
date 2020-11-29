package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.ComponentCheckboxDao
import nz.co.zran.content.entity.ComponentCheckbox
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentCheckboxService(
@Autowired
val dao: ComponentCheckboxDao
) : BaseService<ComponentCheckbox, Long>(dao = dao)
