class InverteStringApp {
    public static void main(String[] args) {
        System.out.println(inverteString("Gabriel"));
    }
    
    public static String inverteString(String palavra) {
        char[] arrPalavra = palavra.toCharArray();
    	String retorno = "";
    	
    	int indiceUltimo = arrPalavra.length - 1;
    	for (int i = 0; i < arrPalavra.length ; i++) {
    	    if (!(indiceUltimo < 0)) {
    	        retorno = retorno + arrPalavra[indiceUltimo];
    	        indiceUltimo = indiceUltimo - 1;
    	    } 
    	}
    	return retorno;
    }
}