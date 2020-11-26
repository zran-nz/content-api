package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ComponentRadioDao
import nz.co.zran.cannon.content.entity.ComponentRadio
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentRadioService(
@Autowired
val dao: ComponentRadioDao
) : BaseService<ComponentRadio, Long>(dao = dao)
