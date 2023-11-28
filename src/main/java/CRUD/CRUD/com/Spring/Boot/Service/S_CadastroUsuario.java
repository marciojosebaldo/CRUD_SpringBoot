package CRUD.CRUD.com.Spring.Boot.Service;

import CRUD.CRUD.com.Spring.Boot.Model.M_Usuario;
import CRUD.CRUD.com.Spring.Boot.Repository.R_CadastroUsuario;
import org.springframework.stereotype.Service;

@Service
public class S_CadastroUsuario {

    public static R_CadastroUsuario r_cadastroUsuario;

    public S_CadastroUsuario(R_CadastroUsuario r_cadastroUsuario) {
        this.r_cadastroUsuario = r_cadastroUsuario;
    }

    public static String cadastroUsuario(String usuario, String senha, String email) {

        M_Usuario m_usuario = new M_Usuario();
        m_usuario.setUsuario(usuario);
        m_usuario.setSenha(senha);
        m_usuario.setEmail(email);

        r_cadastroUsuario.save(m_usuario);

        return "Cadastro realizado com sucesso";
    }
}