package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.ComponentQuizDao
import nz.co.zran.content.entity.ComponentQuiz
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentQuizService(
@Autowired
val dao: ComponentQuizDao
) : BaseService<ComponentQuiz, Long>(dao = dao)
