package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.ComponentSelectDao
import nz.co.zran.content.entity.ComponentSelect
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentSelectService(
@Autowired
val dao: ComponentSelectDao
) : BaseService<ComponentSelect, Long>(dao = dao)
