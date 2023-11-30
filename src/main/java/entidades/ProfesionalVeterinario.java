
package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class ProfesionalVeterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeterinario;

    private String nombre;
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "idVeterinaria")
    private CentralVeterinaria veterinaria;

}
