package dev.polazzo.serviceapplication

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produto")
class ProdutoResource {
    @GetMapping("/{id}")
    fun getOne(@PathVariable("id") id: Int): Produto {
        return Produto(id, "Chave de fenda", 2021, "123")
    }

    @GetMapping
    fun getAll(): ArrayList<Produto> {
        return arrayListOf(
            Produto(1, "Chave de fenda", 2021, "123"),
            Produto(2, "Chave de rosca", 2021, "124"),
        )
    }

    @PostMapping
    fun add(@RequestBody produto: Produto): Produto {
        return produto
    }

    @PutMapping
    fun update(@RequestBody produto: Produto): Produto {
        return produto
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Int) {}
}
