function horaAtual() {
  return new Date().toLocaleTimeString(); // retorna o horário atual
}

const interval = setInterval(() => console.log(horaAtual()), 2000); // executa a função a cada 2s
setTimeout(() => clearInterval(interval), 10000); // finaliza a execução após 10s
