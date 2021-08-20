function carregaInfo(){
    //antes de mais nada.. vou verificar se tenho o objeto no LocalStorage
    var userSTR = localStorage.getItem("userDASH"); //tento recuperar do localStorage
    if (!userSTR){ //se esse cara nao existir
        window.location = "index.html";
    }

    //entao o usuario existe

    var user = JSON.parse(userSTR); // como eu gravei em formato texto, vou reconverter para o objeto em memoria

    document.getElementById("fotoUser").innerHTML = `<br><img src="${user.linkFoto}" class="rounded-circle"
    width="80%">`;

    document.getElementById("bioUser").innerHTML = `<br><h4> ${user.nome} </h4>
                                                    <hr>
                                                     <span class="titulo"> RACF:</span> ${user.racf}<br> 
                                                     <span class="titulo"> Email:</span>  ${user.email} <br>
                                                     <span class="titulo">  Departamento:</span> ${user.departamento} <br><br>
                                                    <button type="button" class="btn btn-primary" onclick="logout()">Logout</button>`;

}

function logout(){

    localStorage.removeItem("userDASH");
    window.location = "index.html"

}