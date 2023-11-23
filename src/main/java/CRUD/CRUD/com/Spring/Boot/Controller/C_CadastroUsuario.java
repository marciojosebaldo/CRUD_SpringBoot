package CRUD.CRUD.com.Spring.Boot.Controller;

import CRUD.CRUD.com.Spring.Boot.Service.S_CadastroUsuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_CadastroUsuario {

    @GetMapping("/cadastroUsuario")
    public static String getCadastroUsuario(){
        return "cadastroUsuario";
    }

    @PostMapping("/cadastroUsuario")
    public static String postCadastroUsuario(@RequestParam("usuario") String usuario,
                                             @RequestParam("senha") String senha,
                                             @RequestParam("email") String email){

        S_CadastroUsuario.cadastroUsuario(usuario, senha, email);

        return "Login/login";
    }
}