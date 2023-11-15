package br.com.api_tcc2_diabetes.controllers;

import javax.validation.Valid;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api_tcc2_diabetes.ExceptionTccDiabetes;
import br.com.api_tcc2_diabetes.modelos.Usuario;
import br.com.api_tcc2_diabetes.service.UsuarioService;

@Controller
@RestController
public class UsuarioControllers {
	
	@Autowired
	UsuarioService usuarioService;
	
	
	@ResponseBody
	@PostMapping(value = "**/cadastrarUsuario")
	public ResponseEntity<Usuario> salvarUsuario(@RequestBody @Valid Usuario usuario) throws ExceptionTccDiabetes {

	

		Usuario usuario1 = usuarioService.cadastrarUsuario(usuario);

	

		return new ResponseEntity<Usuario>(usuario1, HttpStatus.OK);

	}

}
