const campo = document.getElementById("nome"); // Recebe o input "nome"
const botao = document.getElementById("botao"); // Recebe o button "botao"
const paragrafo = document.getElementById("paragrafo"); // Recebe o paragráfo "paragrafo"

// Adiciona um evento de click ao button
botao.addEventListener("click", () => {
  const nome = campo.value; // Recebe os valores de campo
  const mensagem = mensagemOla(nome); // Recebe o nome digitado
  paragrafo.innerHTML = mensagem; // Atribiui um texto ao parágrafo
  console.log(mensagem); // Exibe a mensagem
});

const mensagemOla = (nome) => `Olá, ${nome}!`; // Imprime o nome digitado no input "nome"
