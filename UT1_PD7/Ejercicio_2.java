String s1 = "Hola";
String s2 = "Hola";
if ( s1 == s2 ) {
System.out.println( "True" );
} else {
System.out.println( "False" );
}

/*

En este caso el resultado es True, dado que al ser literales de cadena, el compilador para ser mas eficiente, si ve que dos strings contienen el mismo valor
simplemente las asigna al mismo espacio de memoria. Osea que si se compara s1 == s2, java se va a fijar si tienen los mismos valores, en caso de tenerlos
referencian al mismo punto de memoria

https://docs.oracle.com/javase/specs/#3.10.5

tambien sucederia lo mismo si pasara -> "Hello" + "o" y se compara con "Helloo"

*/

        
String s1 = new String("Hola");
String s2 = "Hola";
if ( s1 == s2 ) {
System.out.println( "True" );
} else {
System.out.println( "False" );
}

/*

En este caso si da False. Por que? Por que al decir que String s1 = new String("Hola"); estas creando un nuevo espacio de memoria, es una cadena creada dinamicamente.
Mientras que String s2 = "Hola"; entra en el string pool para ser mas eficiente. 

*/ 

// Para arreglar el codigo del ejercicio 1, se utiliza un equals(). 
 

