package nz.co.zran.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.content.entity.ComponentInput
import org.springframework.stereotype.Repository

@Repository
interface ComponentInputDao : BaseDao<ComponentInput, Long>
