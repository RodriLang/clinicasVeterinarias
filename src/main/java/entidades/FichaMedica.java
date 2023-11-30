package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class FichaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFicha;

    private LocalDate fechaConsulta;

    @ManyToOne
    @JoinColumn(name = "idMascota")
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "idEstablecimiento")
    private EstablecimientoVeterinario establecimiento;

    @OneToMany(mappedBy = "fichaMedica")
    private List<Pregunta> preguntas;

}
