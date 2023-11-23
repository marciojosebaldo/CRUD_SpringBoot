package CRUD.CRUD.com.Spring.Boot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Login {

    @GetMapping("/")
        public static String getLogin() {
            return "Login/login";
        }
}