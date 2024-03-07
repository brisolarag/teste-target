function numPertFibonacci(numero) {
    if (numero === 0) {
      console.log(`O numero: ${numero} percentence a sequencia Fibonacci`)
      return true
    }
    let a = 0;
    let b = 1;
    
    while (b <= numero) {
        if (b === numero) {
            console.log(`O numero: ${numero} percentence a sequencia Fibonacci`)
            return true;

        }
        
        let temp = a;
        a = b;
        b = temp + b;
    }
    console.log(`O numero: ${numero} não percentence a sequencia Fibonacci`)
    return false;
}

const numTeste = 1;
numPertFibonacci(numTeste)