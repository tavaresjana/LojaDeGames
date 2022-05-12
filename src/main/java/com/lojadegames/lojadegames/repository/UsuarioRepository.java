package com.lojadegames.lojadegames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojadegames.lojadegames.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
/*Optional:
- É do JAVA mesmo
- Quando não se sabe qual tipo de resposta pode ter ao buscar na requisição e 
tem mais de uma possível
- Basicamente que nem o List (Mas este só tem duas respostas, o Optional várias) */
	
	// quando temos mais de uma possivel resposta, usamos o optional para preparar a função pra receber mais de um resultado 
	public Optional<Usuario> findByUsuario(String usuario);

}