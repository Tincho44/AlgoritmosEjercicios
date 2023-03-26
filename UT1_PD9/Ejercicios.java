//Clase Factorial

package pd9;

/**
 *
 * @author martinsilva
 */
public class Factorial {
    
    public static long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("El numero no puede ser negativo");
    }
    
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
        factorial *= i;
    }
    return factorial;
}
    
}

// Clase Primos

package pd9;

/**
 *
 * @author martinsilva
 */
public class Primos {
   
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        int i = 2;
        while (i * i <= numero) {
            if (numero % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int sumaPares(int numero) {
        int suma = 0;
        int i = 0;
        while (i <= numero) {
            suma += i;
            i += 2;
        }
        return suma;
    }

    public static int sumaImpares(int numero) {
        int suma = 0;
        int i = 1;
        while (i <= numero) {
            suma += i;
            i += 2;
        }
        return suma;
    }

}

// Clase main

package pd9;

/**
 *
 * @author martinsilva
 */
public class PD9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Factorial factorios = new Factorial();
    
    factorios.factorial(5);
    
    System.out.println(factorios.factorial(5));
    
    
    Primos primito = new Primos();
    
    
    int numero = 7;
    
        if (primito.esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
            System.out.println("La suma de los números pares desde 0 hasta " + numero + " es: " + primito.sumaPares(numero));
        } else {
            System.out.println("El número " + numero + " no es primo.");
            System.out.println("La suma de los números impares desde 0 hasta " + numero + " es: " + primito.sumaImpares(numero));
        }
    
    }
    
}
