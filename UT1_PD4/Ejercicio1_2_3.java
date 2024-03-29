### Ejercicio 1)

/*
Una variable de clase es una variable que todas las instancias de esa clase van a compartir.
Una variable de instancia, son las variables que cada instancia de la clase tiene. Estas son unicas y se crear en el inicializador o constructor dependiendo del lenguaje de programacion.
*/

public class IdentifyMyParts {
	public static int x = 7;
	public int y = 3;
}

/*
x → Variable de clase por que tiene el modificador static que hace que todas las instancias de esa clase no se modifiquen

y → Variable de instancia, cada instancia tendra un valor para y
*/

IdentifyMyParts a = new IdentifyMyParts();
IdentifyMyParts b = new IdentifyMyParts();
a.y = 5;
b.y = 6;
a.x = 1;
b.x = 2;
System.out.println("a.y = " + a.y);
System.out.println("b.y = " + b.y);
System.out.println("a.x = " + a.x);
System.out.println("b.x = " + b.x);
System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

/*
La salida de ese codigo es:

a.y = 5

b.y = 6

a.x = 2

b.x = 2

IdentifyMyParts.x = 2

(Da como resultado 2, por que una vez que se cambia en un sitio se cambia en todos)
*/

//Ejercicio 2) 


public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}

//Se tiene que declarar la creacion del rectangulo, asi se puede acceder al metodo width y height, y asi poder calcular el area.

//Ejercicio 3: 

/*

1)

En Java necesitas declarar de que tamaño es el array. Tambien podes poner un array vacio y pasarle que valores van a estar adentro. 

El array students, va a ser referenciado todas las veces que se le agregue algun dado, y las variables que se instancian para luego ser colocadas en el array son referenciadas ahi y luego son borradas dado que no se necesitan mas, salvo que se vayan a utilizar por algun motivo. Pero si solo se crean para guardarlas en el array, luego van a ser borradas. 

Si, la variable studentName es candidata a ser borrada, dado que no es usado en ningun otro sitio. Luego de que se le asignen todos los strings al array, cada una de las variables va a ser borrada por el garbage collector. Al borrarlas, el array sigue conteniendo los datos, no hace falta que la variable quede instanciada y ocupando memoria en el heap. 

2) 

En Java, la memoria se divide en dos áreas principales: **la heap** (montículo) y **la stack** (pila). La heap es donde se almacenan los objetos, mientras que la stack es donde se almacenan las variables locales y los valores de retorno de los métodos.

Los objetos creados se almacenan en el heap, pero cuando estos objetos ya no son usados o referenciados, hay un algoritmo mismo para detectarlo y borrar estos objetos para asi ahorrar espacio de memoria. Eso es lo que hace el garbarge collector. 

3)

*/

NumberHolder nh = new NumberHolder();
nh.anInt = 10;
nh.aFloat = 3.14f;

System.out.println(nh.anInt);
System.out.println(nh.aFloat);
