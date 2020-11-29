package nz.co.zran.content

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(
        scanBasePackages = ["com.github.b1412.*", "nz.co.zran.*"],
        exclude = [
            SecurityAutoConfiguration::class,
            ApplicationAvailabilityAutoConfiguration::class]
)
@EntityScan("com.github.b1412.*", "nz.co.zran.*")
class ContentApp

fun main(args: Array<String>) {
    runApplication<ContentApp>(*args)
}
