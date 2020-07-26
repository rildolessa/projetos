//condições
var idade = prompt("Qual sua idade?");
if (idade > 18) {
    alert("Maior de idade!")
} else {
    alert("Menor de idade")
}

//Controles: while
var valor = 0;
while (valor < 5) {
    console.log(valor)
    valor ++
}

//Controles: for
var valor2 = 0;
for (valor2 = 0; valor2 < 3; valor2 ++) {
    alert(valor2)
    
}

//Datas
var hoje = new Date();
alert(hoje);
alert(hoje.getMonth()+1); //O mês começa do 0 "zero" - Janeiro, Aqui pode usar o
alert(hoje.getMinutes()); //Trás os minutos corrente