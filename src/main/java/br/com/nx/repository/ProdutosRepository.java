package br.com.nx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nx.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {

}
