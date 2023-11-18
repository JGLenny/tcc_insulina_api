package br.com.api_tcc2_diabetes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api_tcc2_diabetes.modelos.CalcularInsulina;
import br.com.api_tcc2_diabetes.service.CalcularInsulinaService;

@Controller
@RestController
public class CalcularInsulinaControllers {
	
	@Autowired
	private CalcularInsulinaService calcularInsulinaService;

	
	 @PostMapping("/calcularDoseInsulina")
	    public ResponseEntity<String> calcularDoseInsulina(@RequestBody CalcularInsulina calcularInsulina) {
	       
	    	double insulinDose = calcularInsulinaService.calcularDoseInsulina(calcularInsulina);
	       
	    	String response = "Aplicar a quantidade de : " + insulinDose + " ml de insulina.";

	        return ResponseEntity.ok(response);
	    }
}
