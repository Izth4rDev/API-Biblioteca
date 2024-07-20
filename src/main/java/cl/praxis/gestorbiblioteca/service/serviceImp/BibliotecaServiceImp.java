package cl.praxis.gestorbiblioteca.service.serviceImp;
import cl.praxis.gestorbiblioteca.models.Usuario;
import cl.praxis.gestorbiblioteca.repository.UserRepo;
import cl.praxis.gestorbiblioteca.service.IBibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BibliotecaServiceImp implements IBibliotecaService {

    private UserRepo userRepo;

    @Autowired
    public BibliotecaServiceImp(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public List<Usuario> getAllUsers() {
        return userRepo.listAll();
    }

    @Override
    public Usuario addUser(Usuario user) {
        return userRepo.addNewUser(user);
    }
}
