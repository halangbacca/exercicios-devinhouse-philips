export default class Time {
  constructor(
    nome,
    sigla,
    vitorias,
    derrotas,
    empates,
    golsMarcados,
    golsSofridos
  ) {
    this.nome = nome;
    this.sigla = sigla;
    this.vitorias = vitorias = 0;
    this.derrotas = derrotas = 0;
    this.empates = empates = 0;
    this.golsMarcados = golsMarcados = 0;
    this.golsSofridos = golsSofridos = 0;
  }

  get numeroDeJogos() {
    return this.vitorias + this.derrotas + this.empates;
  }

  get numeroDePontos() {
    return this.vitorias * 3 + this.empates;
  }

  computarPartida(partida) {
    let golsMarcados = 0;
    let golsSofridos = 0;

    if (partida.siglaTimeA === this.sigla) {
      golsMarcados = partida.golsTimeA;
      golsSofridos = partida.golsTimeB;
    } else if (partida.siglaTimeB === this.sigla) {
      golsMarcados = partida.golsTimeB;
      golsSofridos = partida.golsTimeA;
    } else {
      return; // Interrompe a execução
    }

    if (golsMarcados > golsSofridos) {
      this.vitorias++;
    } else if (golsMarcados < golsSofridos) {
      this.derrotas++;
    } else {
      this.empates++;
    }

    this.golsMarcados += golsMarcados;
    this.golsSofridos += golsSofridos;
  }

  exibirSituacao() {
    console.log(`Time: ${this.nome} (${this.sigla})`);
    console.log(`Vitórias: ${this.vitorias}`);
    console.log(`Derrotas: ${this.derrotas}`);
    console.log(`Empates: ${this.empates}`);
    console.log(`Gols Marcados: ${this.golsMarcados}`);
    console.log(`Gols Sofridos: ${this.golsSofridos}`);
  }
}
