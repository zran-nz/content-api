package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceAttachmentDao
import nz.co.zran.cannon.content.entity.ResourceAttachment
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceAttachmentService(
@Autowired
val dao: ResourceAttachmentDao
) : BaseService<ResourceAttachment, Long>(dao = dao)
