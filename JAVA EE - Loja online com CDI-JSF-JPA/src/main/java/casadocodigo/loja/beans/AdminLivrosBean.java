package casadocodigo.loja.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;
import javax.transaction.Transactional;

import casadocodigo.loja.DAO.AutorDAO;
import casadocodigo.loja.DAO.LivroDAO;
import casadocodigo.loja.infra.FileSaver;
import casadocodigo.loja.models.Autor;
import casadocodigo.loja.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

	@Inject
	private LivroDAO livroDAO;
	@Inject
	private AutorDAO autorDAO;	
	@Inject
	private FacesContext context;
	
	private Part capaLivro;
	

	private Livro livro = new Livro();
	private List<Long> autoresId = new ArrayList<>();

	public AdminLivrosBean() {
		context = FacesContext.getCurrentInstance();
	}

	@Transactional // informa que esse metodo fas transação com DB
	public String cadastrar() throws IOException {
		for (Long autorId : autoresId) {
			livro.getAutores().add(new Autor(autorId));
		}
		System.out.println(livro.getAutores());
		livroDAO.cadastrar(livro);
		System.out.println("Livro cadastrado " + livro);

		FileSaver fileSaver =  new FileSaver();
		livro.setCapaPath(fileSaver.write(capaLivro, "livro"));
		
		
		
		context.getExternalContext().getFlash().setKeepMessages(true); // escopo de flash, serve para a mensagem durar
																		// mais de uma requisição
		context.addMessage(null, new FacesMessage("Novo livro cadastrado!"));
		livro = new Livro();

		return "/livros/lista?faces-redirect=true"; // vai redirecionar para nova tela pelo navegador
	}



	public List<Autor> getAutores() {
		List<Autor> listaAutores = autorDAO.buscaTodos();
		return listaAutores;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Long> getAutoresId() {
		return autoresId;
	}

	public void setAutoresId(List<Long> autoresId) {
		this.autoresId = autoresId;
	}

	public Part getCapaLivro() {
		return capaLivro;
	}

	public void setCapaLivro(Part capaLivro) {
		this.capaLivro = capaLivro;
	}
	
	

}
