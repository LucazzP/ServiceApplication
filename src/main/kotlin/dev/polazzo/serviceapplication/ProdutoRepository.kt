package dev.polazzo.serviceapplication

import org.springframework.data.jpa.repository.JpaRepository

public interface ProdutoRepository: JpaRepository<Produto, Int> {

}
