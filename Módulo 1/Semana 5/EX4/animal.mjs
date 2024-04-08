export default class Animal {
  constructor(nome, idade, som) {
    this.nome = nome;
    this.idade = idade;
    this.som = som;
  }
}

export class Gato extends Animal {
  constructor(nome, idade, som) {
    super(nome, idade, (som = "miado"));
  }
}

export class Cachorro extends Animal {
  constructor(nome, idade, som) {
    super(nome, idade, (som = "latido"));
  }
}
