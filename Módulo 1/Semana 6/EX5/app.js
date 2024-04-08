function obterClienteNoBancoDeDados(idCliente) {
  return new Promise((resolve, reject) => {
    const cliente = { nome: "bruce wayne", id: idCliente };
    cliente.id != 7 ? reject(cliente) : resolve(cliente);
  });
}

async function processar() {
  try {
    await obterClienteNoBancoDeDados(7).then((cliente) => console.log(cliente));
  } catch (err) { // recebe o valor de reject
    console.log(`Cliente não aceito com a id: ${err.id}`); // imprime a id
  }
}

processar();
