package execoes;

public class Smartphone extends EntityAbstract{
    private Long IdSmartphone;
    private String chapa;
    private Modelo modelo;
    private Status Status;
    private Usuario usuario;
    
    
    
    
    
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getChapa() {
		return chapa;
	}
	public void setChapa(String chapa) {
		this.chapa = chapa;
	}
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		Status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	@Override
	public Long getId() {
		return IdSmartphone;
	}
    
    
    

    



}
