const procuraMinMax = (numeros) => {
    if(!Array.isArray(numeros) || !numeros.length){
        console.log("Não é possível encontrar");     
    }else{
        let max = (Math.max(...numeros));
        let min = (Math.min(...numeros));
        console.log({max, min});
    }
};

procuraMinMax([56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47]);
procuraMinMax([]);
procuraMinMax([1]);
procuraMinMax([1, -1]);
procuraMinMax(null);
procuraMinMax([-2, -2, -2, -2]);
procuraMinMax([20, 10, 30]);