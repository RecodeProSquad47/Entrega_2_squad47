package vidaalemdasgrades.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "projeto")
public class Projetos {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String link;
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuarios usuario;

	@Override
	public String toString() {
		return "Projetos [id=" + id + ", descricao=" + descricao + ", link=" + link + ", telefone=" + telefone
				+ ", usuario=" + usuario + " ]";
	}
	
	
	
}
	
	