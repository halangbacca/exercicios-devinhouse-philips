export default class Personagem {
  constructor(nome, percentualVida) {
    this.nome = nome = "Alyx";
    this.percentualVida = percentualVida = 100;
  }
  sofreuDano(percentualDano) {
    this.percentualVida - percentualDano <= 0
      ? (this.percentualVida = 0)
      : (this.percentualVida -= percentualDano);
    return this.percentualVida;
  }
  usouKitMedico() {
    this.percentualVida + 10 >= 100
      ? (this.percentualVida = 10)
      : (this.percentualVida += 10);
    return this.percentualVida;
  }
}
