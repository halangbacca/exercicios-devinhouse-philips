function sleep(valor, tempo = 3000) {
  return new Promise((resolve) => {
    setTimeout(() => resolve(valor), tempo);
  });
}

sleep("Teste", 200)
  .then(function (resultado) {
    console.log(resultado);
  })
  .catch((erro) => console.log(erro))
  .finally(() => {
    console.log("Finalizou");
  });
