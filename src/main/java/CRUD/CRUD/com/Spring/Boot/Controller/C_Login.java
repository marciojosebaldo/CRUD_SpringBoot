package CRUD.CRUD.com.Spring.Boot.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Login {

    @GetMapping("/")
    public static String getLogin(HttpSession session) {
        if (session.getAttribute("usuario") != null) {
            return "redirect:/home";
        } else {
            return "CRUD/home";
        }
    }
}