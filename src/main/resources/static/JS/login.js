$("#btnLogin").click(fazerLogin);

function fazerLogin(){
    let email = $("#emailInput").val();
    let senha = $("#senhaInput").val();

    $.ajax({
        type: "POST",
        url: "/cadastroProduto",
        data: {
            email: email,
            senha: senha
        },
        success: function(data){
            if(data) {
                window.location.href="CRUD/home";
            } else {
                alert("Usuário e senhas inválidos!")
            }
        },
        error: function() {
            alert("Falha na comunicação");
        }
    });
}