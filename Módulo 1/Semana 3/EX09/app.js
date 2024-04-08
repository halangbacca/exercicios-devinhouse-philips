const objeto = {
  texto: "O rato roeu a roupa do rei de Roma.",
  termo: "rato",
};

function procuraTermo(objeto) {
  /*destruct
  const { texto, termo } = objeto;
  return texto.includes(termo);*/
  return objeto.texto.includes(objeto.termo);
}

console.log(procuraTermo(objeto));