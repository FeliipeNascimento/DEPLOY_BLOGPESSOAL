package org.generation.blogPessoal.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;


@Entity
@Table(name = "tb_usuario")
public class Usuario{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull(message = "O Nome não pode estar vazio")
		@Size(min = 2, max = 100, message = "O minimo são 2 caractares e o maximo são 100.")
		private String nome;
		
		@ApiModelProperty(example = "email@email.com.br")
		@NotNull(message = "O Usuario não pode estar vazio")
		@Size(min = 5 , max = 100, message = "O minimo são 2 caractares e o maximo são 100.")
		private String usuario;
		
		@NotNull(message = "A Senha não pode estar vazio")
		@Size(min = 5 , max = 100, message = "O minimo são 2 caractares e o maximo são 100.")
		private String senha;
		
	
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		
		
}
