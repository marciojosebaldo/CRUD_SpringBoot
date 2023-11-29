package CRUD.CRUD.com.Spring.Boot.Service;

import CRUD.CRUD.com.Spring.Boot.Model.M_Produto;
import CRUD.CRUD.com.Spring.Boot.Repository.R_Produto;
import org.springframework.stereotype.Service;

@Service
public class S_Produto {

    private static R_Produto r_produto;

    public S_Produto(R_Produto r_produto) {
        this.r_produto = r_produto;
    }

    public static String cadastroProduto(String nome, String quantidade, String valor) {

        String mensagem = "";

        int quantidadeInt = 0;
        float valorFloat = 0;

        M_Produto m_produto = new M_Produto();
        m_produto.setNome(nome);
        m_produto.setQuantidade(quantidadeInt = Integer.parseInt(quantidade));
        m_produto.setValor(valorFloat = Float.parseFloat(valor));

        r_produto.save(m_produto);

        return "Produto cadastrado com sucesso";
    }

    public static String excluirProduto(String id) {
        String mensagem = "";

        

        return "Produto excluído com sucesso";
    }
}