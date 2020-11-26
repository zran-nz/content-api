package nz.co.zran.cannon.content.config

import com.github.b1412.api.dao.BaseDaoImpl
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableJpaRepositories(basePackages = [
     "nz.co.zran.cannon.*.dao"
], repositoryBaseClass = BaseDaoImpl::class)
@EnableTransactionManagement
class CannonJpaConfig
