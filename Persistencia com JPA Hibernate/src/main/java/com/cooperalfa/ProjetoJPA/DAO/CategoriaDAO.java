package com.cooperalfa.ProjetoJPA.DAO;

import java.util.List;

import com.cooperalfa.model.Categoria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class CategoriaDAO {
	private EntityManager em;

	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(String nomeNovaCategoria) {
		if (verificaCategoriaExistente(nomeNovaCategoria) == false) {
			Categoria categoria = new Categoria(nomeNovaCategoria);
			this.em.getTransaction().begin();
			this.em.persist(categoria);
			this.em.getTransaction().commit();
			this.em.close();
			System.out.println("Nova categoria " + nomeNovaCategoria + " cadastrada no BD.");
		} else {
			System.out.println("A categoria desejada " + nomeNovaCategoria + " ja existe no DB.");
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

	public void deletar(Long IDCategoriaDeletar) {
		Categoria categoria = this.em.find(Categoria.class, IDCategoriaDeletar);
		this.em.getTransaction().begin();
		this.em.remove(categoria);
		this.em.getTransaction().commit();
		this.em.close();
		System.out.println("Categoria com ID " + IDCategoriaDeletar + " deletada do BD.");
	}

	public List<Categoria> consultarTodasCategoriasLista() {
		String comandoJPQL = ("SELECT categoria FROM Categoria categoria");
		List<Categoria> listaCategorias = this.em.createQuery(comandoJPQL, Categoria.class).getResultList();
		return listaCategorias;
	}

	public void ConsultaTodasCategorias() {
		String comandoJPQL = "SELECT categoria FROM Categoria categoria";
		List<Categoria> listaCategorias = this.em.createQuery(comandoJPQL, Categoria.class).getResultList();
		System.out.println("Nome");
		for (Categoria i : listaCategorias) {
			System.out.println(i.getNome());
		}
	}
	private boolean verificaCategoriaExistente(String nomeCategoria) {
		String comandoJPQL = "SELECT categoria FROM Categoria categoria";
		List<Categoria> listaCategoria = this.em.createQuery(comandoJPQL, Categoria.class).getResultList();
		boolean existeNoBanco = false;
		for (Categoria i : listaCategoria) {
			if (i.getNome().equals(nomeCategoria)) {
				existeNoBanco = true;
				return true;
			} else {
				existeNoBanco = false;
			}
		}
		return existeNoBanco;
	}

	public Categoria buscaCategoria(String nomeCategoria) {
		String comandoJPQL = "SELECT categoria FROM Categoria categoria WHERE categoria.nome LIKE :nomeCategoria";
		TypedQuery<Categoria> categoria = this.em.createQuery(comandoJPQL,Categoria.class);
		categoria.setParameter("nomeCategoria", nomeCategoria);
		return categoria.getSingleResult();
	} 
	
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
