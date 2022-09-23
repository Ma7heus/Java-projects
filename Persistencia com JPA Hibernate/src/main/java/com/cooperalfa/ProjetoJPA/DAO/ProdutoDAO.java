package com.cooperalfa.ProjetoJPA.DAO;

import java.math.BigDecimal;
import java.util.List;

import com.cooperalfa.model.Categoria;
import com.cooperalfa.model.Produto;
import jakarta.persistence.EntityManager;

public class ProdutoDAO {
	private EntityManager em;

	public ProdutoDAO(EntityManager em) {
		this.em = em;
	}
	
	public ProdutoDAO() {
	}

	public void cadastrar(String nomeNovoProduto,BigDecimal preco,Categoria categoria) {
		boolean produtoAlreadyExist = verificaProdutoExistente(nomeNovoProduto);
		if (produtoAlreadyExist) {
			System.out.println("O produto que esta desejanco cadastrar ja existe no DB!");
		} else {
			Produto produto = new Produto(nomeNovoProduto,preco,categoria);
			this.em.getTransaction().begin();
			this.em.persist(produto);
			this.em.getTransaction().commit();
			this.em.close();
			System.out.println("Novo produto " + nomeNovoProduto + " cadastrado no DB!");
		}		
	}
	
	
	public void atualizar(Long idCategoria, String novoNome) {
		Categoria categoria = this.em.find(Categoria.class, idCategoria);
		this.em.getTransaction().begin();
		categoria.setNome(novoNome);
		this.em.merge(categoria);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public void deletar(Long IDProdutoDeletar) {
		Produto produto = this.em.find(Produto.class, IDProdutoDeletar);
		this.em.getTransaction().begin();
		this.em.remove(produto);
		this.em.getTransaction().commit();
		this.em.close();
		System.out.println("Produto com ID " + IDProdutoDeletar + " deletada do BD.");
	}

	public List<Produto> consultarTodosProdutosLista() {
		String comandoJPQL = ("SELECT produto FROM Produto produto");
		List<Produto> listaProduto = this.em.createQuery(comandoJPQL, Produto.class).getResultList();
		return listaProduto;
	}

	public void ConsultaTodosProdutos() {
		String comandoJPQL = "SELECT produto FROM Produto produto";
		List<Produto> listaProduto = this.em.createQuery(comandoJPQL, Produto.class).getResultList();
		System.out.println("Descricao");
		for (Produto i : listaProduto) {
			System.out.println(i.getDescricao());
		}
	}

	private boolean verificaProdutoExistente(String nomeProduto) {
		String comandoJPQL = "SELECT produto FROM Produto produto";
		List<Produto> listaProduto = this.em.createQuery(comandoJPQL, Produto.class).getResultList();
		boolean existeNoBanco = false;
		for (Produto i : listaProduto) {
			if (i.getDescricao().equals(nomeProduto)) {
				existeNoBanco = true;
				return true;
			} else {
				existeNoBanco = false;
			}
		}
		return existeNoBanco;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}=-
