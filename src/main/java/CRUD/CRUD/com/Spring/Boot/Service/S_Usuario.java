package CRUD.CRUD.com.Spring.Boot.Service;

import CRUD.CRUD.com.Spring.Boot.Model.M_Usuario;
import CRUD.CRUD.com.Spring.Boot.Repository.R_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class S_Usuario {
    private static R_Usuario r_usuario;

    @Autowired
    public S_Usuario(R_Usuario r_usuario) {
        this.r_usuario = r_usuario;
    }

    public static M_Usuario validaLogin(@RequestParam("email") String email,
                                        @RequestParam("senha") String senha){

        return r_usuario.buscarUsuarioPorEmailSenha(email, senha);
    }
}