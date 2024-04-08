// Retorna os usuários da API
async function buscaUsuarios(quantidade = 5) {
  // Quantidade default = 5
  try {
    const retorno = await fetch(
      `https://randomuser.me/api/?results=${quantidade}`
    );
    const { results } = await retorno.json(); // Desestrutura a array de resultados

    const lista = document.getElementById("lista"); // Atribui a ul "lista" à variável lista

    // Executa o código abaixo em todos os elementos do array results
    results.forEach((user) => {
      const li = document.createElement("li"); // Cria uma lista de itens dentro de uma lista desordenada

      const container = document.createElement("div"); // Cria uma div para inserir a imagem
      container.classList.add("container"); // Atribui a ID "container" à div criada

      const info = document.createElement("div"); // Cria uma div para inserir as informações dos usuários
      info.classList.add("info"); // Atribui a ID "info" à div criada

      const nome = document.createElement("p"); // Cria um elemento parágrafo para mostrar o nome dos usuários
      nome.innerHTML = `${user.name.title} ${user.name.first} ${user.name.last}`; // Exibe o nome dos usuários no parágrafo criado

      const email = document.createElement("p"); // Cria um elemento parágrafo para mostrar o e-mail dos usuários
      email.innerHTML = user.email; // Exibe o e-mail dos usuários no parágrafo criado

      const endereco = document.createElement("p"); // Cria um elemento parágrafo para mostrar o endereço dos usuários
      endereco.innerHTML = `${user.location.street.name} - ${user.location.street.number} - ${user.location.city} - ${user.location.state} - ${user.location.country}`; // Exibe o endereço dos usuários no parágrafo criado

      const imagem = document.createElement("img"); // Cria um elemento imagem para mostrar a imagem dos usuários
      imagem.src = user.picture.large; // Exibe a foto dos usuários no elemento imagem criado

      container.appendChild(imagem);

      info.appendChild(nome);
      info.appendChild(email);
      info.appendChild(endereco);

      container.appendChild(info);
      li.appendChild(container);
      lista.appendChild(li);
    });
  } catch (error) {
    console.error(error);
  }
}

buscaUsuarios();

// Atribui uma quantidade N de usuários à função buscaUsuarios
const quantidade = document.getElementById("quantidade");
quantidade.addEventListener("change", (event) => {
  buscaUsuarios(event.target.value);
});
