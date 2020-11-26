package nz.co.zran.cannon.content

import com.github.b1412.generator.client.HttpJsonGenerator
import com.github.b1412.generator.ktGenerator

fun main() {
    ktGenerator(
            config = "generator.properties",
            additionalTasks = listOf(HttpJsonGenerator(mapOf(
                    "devUrl" to "http://dev.workspace.zran.co.nz/api/v1",
                    "devUsername" to "admin",
                    "devPassword" to "1qazxsw2",
                    "testUrl" to "https://test.zran.co.nz//api/v1",
                    "testUsername" to "admin",
                    "testPassword" to "1qazxsw2"
            )))
    )
}
