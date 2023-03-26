package pd5;

public class ContadorVocales {
    
   public enum Vocale {
    A('a'), E('e'), I('i'), O('o'), U('u');
    
    private char caracter;

    Vocale(char caracter) {
        this.caracter = caracter;
    }

    public char getCaracter() {
        return this.caracter;
    }
}
    public static int contarVocales(String palabra, Vocale vocal) {
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (vocal.getCaracter() == c || Character.toUpperCase(vocal.getCaracter()) == c) {
                contador++;
            }
        }
        
        return contador;
        
        }

}

package pd5;

/**
 *
 * @author martinsilva
 */

import pd5.ContadorVocales.Vocale;

public class PD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContadorVocales contador = new ContadorVocales();
        
        System.out.println(contador.contarVocales("HOLA GENTEEE",Vocale.E));
    }
    
}
