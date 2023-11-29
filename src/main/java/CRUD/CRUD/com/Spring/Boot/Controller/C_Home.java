package CRUD.CRUD.com.Spring.Boot.Controller;

import CRUD.CRUD.com.Spring.Boot.Service.S_Produto;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Home {

    @GetMapping("/CRUD/home")
    public static String getHome(HttpSession session) {
        if (session.getAttribute("usuario") != null) {
            return "CRUD/home";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("/cadastroProduto")
    @ResponseBody
    public static String cadastrarProduto(@RequestParam("nome") String nome,
                                        @RequestParam("quantidade") String quantidade,
                                        @RequestParam("valor") String valor) {

        String mensagem = "";

        S_Produto.cadastroProduto(nome, quantidade, valor);

        mensagem = "Produto cadastrado com sucesso";

        return mensagem;
    }

    @PostMapping("/excluirProduto")
    @ResponseBody
    public static String excluirProduto(@RequestParam("id") String id) {
        String mensagem = "";



        mensagem = "Produto excluído com sucesso";

        return mensagem;
    }
}