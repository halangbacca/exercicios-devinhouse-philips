export default class Funcionario {
  constructor(cpf, nome, salario) {
    this.cpf = cpf;
    this.nome = nome;
    this.salario = salario;
  }
  promover(percentual) {
    this.salario += this.salario * (percentual / 100);
  }
  validaCPF(cpf) {
    cpf = cpf.replace(/\.|-/g, ""); // Substitui os pontos e traços do CPF informado
    let soma = 0,
      resto = 0;

    for (let i = 1; i <= 9; i++) {
      soma = soma + parseInt(cpf.substring(i - 1, i)) * (11 - i);
    }

    resto = (soma * 10) % 11;

    if (resto == 10 || resto == 11) {
      resto = 0;
    }

    if (resto != parseInt(cpf.substring(9, 10))) {
      return false;
    }

    soma = 0;
    for (let i = 1; i <= 10; i++) {
      soma = soma + parseInt(cpf.substring(i - 1, i)) * (12 - i);
    }

    resto = (soma * 10) % 11;

    if (resto == 10 || resto == 11) {
      resto = 0;
    }

    if (resto != parseInt(cpf.substring(10, 11))) {
      return false;
    }

    return true;
  }
}
