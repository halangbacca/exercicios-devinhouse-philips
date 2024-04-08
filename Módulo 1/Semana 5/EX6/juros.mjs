export default class Juros {
  constructor(capitalInicial, taxaAplicada, tempo) {
    this.capitalInicial = capitalInicial;
    this.taxaAplicada = taxaAplicada;
    this.tempo = tempo;
  }
  calcularJurosSimples() {
    let jurosSimples = this.capitalInicial * this.taxaAplicada * this.tempo;
    return `Juros Simples R$: ${jurosSimples.toFixed(2)}`;
  }
  calcularJurosCompostos() {
    let jurosCompostos =
      this.capitalInicial * (1 + this.taxaAplicada) ** this.tempo;
    return `Juros Compostos R$: ${jurosCompostos.toFixed(2)}`;
  }
}
