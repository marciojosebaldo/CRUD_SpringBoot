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


$("#visualizar").click(function () {
    $("#tabelaProdutos").load("/CRUD/tabelaProdutos", function() {
        botoesEditarExcluir();
    });
});

function botoesEditarExcluir() {
    $(".btn btn-editar").off("click");
    $(".btn btn-excluir").off("click");

    $(".btn-editar").click(function () {

    });

    $(".btn-excluir").click(function () {

    });
}

$("#atualizar").click(atualizarProduto);

function atualizarProduto(){
}