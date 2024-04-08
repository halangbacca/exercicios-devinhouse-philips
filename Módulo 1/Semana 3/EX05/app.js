const somaTudo = (...numeros) => {
    let acumulador = 0;
    numeros.forEach(num => {
      acumulador += num;
    });
    return acumulador;
  }

  console.log(somaTudo(10, 20, 30));