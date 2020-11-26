package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.ResourceRichTextDao
import nz.co.zran.cannon.content.entity.ResourceRichText
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ResourceRichTextService(
@Autowired
val dao: ResourceRichTextDao
) : BaseService<ResourceRichText, Long>(dao = dao)
