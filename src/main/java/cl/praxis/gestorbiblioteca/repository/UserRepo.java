package cl.praxis.gestorbiblioteca.repository;
import cl.praxis.gestorbiblioteca.models.Usuario;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    private List<Usuario> users = new ArrayList<>();

    public Usuario addNewUser(Usuario user){
        users.add(user);
        return user;
    }

    public List<Usuario> listAll(){
        return users;
    }
}
