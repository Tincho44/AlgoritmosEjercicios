    public static void main(String[] args) {
        
        
        imprimirTablero(4,5);  

    }
    
    public static void imprimirTablero(int largo, int ancho){
        
        StringBuilder tablero = new StringBuilder();
            
            
            for(int i = 0; i < ancho; i++ ){

                tablero.append("#");

            }
            
        for(int a =  0; a<largo; a++){
            
                System.out.println(tablero);     
                
        }                 
    }    
}
