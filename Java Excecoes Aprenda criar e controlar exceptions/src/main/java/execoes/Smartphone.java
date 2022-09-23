package execoes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "smartphones")
public class Smartphone extends EntityAbstract{
    @Id
    @SequenceGenerator(name = "Smartphone_Generator",sequenceName = "idSmartphone",allocationSize = 1)
    @GeneratedValue(generator = "Smartphone_Generator",strategy = GenerationType.SEQUENCE)
	private Long IdSmartphone;
    private String chapa;
    @ManyToOne
    private Modelo modelo;
    @ManyToOne
    private Status Status;
    @OneToOne
    private Usuario usuario;
        
    
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
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
