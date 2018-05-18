package br.com.nx.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nx.model.Produto;
import br.com.nx.repository.ProdutosRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

	@Autowired
	private ProdutosRepository produtos;// <<< Repositório de produtos.

	@GetMapping("/{id}")
	public Produto buscar(@PathVariable Long id) {
		return produtos.findById(id).orElse(null);
	}

	@GetMapping
	public List<Produto> pesquisar() {
		return produtos.findAll();
	}

	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtos.save(produto);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtos.deleteById(id);
	}

}