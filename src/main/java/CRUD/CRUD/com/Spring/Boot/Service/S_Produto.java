package CRUD.CRUD.com.Spring.Boot.Service;

import CRUD.CRUD.com.Spring.Boot.Model.M_Produto;
import CRUD.CRUD.com.Spring.Boot.Repository.R_Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        Long idInt = Long.parseLong(id);

        r_produto.deleteById(idInt);

        return "Produto excluído com sucesso";
    }

    public static List<M_Produto> listarProduto() {
        return r_produto.findAll();
    }

    public static String atualizarProduto(String id, M_Produto m_produtoAtualizado){
        Long Id = Long.parseLong(id);

        Optional<M_Produto> m_produtoOptional = r_produto.findById(Id);

        if (m_produtoOptional.isPresent()) {
            M_Produto produtoExistente = m_produtoOptional.get();

            produtoExistente.setNome(m_produtoAtualizado.getNome());
            produtoExistente.setQuantidade(m_produtoAtualizado.getQuantidade());
            produtoExistente.setValor(m_produtoAtualizado.getValor());

            try {
                r_produto.save(produtoExistente);
            } catch (DataIntegrityViolationException e) {
                return "Erro ao atualizar produto: " + e.getMessage();
            }


            return "Produto atualizado com sucesso";
        } else {
            return "Produto não encontrado";
        }
    }
}