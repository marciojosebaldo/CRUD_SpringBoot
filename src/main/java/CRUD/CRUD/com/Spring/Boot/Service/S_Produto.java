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

    public static M_Produto cadastroProduto(@RequestParam("nome") String nome,
                                            @RequestParam("quantidade") int quantidade,
                                            @RequestParam("valor") float valor) {
        M_Produto m_produto;

        return null;
    }
}