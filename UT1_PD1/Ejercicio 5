package parte5;

/**
 *
 * @author martinsilva
 */
public class Contador {
    
    final int MAX_CONT = 50;
    int contador = 1;
    int incremento = 1;
    
    // Usando While
    public void mostrarContador(){
        
        while(contador < MAX_CONT){
            
            System.out.println(contador);
            contador++;

        }
    }
    
    // Usando Do while
    
        public void mostrarContadorDoWhile(){
        
        do{
                        
            System.out.println(contador);
            contador++;
            
        }
        
        while(contador <= MAX_CONT);

    }
        
        public void mostrarContadorFor(){
        
            for(int contador = 1; contador <= MAX_CONT; incremento++){
                
                System.out.println(contador);
                contador += 1;
            } 
        }
}



// Main


public class Parte5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contador contador = new Contador();
        
        contador.mostrarContador(); 
        contador.mostrarContadorDoWhile();
        contador.mostrarContadorFor();
    }
    
}
