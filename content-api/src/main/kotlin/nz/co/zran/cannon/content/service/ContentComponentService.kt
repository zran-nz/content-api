package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ContentComponentDao
import nz.co.zran.cannon.content.entity.ContentComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ContentComponentService(
@Autowired
val dao: ContentComponentDao
) : BaseService<ContentComponent, Long>(dao = dao)
