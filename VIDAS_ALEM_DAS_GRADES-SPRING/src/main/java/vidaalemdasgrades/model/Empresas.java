package vidaalemdasgrades.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name = "empresa")
public class Empresas {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String CNPJ;
	private String descricao;
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "vaga_id")
	private Vagas vaga;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresas empresa;

	@Override
	public String toString() {
		return "Empresas [id=" + id + ", nome=" + nome + ", CNPJ=" + CNPJ + ", descricao=" + descricao + ", telefone="
				+ telefone + ", vaga=" + vaga + ", empresa=" + empresa + "]";
	
   }
}
	
	
	
	