package br.com.api_tcc2_diabetes.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.api_tcc2_diabetes.modelos.Usuario;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
	@Query("select u from Usuario u where u.id = ?1")
	List<Usuario> buscaUsuarioPorId(Long id);

	@Query("select u from Usuario u where upper(trim(u.login_usuario)) like %?1%")
	List<Usuario> buscaUsuarioLogin(String login_usuario);

}
