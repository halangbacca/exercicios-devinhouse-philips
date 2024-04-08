const concatena = (vetor1, vetor2) => [...vetor1, ...vetor2];

const novoArray = concatena([1, 2, 3], [4, 5, 6]);

console.log(novoArray); // [ 1, 2, 3, 4, 5, 6 ]
