package dev.polazzo.serviceapplication

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produto")
class ProdutoResource(@Autowired private val repository: ProdutoRepository) {

    @GetMapping("/{id}")
    fun getOne(@PathVariable("id") id: Int): Produto {
        return repository.getById(id)
    }

    @GetMapping
    fun getAll(): List<Produto> {
        return repository.findAll()
    }

    @PostMapping
    fun add(@RequestBody produto: Produto): Produto {
        return repository.save(produto)
    }

    @PutMapping
    fun update(@RequestBody produto: Produto): Produto {
        val produtoOnRepo = repository.getById(produto.id)
        return repository.save(
            produtoOnRepo.copy(
                nome = produto.nome,
                anoFabricacao = produto.anoFabricacao,
                ean = produto.ean
            )
        )
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Int): ResponseEntity<Void> {
        repository.deleteById(id)
        return ResponseEntity.ok().build()
    }
}
