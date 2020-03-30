package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Endereco;
import entidade.Pessoa;

public class PessoaDAOApp implements PessoaDAO {
	
	private EntityManager conn;
	
	public PessoaDAOApp(EntityManager conn) {
		this.conn = conn;
	}
	
	
	public boolean inserir (Pessoa pessoa) {
		
		EntityTransaction tx = conn.getTransaction();
		tx.begin();

		conn.persist(pessoa);
		tx.commit();

		return true;
	}
	
	public void editar (Pessoa pessoa) {
		/** Obtém o objeto da transação com o banco de dados via entityManager */
		EntityTransaction tx = conn.getTransaction();
		
		try {
			/** Iniciando transação com o banco de dados */
			tx.begin();
			
			/** Realizar operação de update na tabela do banco */
			conn.persist(pessoa);

			/** Commita ou executa ou finaliza a transação proposta */
			tx.commit();
			
		} catch (Exception variavelException) {
			/** em caso de exceção deverá da rollback na transação */
			tx.rollback();
		}
	}
	
	public void excluir (Pessoa pessoa) {
		EntityTransaction tx = conn.getTransaction();
		tx.begin();
		
		conn.persist(pessoa);
	}


	@Override
	public Pessoa pesquisar(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Endereco> selecionarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
