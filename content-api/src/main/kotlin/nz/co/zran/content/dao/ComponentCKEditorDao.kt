package nz.co.zran.content.dao

import com.github.b1412.api.dao.BaseDao
import nz.co.zran.content.entity.ComponentCKEditor
import org.springframework.stereotype.Repository

@Repository
interface ComponentCKEditorDao : BaseDao<ComponentCKEditor, Long>
