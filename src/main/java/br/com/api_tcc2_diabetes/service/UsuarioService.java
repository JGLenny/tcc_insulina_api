package br.com.api_tcc2_diabetes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api_tcc2_diabetes.modelos.Usuario;
import br.com.api_tcc2_diabetes.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario cadastrarUsuario(Usuario usuario) {

		

		Usuario novoUsuario = new Usuario();
		novoUsuario.setEmail_usuario(usuario.getEmail_usuario());
		novoUsuario.setLogin_usuario(usuario.getLogin_usuario());
		novoUsuario.setNome_usuario(usuario.getNome_usuario());
		novoUsuario.setSenha_usuario(usuario.getSenha_usuario());
	    novoUsuario.setSexo_usuario(usuario.getSexo_usuario());
	    novoUsuario.setIdade_usuario(usuario.getIdade_usuario());

		usuarioRepository.save(novoUsuario);

		return novoUsuario;
	}


}
