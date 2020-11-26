package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ComponentTextareaDao
import nz.co.zran.cannon.content.entity.ComponentTextarea
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentTextareaService(
@Autowired
val dao: ComponentTextareaDao
) : BaseService<ComponentTextarea, Long>(dao = dao)
