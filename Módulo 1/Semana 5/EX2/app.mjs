import Fatura from "./fatura.mjs";

const melao = new Fatura(123, "Melão", 2, 3);

console.log(melao); // { id: 123, descricao: 'Melão', quantia: 2, preco: 3 }
const valor = melao.obterValorTotal();
console.log(valor); // 6
console.log(melao.valorTotal); // 6
