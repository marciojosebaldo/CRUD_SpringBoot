$(document).ready(function() {

$("#cadastrar").click(cadastroProduto);

function cadastroProduto() {
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
        success: function (data) {
            alert(data);

            if (data) {
                window.location.href = "/CRUD/home";
            } else {
                alert("Não foi possível cadastrar o produto")
            }
        },
        error: function () {
            alert("Falha ao cadastrar o produto");
        }
    });
}

$("#visualizar").click(visualizarProduto);

function visualizarProduto() {
    $.ajax({
        type: "GET",
        url: "/CRUD/tabelaProdutos",
        success: function(data) {
            $("#tabelaProdutos").html(data);
        },
        error: function() {
            alert("Falha ao carregar a lista de produtos");
        }
    });
}


$("#excluir").click(excluirProduto);

function excluirProduto() {
    let id = $("#id").val();

    $.ajax({
        type: "POST",
        url: "/excluirProduto",
        data: {
            id: id
        },
        success: function (data) {
            alert(data);

            if (data) {
                window.location.href = "/CRUD/home";
            } else {
                alert("Não foi possível excluir o produto")
            }
        },
        error: function () {
            alert("Falha ao excluir o produto");
        }
    });
}

$("a.editarProduto").click(editarProduto);

function editarProduto(){
    let produtoId = $(this).data("id");

    $.ajax({
        type: "POST",
        url: "/atualizarProduto/"+produtoId,
        success: function(data) {
            $("modalEditarProduto .modal-title").text("Editar Produto");
            $("modalEditarProduto .modal-body").html(data);
        },
        error: function(){
            alert("Falha ao enviar a atualização do produto");
        }
    });
}
});