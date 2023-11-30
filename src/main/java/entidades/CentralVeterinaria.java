
package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;


@Entity
@Data
public class CentralVeterinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeterinaria;

    private String nombre;
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "veterinaria")
    private List<EstablecimientoVeterinario> establecimientos;

    @OneToMany(mappedBy = "veterinaria")
    private List<ProfesionalVeterinario> veterinarios;

}
