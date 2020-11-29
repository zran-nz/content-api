package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.BaseComponentDao
import nz.co.zran.content.entity.BaseComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BaseComponentService(
@Autowired
val dao: BaseComponentDao
) : BaseService<BaseComponent, Long>(dao = dao)
