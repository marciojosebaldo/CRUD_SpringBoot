$("#btnLogin").click(fazerLogin);

function fazerLogin(){
    let email = $("#email").val();
    let senha = $("#senha").val();

    $.ajax({
        type: POST,
        url: /login,
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