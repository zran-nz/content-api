package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.BaseComponentDao
import nz.co.zran.cannon.content.entity.BaseComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BaseComponentService(
@Autowired
val dao: BaseComponentDao
) : BaseService<BaseComponent, Long>(dao = dao)
