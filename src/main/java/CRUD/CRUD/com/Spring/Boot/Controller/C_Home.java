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

    @GetMapping("/excluirProduto/{id}")
    public String excluirProduto(@PathVariable("id") String id){
        S_Produto.excluirProduto(id);
        return "/CRUD/home";
    }

    @PostMapping ("/atualizarProduto/{id}")
    @ResponseBody
    public String atualizarProduto(@PathVariable("id") String id,
                                   @RequestParam("nome") String nome,
                                   @RequestParam("quantidade") String quantidade,
                                   @RequestParam("valor") String valor) {

       M_Produto produtoAtualizado = new M_Produto();
       produtoAtualizado.setNome(nome);
       produtoAtualizado.setQuantidade(Integer.parseInt(quantidade));
       produtoAtualizado.setValor(Float.parseFloat(valor));

       String mensagem = S_Produto.atualizarProduto(id, produtoAtualizado);

       return mensagem;
    }
}