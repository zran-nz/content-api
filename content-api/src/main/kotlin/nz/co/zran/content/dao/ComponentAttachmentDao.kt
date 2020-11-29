package nz.co.zran.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.content.entity.ComponentAttachment
import org.springframework.stereotype.Repository

@Repository
interface ComponentAttachmentDao : BaseDao<ComponentAttachment, Long>
