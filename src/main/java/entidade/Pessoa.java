package entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "PESSOA")
public class Pessoa {
	@Id
	@Column
	@SequenceGenerator(name = "S_PESSOA", sequenceName = "S_PESSOA", allocationSize = 1)
	private int id;
	@Column
	private String nome;
	@Id
	@Column
	private String cpf;
	@Column
	private int idade;
	@Column
	private String sexo;
	@Column
	private String senha = "admin";
	
	@OneToMany (mappedBy="PESSOA_ID", cascade= CascadeType.ALL)
	private List<Endereco> endereco;
	
	public void setId(int value) {
		this.id = value;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

}
