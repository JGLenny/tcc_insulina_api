package br.com.api_tcc2_diabetes.service;

import org.springframework.stereotype.Service;

import br.com.api_tcc2_diabetes.modelos.CalcularInsulina;

@Service
public class CalcularInsulinaService {
	

	// carboidrato: quantas de insulina por grama de carboidrato
	private static final double CARB_RATIO = 0.5;

	// Fator de sensibilidade à insulina: quantas unidades de insulina por mg/dL de
	// glicose acima do alvo
	private static final double SENSITIVITY_FACTOR = 0.1;

	public double calcularDoseInsulina(CalcularInsulina calcularInsulina) {
	
		double doseCarb = calcularInsulina.getQuantidadeCarboidrato() * CARB_RATIO;
		double correcaoGlicose = (calcularInsulina.getNivelDeGlicose() - 100) * SENSITIVITY_FACTOR;

		double totalDoseAplicar = doseCarb + correcaoGlicose;

		return totalDoseAplicar;
		
		
	}

}
