package nz.co.zran.cannon.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.cannon.content.entity.ComponentInput
import org.springframework.stereotype.Repository

@Repository
interface ComponentInputDao : BaseDao<ComponentInput, Long>
