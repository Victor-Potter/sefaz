package dao;

import java.util.List;

import entidade.Endereco;
import entidade.Pessoa;

public interface PessoaDAO {
	
	boolean inserir (Pessoa pessoa);
	
	void editar (Pessoa pessoa);
	
	void excluir (Pessoa pessoa);
	
	List<Pessoa> pesquisar(String nomePessoa);
	
	List<Endereco> selecionarTodos();

	Pessoa findById(int id);
}