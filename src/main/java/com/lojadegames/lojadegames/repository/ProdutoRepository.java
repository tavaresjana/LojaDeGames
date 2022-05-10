package com.lojadegames.lojadegames.repository;

import java.util.List;

import com.lojadegames.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);
	//o Containing é parecido com o LIKE do MySQL
}
