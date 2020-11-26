package nz.co.zran.cannon.content.service

import com.github.b1412.api.service.BaseService
import nz.co.zran.cannon.content.dao.PageConfigDao
import nz.co.zran.cannon.content.entity.PageConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class PageConfigService(
@Autowired
val dao: PageConfigDao
) : BaseService<PageConfig, Long>(dao = dao)
