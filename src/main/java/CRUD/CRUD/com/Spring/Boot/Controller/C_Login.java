package CRUD.CRUD.com.Spring.Boot.Controller;

import CRUD.CRUD.com.Spring.Boot.Service.S_Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class C_Login {

    @GetMapping("/")
    public String getLogin(HttpSession session) {
        if (session.getAttribute("usuario") != null) {
            return "redirect:/Login/login";
        } else {
            return "Login/login";
        }
    }

    @PostMapping("/Login/login")
    @ResponseBody
    public boolean validarLogin(@RequestParam("email") String email,
                                @RequestParam("senha") String senha,
                                HttpSession session) {

        session.setAttribute("usuario", S_Usuario.validaLogin(email, senha));

        if (session.getAttribute("usuario") != null) {
            return true;
        }
        return false;
    }
}