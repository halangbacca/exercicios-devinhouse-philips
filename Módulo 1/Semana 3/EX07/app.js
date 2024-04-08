const mensagem = (pessoa) => {
    const {nome, idade, profissao} = pessoa; //destruct
    console.log(`Esta é ${nome}, tem ${idade} anos e é ${profissao}.`);
};

const pessoa = {
    nome: 'Ada',
    idade: 36,
    profissao: 'matemática'
  };

mensagem(pessoa);