package br.com.api_tcc2_diabetes.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CalcularInsulina")
@SequenceGenerator(name = "seq_calcular_insulina", sequenceName = "seq_calcular_insulina", allocationSize = 1, initialValue = 1)
public class CalcularInsulina implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_calcular_insulina")
	private Long id;


	private double quantidadeCarboidrato; // Quantidade de carboidratos em ml
	
	private double nivelDeGlicose; // Nível de glicose no sangue em mg/dL
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	

	public double getQuantidadeCarboidrato() {
		return quantidadeCarboidrato;
	}
	public void setQuantidadeCarboidrato(double quantidadeCarboidrato) {
		this.quantidadeCarboidrato = quantidadeCarboidrato;
	}
	public double getNivelDeGlicose() {
		return nivelDeGlicose;
	}
	public void setNivelDeGlicose(double nivelDeGlicose) {
		this.nivelDeGlicose = nivelDeGlicose;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalcularInsulina other = (CalcularInsulina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
