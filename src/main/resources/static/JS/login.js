$("#btnLogin").click(fazerLogin);

function fazerLogin(){
    let usuario = $("#usuario").val();
    let senha = $("#senha").val();

    $.ajax({
        type: POST,
        url: /login,
        data: {
            usuario: usuario,
            senha: senha
        },
        success: function(data){
            if(data) {
                window.location.href="/home";
            } else {
                alert("Usuário e senhas inválidos!")
            }
        },
        error: function() {
            alert("Falha na comunicação");
        }
    });
}