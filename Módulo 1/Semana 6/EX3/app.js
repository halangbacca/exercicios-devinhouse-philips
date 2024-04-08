function aprovarDadosCadastrais(cliente) {
  return new Promise((resolve, reject) => {
    if (cliente.cpf === 11111111111) resolve(true);
    else reject(false);
  });
}

function aprovarValorSolicitado(cliente, valor) {
  return new Promise((resolve, reject) => {
    if (cliente.margem >= valor) resolve(true);
    else reject(false);
  });
}

const cliente = { cpf: 11111111111, nome: "Calleri", margem: 1000.0 };
const aprovacaoCadastro = aprovarDadosCadastrais(cliente);
const aprovacaoValor = aprovarValorSolicitado(cliente, 300.0);

function verificaPromise(promise1, promise2) {
  return Promise.all([promise1, promise2]);
}

verificaPromise(aprovacaoCadastro, aprovacaoValor)
  .then(function () {
    console.log("APROVADO");
  })
  .catch(() => console.log("REPROVADO"))
  .finally(() => {
    console.log("Fim do Processamento");
  });
