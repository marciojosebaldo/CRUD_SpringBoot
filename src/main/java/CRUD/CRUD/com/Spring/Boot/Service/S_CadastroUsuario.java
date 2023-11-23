package CRUD.CRUD.com.Spring.Boot.Service;

import CRUD.CRUD.com.Spring.Boot.Model.M_CadastroUsuario;
import CRUD.CRUD.com.Spring.Boot.Repository.R_CadastroUsuario;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class S_CadastroUsuario {

    public static R_CadastroUsuario r_cadastroUsuario;

    public S_CadastroUsuario(R_CadastroUsuario r_cadastroUsuario) {
        this.r_cadastroUsuario = r_cadastroUsuario;
    }

    public static void cadastroUsuario(String usuario, String senha, String email) {

        M_CadastroUsuario m_cadastroUsuario = new M_CadastroUsuario();
        m_cadastroUsuario.setUsuario(usuario);
        m_cadastroUsuario.setSenha(senha);
        m_cadastroUsuario.setEmail(email);

        r_cadastroUsuario.save(m_cadastroUsuario);
    }
}