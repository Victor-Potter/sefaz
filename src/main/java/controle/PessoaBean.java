package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import dao.PessoaDAOApp;
import entidade.Endereco;
import entidade.Pessoa;
import util.JpaUtil;

@ManagedBean(name = "PessoaBean")
@RequestScoped
public class PessoaBean {
	private PessoaDAOApp pessoaDAO;
	private Pessoa pessoa;
	private Endereco endereco;
	private String cpf;
	
	private List<Pessoa> pessoas;
	
	private PessoaBean pessoaBean;
	private static final String NOVO = "pessoa/novo.xhtml";
	private static final String EDITAR = "pessoa/editar.xhtml";

	public PessoaBean () {
		/** Obtém a instancia de memória corrente */
		EntityManager instanceDeMemoria = JpaUtil.getEntityManager();

		/** Cria uma nova instancia em memória do pessoaDAO x12\32F = new PessoaDAO */
		this.pessoaDAO = new PessoaDAOApp(instanceDeMemoria);

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
	}

	public void novo() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect(NOVO);
	}

	public void editar(int id) throws IOException {
		this.pessoa = this.pessoaDAO.findById(id);
		FacesContext.getCurrentInstance().getExternalContext().redirect(EDITAR);
	}

	public boolean inserir() {
		// pessoa vai ser o objeto que vai ser montado de acordo com as informações lançadas pelo frontend.
		return this.pessoaDAO.inserir(pessoa);
	}
	
	public void atualizar() {
		this.pessoaDAO.editar(pessoa);
	}
	
	public void excluir() {
		this.pessoaDAO.excluir(pessoa);
	}
	
	public List<Pessoa> pesquisar(String nomePessoa) {
		return this.pessoaDAO.pesquisar(nomePessoa);
	}
 }
