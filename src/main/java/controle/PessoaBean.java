package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entidade.Endereco;
import entidade.Pessoa;

@ManagedBean(name = "PessoaBean")
@RequestScoped
public class PessoaBean {
	
	private Pessoa pessoa;
	private Endereco endereco;
	private String cpf;
	
	private List<Pessoa> pessoas;
	
	private PessoaBean pessoaBean;

	public PessoaBean () {
		this.pessoas = new ArrayList <Pessoa>();
		Pessoa usuario = new Pessoa ();
		
		usuario.setCpf("123.456.789-00");
		List<Endereco> enderecos = new ArrayList<Endereco>();
		usuario.setEndereco(enderecos);
		usuario.setIdade(31);
		usuario.setNome("Teste 1");
		usuario.setSexo("Masculino");
		usuario.setSenha("admin");
				
		this.pessoas.add(usuario);
		
		System.out.println(usuario);
	}
	
	public boolean inserir() {
		
	}
	
	public void editar() {}
	
	public void excluir() {}
	
	public String pesquisar() {}
	
	public List<Pessoa> listarUsuarios;
	

 }
