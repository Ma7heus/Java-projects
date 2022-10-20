package casadocodigo.loja.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "livro_casadocodigo")
public class Livro {
	
	@Id
	@SequenceGenerator(name = "LIVRO_GENERATOR", sequenceName = "sequence_livro",allocationSize = 1)
	@GeneratedValue(generator = "LIVRO_GENERATOR",strategy = GenerationType.SEQUENCE)
	private Long idLivro;
	@NotBlank //nao vazio
	private String titulo;
	
	@Lob   // informa que a descrição pode ser um valor muito extenso
	@NotBlank
	private String descricao;
	@DecimalMin("20")
	private BigDecimal preco;
	
	@Min(50)
	private Integer numeroPaginas;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@Size(min = 1)
	@NotNull
	private List<Autor> autores = new ArrayList<>();

	@Temporal(TemporalType.DATE)
	private Date dataPublicacao;
	
	private String capaPath;

	public Livro() {
	}
	
	public Livro(String titulo, String descricao, BigDecimal preco, Integer numeroPaginas,Date dataPublicacao, List<Autor> autores) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.numeroPaginas = numeroPaginas;
		this.autores = autores;
		this.dataPublicacao = dataPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [idLivro=" + idLivro + ", titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco
				+ ", numeroPaginas=" + numeroPaginas + ", autores=" + autores + "]";
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	
	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getCapaPath() {
		return capaPath;
	}

	public void setCapaPath(String capaPath) {
		this.capaPath = capaPath;
	}

	
	
}
