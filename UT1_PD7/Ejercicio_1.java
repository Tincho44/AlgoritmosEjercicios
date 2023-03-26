
String s = "1";
while (s != "1000") {
s += "0";
}

/* 

Lo que sucede aca, y el motivo por el cual es un bucle infinito es que java aca esta comparando el lugar de memoria que se encuentran ambos, y al ser diferente
nunca termina. Esto ocurre por que se utiliza !=, en cambio si se utiliza equals(), aca se compara el valor y no el espacio en memoria.

En lenguajes como C#, el !=, el compilador automaticamente llama al metodo equals(), por lo cual al hacer !=, esta usando un equals(), y por eso
el resultado es diferente.

*/


