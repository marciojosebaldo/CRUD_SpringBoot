package CRUD.CRUD.com.Spring.Boot.Service;

import CRUD.CRUD.com.Spring.Boot.Model.M_Produto;
import CRUD.CRUD.com.Spring.Boot.Repository.R_Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class S_Produto {

    private static R_Produto r_produto;

    public S_Produto(R_Produto r_produto) {
        this.r_produto = r_produto;
    }

    public static String cadastroProduto(String nome, int quantidade, float valor) {

        String mensagem = "";

        M_Produto m_produto = new M_Produto();
        m_produto.setNome(nome);
        m_produto.setQuantidade(quantidade);
        m_produto.setValor(valor);

        r_produto.save(m_produto);

        return "Produto cadastrado com sucesso";
    }
}