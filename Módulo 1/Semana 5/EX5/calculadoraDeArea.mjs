export default class CalculadoraDeArea {
  constructor(tipo, base, altura) {
    this.tipo = tipo;
    this.base = base;
    this.altura = altura;
  }
  calcular() {
    if (this.tipo === "quadrado" || this.tipo === "retangulo") {
      return this.base * this.altura;
    } else if (this.tipo === "triangulo") {
      return (this.base * this.altura) / 2;
    }
  }
}
