$("#cadastrar").click(cadastroProduto);

function cadastroProduto(){
    let nome = $("#nome").val();
    let quantidade = $("#quantidade").val();
    let valor = $("#valor").val();

    $.ajax({
        type: "POST",
        url: "/cadastroProduto",
        data: {
            nome: nome,
            quantidade: quantidade,
            valor: valor
        },
        success: function(data){
            alert(data);

            if(data) {
                window.location.href="/CRUD/home";
            } else {
                alert("Não foi possível cadastrar o produto")
            }
        },
        error: function(){
            alert("Falha ao cadastrar o produto");
        }
    });
}


$("#excluir").click(excluirProduto);

//Antes de excluir o produto, conferir se há o produto para ser excluído

function excluirProduto(){
    let id = $("#id").val();

    $.ajax({
        type: "POST",
        url: "/excluirProduto",
        data: {
            id: id
        },
        success: function(data) {
            alert(data);

            if(data) {
                window.location.href="/CRUD/home";
            } else {
                alert("Não foi possível excluir o produto")
            }
        },
        error: function(){
            alert("Falha ao excluir o produto");
        }
    });
}


$("#visualizar").click(visualizarProduto);

function visualizarProduto(){
    $.ajax({
        type: "POST",
        url: "/listarProduto",
        success: function(data) {
            let tabela = $("#tabelaProdutos tbody");

            tabela.empty();

            tabela.append(
                "<tr>" +
                "<th>Nome</th>" +
                "<th>Qtde</th>" +
                "<th>Valor</th>" +
                "<th>Edição</th>"
                "</tr>");

            $.each(data, function(index, produto) {
                var newRow =
                    "<tr>" +
                    "<td>" + produto.nome + "</td>" +
                    "<td>" + produto.quantidade + "</td>" +
                    "<td>" + produto.valor + "</td>" +
                    "<td>" +
                    "<button type='button' class='btn btn-success'>Editar</button>" +
                    "<button type='button' class='btn btn-danger'>Excluir</button>";
                    "</td>" +
                    "</tr>";

                    tabela.append(newRow);
            });

            if(data.length > 5) {
                $("#tabelaProdutos").addClass("scrollable-table");
            } else {
                $("#tabelaProdutos").removeClass("scrollable-table");
            }
        },
        error: function(){
            alert("Falha ao listar o(s) produto(s)");
        }
    });
}

$("#atualizar").click(atualizarProduto);

function atualizarProduto(){
}