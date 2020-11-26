package nz.co.zran.cannon.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.cannon.content.entity.ResourceComponent
import org.springframework.stereotype.Repository

@Repository
interface ResourceComponentDao : BaseDao<ResourceComponent, Long>
