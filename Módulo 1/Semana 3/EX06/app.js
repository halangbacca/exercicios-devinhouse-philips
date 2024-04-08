const verificaPalindromo = (nome) => {
    let reverso = nome.split('').reverse().join('');

    /* .split('') = divide o array em uma lista ordenada
    .reverse() = inverte a posição do array
    .join('') = une todos os campos em uma nova String.*/

    if(reverso == nome){
        console.log(true);
    }else{
        console.log(false);
    }
}

const teste1 = verificaPalindromo("ana");
// true

const teste2 = verificaPalindromo("julia");
// false