package cl.praxis.gestorbiblioteca.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Libro {
    private String nombre;
    private String autor;
}
