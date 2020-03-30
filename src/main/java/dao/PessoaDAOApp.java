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

	public Pessoa findById(int id) {
		return conn.find(Pessoa.class, id);
	}
	
	public void editar (Pessoa pessoa) {
		/** Obt�m o objeto da transa��o com o banco de dados via entityManager */
		EntityTransaction tx = conn.getTransaction();
		
		try {
			/** Iniciando transa��o com o banco de dados */
			tx.begin();
			
			/** Realizar opera��o de update na tabela do banco */
			conn.persist(pessoa);

			/** Commita ou executa ou finaliza a transa��o proposta */
			tx.commit();
			
		} catch (Exception variavelException) {
			/** em caso de exce��o dever� da rollback na transa��o */
			tx.rollback();
		}
	}
	
	public void excluir (Pessoa pessoa) {
		EntityTransaction tx = conn.getTransaction();
		tx.begin();
		
		conn.persist(pessoa);
	}

	public List<Pessoa> pesquisar(String nomePessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Endereco> selecionarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
