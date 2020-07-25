var frutas = ["maçã", "pera", "uva"]; // Criação e atribuição do array
frutas.push("Abacaxi"); //Insere um elemento no array
frutas.pop(); // Retira o último elemento do array
console.log(frutas); //Mostra todos elementos do array
console.log(frutas[1]); //Mostra a posição 1, segundo elemento
console.log(frutas.length); //Mostra o tamanho da array
console.log(frutas.reverse()); //Mostra o array de trás pra frente
console.log(frutas.join(" - ")); //Insere um símbolo qualquer entre os elementos do array

var dicionarioFruta = {nome: "Maça", cor: "Vermelha"}; // Cria um dicionário, modelo json
console.log(dicionarioFruta);
console.log(dicionarioFruta.nome);

var dicionarioFruta = [{nome: "Maça", cor: "Vermelha"}, {nome: "Abacate", cor: "Verde"}]; // Cria um array de dicionário, modelo json
console.log(dicionarioFruta);