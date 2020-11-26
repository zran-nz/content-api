package nz.co.zran.cannon.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.cannon.content.entity.ResourceTextarea
import org.springframework.stereotype.Repository

@Repository
interface ResourceTextareaDao : BaseDao<ResourceTextarea, Long>
