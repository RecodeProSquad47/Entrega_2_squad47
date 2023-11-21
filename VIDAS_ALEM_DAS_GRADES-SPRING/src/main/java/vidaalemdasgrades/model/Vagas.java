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
@Table(name = "vaga")
public class Vagas {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descricao;
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuarios usuario;
	
	@ManyToOne
	@JoinColumn(name = "vaga_id")
	private Vagas vaga;

	@Override
	public String toString() {
		return "Vagas [id=" + id + ", descricao=" + descricao + ", telefone=" + telefone + ", usuario=" + usuario
				+ ", vaga=" + vaga + "]";
	}
	
	
}
