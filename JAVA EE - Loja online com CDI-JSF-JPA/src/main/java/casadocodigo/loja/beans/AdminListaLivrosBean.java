package casadocodigo.loja.beans;


import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import casadocodigo.loja.DAO.AutorDAO;
import casadocodigo.loja.DAO.LivroDAO;
import casadocodigo.loja.models.Livro;
 
@Model  //Named e request scoped junto
public class AdminListaLivrosBean {
	
	@Inject
	LivroDAO livroDAO;
	
	@Inject
	AutorDAO autorDAO;
	
	private List<Livro> livros = new ArrayList<>();

	public List<Livro> getLivros() {
		this.livros = livroDAO.buscaTodos();
		return livros;
	}

	
}
