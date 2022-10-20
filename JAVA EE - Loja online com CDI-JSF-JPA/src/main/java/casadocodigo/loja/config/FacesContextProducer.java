package casadocodigo.loja.config;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

public class FacesContextProducer {

	@RequestScoped //ele nao pode ser criado a todo momento, então ele dura somente o durante a vida do escopo da request
	@Produces  //para criar o objeto
	public FacesContext getFacesComponent() {
		return FacesContext.getCurrentInstance();
	}
	
}
