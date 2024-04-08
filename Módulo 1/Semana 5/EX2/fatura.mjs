export default class Fatura {
  #quantia; // Variável privada
  constructor(id, descricao, quantia, preco) {
    this.id = id;
    this.descricao = descricao;
    this.#quantia = quantia;
    this.preco = preco;
  }
  obterValorTotal() {
    if (this.#quantia < 0) {
      this.#quantia = 0;
    }

    if (this.preco < 0) {
      this.preco = 0;
    }

    return this.#quantia * this.preco;
  }

  get valorTotal() {
    return `Valor total: ${this.#quantia * this.preco}`;
  }
}
