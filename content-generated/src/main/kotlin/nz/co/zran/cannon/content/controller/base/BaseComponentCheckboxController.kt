package nz.co.zran.cannon.content.controller.base

import com.github.b1412.api.controller.BaseController
import org.springframework.web.bind.annotation.RestController
import nz.co.zran.cannon.content.entity.ComponentCheckbox
import com.github.b1412.json.GraphRender
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.util.UriComponentsBuilder

@Transactional
abstract class BaseComponentCheckboxController : BaseController<ComponentCheckbox, Long>() {

    @GraphRender("componentCheckbox")
    @GetMapping
    override fun page(request: HttpServletRequest, @RequestParam filter: Map<String, String>, pageable: Pageable): ResponseEntity<*> {
        return super.page(request, filter,pageable)
    }

    @GraphRender("componentCheckbox")
    @GetMapping("{id}")
    override fun findOne(@PathVariable id: Long, request: HttpServletRequest): ResponseEntity<*> {
        return super.findOne(id, request)
    }

    @PostMapping
    override fun saveOne(@Validated @RequestBody input: ComponentCheckbox, request: HttpServletRequest, uriComponent: UriComponentsBuilder): ResponseEntity<*> {
        return super.saveOne(input, request, uriComponent)
    }

    @PutMapping("{id}")
    override fun updateOne(@PathVariable id: Long, @Validated @RequestBody input: ComponentCheckbox, request: HttpServletRequest): ResponseEntity<*> {
        return super.updateOne(id, input, request)
    }

    @DeleteMapping("{id}")
    override fun deleteOne(@PathVariable id: Long, request: HttpServletRequest): ResponseEntity<*> {
       return super.deleteOne(id,request)
    }
}