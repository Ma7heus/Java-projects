package casadocodigo.loja.DAO;
import javax.ejb.Stateless;

import casadocodigo.loja.models.Livro;
@Stateless
public class LivroDAO extends GenericDAO<Livro,Long>{

	public LivroDAO() {
		super(Livro.class);
	}

}
