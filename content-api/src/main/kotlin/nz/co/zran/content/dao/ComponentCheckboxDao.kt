package nz.co.zran.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.content.entity.ComponentCheckbox
import org.springframework.stereotype.Repository

@Repository
interface ComponentCheckboxDao : BaseDao<ComponentCheckbox, Long>
