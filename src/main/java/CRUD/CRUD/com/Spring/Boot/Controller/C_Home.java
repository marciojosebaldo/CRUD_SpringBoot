package CRUD.CRUD.com.Spring.Boot.Controller;

import CRUD.CRUD.com.Spring.Boot.Model.M_Produto;
import CRUD.CRUD.com.Spring.Boot.Service.S_Produto;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/CRUD/tabelaProdutos")
    public String listarProduto(Model model) {
        List<M_Produto> listaDeProduto = S_Produto.listarProduto();
        model.addAttribute("listaDeProduto", listaDeProduto);
        return "/CRUD/tabelaProdutos";
    }

    @PostMapping("/atualizarProduto")
    @ResponseBody
    public static String atualizarProduto() {

        return "";
    }

    // Sugestão do professor para receber os ids para exclusão dos itens
    @GetMapping("/excluirProduto/{id}")
    @ResponseBody
    public String excluirProduto(@PathVariable("id") Long id){
        String mensagem = "";

//        S_Produto.excluirProduto(id);

        mensagem = "Produto excluído com sucesso";

        return mensagem;
    }
}