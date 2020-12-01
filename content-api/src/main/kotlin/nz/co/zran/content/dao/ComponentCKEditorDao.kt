package nz.co.zran.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.content.entity.ComponentEditor
import org.springframework.stereotype.Repository

@Repository
interface ComponentCKEditorDao : BaseDao<ComponentEditor, Long>
