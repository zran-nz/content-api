package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.ComponentQuizChoiceDao
import nz.co.zran.content.entity.ComponentQuizChoice
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentQuizChoiceService(
@Autowired
val dao: ComponentQuizChoiceDao
) : BaseService<ComponentQuizChoice, Long>(dao = dao)
