package nz.co.zran.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.content.dao.ComponentCKEditorDao
import nz.co.zran.content.entity.ComponentEditor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ComponentCKEditorService(
@Autowired
val dao: ComponentCKEditorDao
) : BaseService<ComponentEditor, Long>(dao = dao)
