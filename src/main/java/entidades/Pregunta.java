package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPregunta;

    private String textoPregunta;

    @OneToOne(mappedBy = "pregunta")
    private Respuesta respuestas;

    @ManyToOne
    @JoinColumn(name = "idFicha")
    private FichaMedica fichaMedica;
}
