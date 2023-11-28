$("#cadastro"),click();

function cadastroProduto(){
    let nome = $("nome").val();
    let quantidade = $("#quantidade").val();
    let valor = $("#nome").val();

    $.ajax({
        type: "POST",
        url: "/CRUD/home",
        data: {
            nome: nome,
            quantidade: quantidade,
            valor: valor
        },
        success: function(data){
            if(data) {
                window.location.href: "/CRUD/home";
            } else {
                alert("Não foi possível cadastrar o produto")
            }
        },
        error: function(){
            alert("Falha na comunicação!");
        }
    });
}

$("#excluir")

$("#atualizar")

$("#visualizar")