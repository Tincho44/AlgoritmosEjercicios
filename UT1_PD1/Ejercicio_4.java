
package martinucu;

/**
 *
 * @author martinsilva
 */

public class Alumno {
    private String nombre;
    
    public Alumno (String name) {
    nombre = name;
    }
    
    public String getNombreAdmiracion() {
    return nombre.concat("!");
    }
   
    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
            res++;
            }
        }   
    return res;
    }
    
    public static int getValor() {
        int vector[] = { 6,16,26,36,46,56,66,76 };
        int idx = 5;
        return vector[idx];
    }
    
    public static char getPrimerCaracter(String palabra) {
    return (palabra.charAt(0));
    }
    
    public static String paraAString(int a) {
        Integer x1 = Integer.valueOf(a);
        return x1.toString();
    }
}


// a) El error de la clase alumno era de indentacion, le faltaba un } al final de todo para que contemple todos los metodos
// Tambien cambie el contructor. Le saque el null y le pase como parametro el nombre. 

// b) El error de recorrer es que iba hasta menor o igual que el string que le pasaras. Empezando en 1, solo puede
// ir hasta menor que el string que le pases, sino te tira un error de out of range

// c) El error al tener idx = 8, es que el vector es de 8 valores, pero el indice va desde 0 a 7, por lo cual 8 no existe.

// d) Aca hay varios errores, primero que el parametro palabra nunca se usa, luego que string solo tenia hasta 5 valores
// Para arreglarlo, se utiliza el parametro proporcionado, y se utiliza la funcion charAt(0) para que retorne el primer valor.

// e) El error aca es que se esta buscando hacer un casting (cambiar de int a string en este caso)
// Se corrigio usando el metodo toString, para que ahora el int proporcionado sea un string.



public class MartinUcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno martin = new Alumno("martin");
        System.out.println(martin.getNombreAdmiracion());
            
        System.out.println(martin.recorrer(martin.getNombreAdmiracion()));
        
        System.out.println(martin.getValor());

        System.out.println(martin.getPrimerCaracter(martin.getNombreAdmiracion()));
        
        System.out.println(martin.paraAString(3).getClass().getName());
            
    }
}
