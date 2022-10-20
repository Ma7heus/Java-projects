package casadocodigo.loja.DAO;

import javax.ejb.Stateless;

import casadocodigo.loja.models.Autor;

@Stateless
public class AutorDAO extends GenericDAO<Autor, Long> {

	public AutorDAO() {
		super(Autor.class);
	}

}
