package dao;

import java.util.List;

import entidade.Endereco;
import entidade.Pessoa;

public interface PessoaDAO {
	
	public boolean inserir (Pessoa pessoa);
	
	public void editar (Pessoa pessoa);
	
	public void excluir (Pessoa pessoa);
	
	public Pessoa pesquisar(String cpf);
	
	public List<Endereco> selecionarTodos();

}