package CRUD.CRUD.com.Spring.Boot.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Home {

    @GetMapping("CRUD/home")
    public static String getHome(HttpSession session){
        if (session.getAttribute("usuario") != null) {
//            List<M_Usuario> listaUsuario;
        }

        return null;
    }
}
