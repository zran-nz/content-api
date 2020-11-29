package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.ComponentAttachmentDao
import nz.co.zran.content.entity.ComponentAttachment
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentAttachmentService(
@Autowired
val dao: ComponentAttachmentDao
) : BaseService<ComponentAttachment, Long>(dao = dao)
