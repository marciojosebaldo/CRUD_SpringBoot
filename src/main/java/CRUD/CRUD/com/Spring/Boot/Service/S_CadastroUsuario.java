package CRUD.CRUD.com.Spring.Boot.Service;

import CRUD.CRUD.com.Spring.Boot.Repository.R_CadastroUsuario;
import org.springframework.stereotype.Service;

@Service
public class S_CadastroUsuario {

    public static R_CadastroUsuario r_cadastroUsuario;

    public S_CadastroUsuario(R_CadastroUsuario r_cadastroUsuario) {
        this.r_cadastroUsuario = r_cadastroUsuario;
    }

    public static String cadastroUsuario(String usuario, String senha, String email) {

        String mensagem = "";

        M_CadastroUsuario m_cadastroUsuario = new M_CadastroUsuario();
        m_cadastroUsuario.setUsuario(usuario);
        m_cadastroUsuario.setSenha(senha);
        m_cadastroUsuario.setEmail(email);

        r_cadastroUsuario.save(m_cadastroUsuario);

        return "Cadastro realizado com sucesso";
    }
}