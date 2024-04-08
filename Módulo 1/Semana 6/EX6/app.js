function idadeMedia(nome) {
  fetch(`https://api.agify.io/?country_id=BR&name=${nome}`)
    .then((response) => response.json())
    .then((data) => console.log(data.age));
}

idadeMedia("Halan");
