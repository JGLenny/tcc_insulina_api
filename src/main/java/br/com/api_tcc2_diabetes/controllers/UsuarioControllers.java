package br.com.api_tcc2_diabetes.controllers;

import javax.validation.Valid;

import java.util.List;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api_tcc2_diabetes.ExceptionTccDiabetes;
import br.com.api_tcc2_diabetes.modelos.Usuario;
import br.com.api_tcc2_diabetes.repository.UsuarioRepository;
import br.com.api_tcc2_diabetes.service.UsuarioService;

@Controller
@RestController
public class UsuarioControllers {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@ResponseBody
	@PostMapping(value = "**/cadastrarUsuario")
	public ResponseEntity<Usuario> salvarUsuario(@RequestBody @Valid Usuario usuario) throws ExceptionTccDiabetes {

	

		Usuario usuario1 = usuarioService.cadastrarUsuario(usuario);

	

		return new ResponseEntity<Usuario>(usuario1, HttpStatus.OK);

	}
	
	@ResponseBody
	@DeleteMapping(value = "**/excluirUsuario/{id}")
	public ResponseEntity<?> excluirUsuario(@PathVariable("id") Long id) throws ExceptionTccDiabetes {

		List<Usuario> usuarios = usuarioRepository.buscaUsuarioPorId(id);
		if (usuarios.isEmpty()) {
			throw new ExceptionTccDiabetes(
					"O Usuário com código: " + id + " não localizado no Banco de Dados");
		}
		
		usuarioRepository.deleteById(id);

		return new ResponseEntity("Usuario deletado por Id com sucesso!", HttpStatus.OK);

}
	//aqui comeca
	@ResponseBody
	@GetMapping(value = "**/listaUsuario")
	public ResponseEntity<List<Usuario>> listaUsuario() {

		List<Usuario> usuario = usuarioRepository.findAll();

		return new ResponseEntity<List<Usuario>>(usuario, HttpStatus.OK);

	}
	//aqui finaliza
	
		
}
