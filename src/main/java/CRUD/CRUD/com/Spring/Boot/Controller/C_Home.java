package CRUD.CRUD.com.Spring.Boot.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Home {

    @GetMapping("/")
    public static String getHome() {
        return "Login/login";
    }
}

