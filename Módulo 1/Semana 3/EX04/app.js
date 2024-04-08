const objUm = {
    a: 1,
    b: 2
};

const objDois = {
    c: 3,
    d: 4
};

const mesclaObjetos = (objUm, objDois) => ({...objUm, ...objDois});

const novoObjeto = mesclaObjetos(objUm, objDois);

console.log(novoObjeto);