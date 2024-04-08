import Funcionario from "./funcionario.mjs";

const ada = new Funcionario("528.442.040-31", "Ada Lovelace", 1000);

console.log(ada); // {cpf: '528.442.040-31', nome: 'Ada Lovelace', salario: 1000}
console.log(ada.salario); // 1000
ada.promover(50);
console.log(ada.salario); // 1500
console.log(ada.validaCPF("528.442.040-31")); // True
