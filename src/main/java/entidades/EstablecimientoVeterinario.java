package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class EstablecimientoVeterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstablecimiento;

    private String nombre;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "idVeterinaria")
    private CentralVeterinaria veterinaria;

    @OneToMany(mappedBy = "establecimiento")
    private List<FichaMedica> fichasMedicas;
}
