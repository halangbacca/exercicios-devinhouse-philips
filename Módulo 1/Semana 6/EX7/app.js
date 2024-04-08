function precoCriptomoeda(criptomoeda) {
  fetch(`https://api.coincap.io/v2/assets/${criptomoeda}`)
    .then((response) => response.json())
    .then((data) =>
      console.log(
        `O preço do ${data.data.name} - ${data.data.symbol} - em dólares hoje é $${data.data.priceUsd}`
      )
    );
}

precoCriptomoeda("bitcoin");
