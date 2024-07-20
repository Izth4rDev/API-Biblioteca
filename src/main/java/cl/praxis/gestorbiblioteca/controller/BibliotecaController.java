package cl.praxis.gestorbiblioteca.controller;
import cl.praxis.gestorbiblioteca.models.Usuario;
import cl.praxis.gestorbiblioteca.service.serviceImp.BibliotecaServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
    public static final Logger LOG = LoggerFactory.getLogger(BibliotecaController.class);
    public BibliotecaServiceImp biblioService;

    @Autowired
    public BibliotecaController(BibliotecaServiceImp biblioService){
        this.biblioService = biblioService;
    }

    @PostMapping("/add")
    public String adduser(@RequestBody Usuario user){
        biblioService.addUser(user);
        LOG.info("Usuario añadido"+user.getNombre());
        return "Usuario añadido";
    }

    @GetMapping("/all")
    public List<Usuario> listUser(){
        LOG.info("Listando Usuario");
       return biblioService.getAllUsers();
    }

}
