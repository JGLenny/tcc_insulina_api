package br.com.api_tcc2_diabetes.modelos;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;

	@NotNull(message = "O Login do Usuario deve ser Informado")
	@Column(nullable = false, unique = true)
	private String login_usuario;

	@NotNull(message = "A senha deve ser Informada")
	@Column(nullable = false)
	private String senha_usuario;

	@NotNull(message = "O nome do Usuario deve ser Informado")
	@Column(nullable = false)
	private String nome_usuario;

	@NotNull(message = "O sexo do Usuario deve ser Informado")
	@Column(nullable = false)
	private char sexo_usuario;

	@NotNull(message = "A Idade do Usuario deve ser Informado")
	@Column(nullable = false)
	private Integer idade_usuario;

	@NotNull(message = "O Email do Usuario deve ser Informado")
	@Column(nullable = false)
	private String email_usuario;
	
	
	

	public Integer getIdade_usuario() {
		return idade_usuario;
	}

	public void setIdade_usuario(Integer idade_usuario) {
		this.idade_usuario = idade_usuario;
	}

	public char getSexo_usuario() {
		return sexo_usuario;
	}

	public void setSexo_usuario(char sexo_usuario) {
		this.sexo_usuario = sexo_usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin_usuario() {
		return login_usuario;
	}

	public void setLogin_usuario(String login_usuario) {
		this.login_usuario = login_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}