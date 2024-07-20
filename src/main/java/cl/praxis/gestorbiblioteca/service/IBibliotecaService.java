package cl.praxis.gestorbiblioteca.service;
import cl.praxis.gestorbiblioteca.models.Usuario;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IBibliotecaService {
    public List<Usuario> getAllUsers();
    public Usuario addUser(Usuario user);
}
