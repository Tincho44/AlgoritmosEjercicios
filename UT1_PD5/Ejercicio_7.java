/*

El stringBuilder es una clase de java que te permite crear strings de una forma mas eficiente. En comparacion con la clase String, 
stringBuilder te permite crear objetos que si son mutables, en String no lo son. Que significa esto? Que cuando creamos un objeto tipo 
String y lo vamos modificando, por cada modificacion, se guarda un espacio de memoria, mientras que en stringBuilder, se ma modificando el espacio de 
memoria que se uso para crear el objeto. Lo que se puede hacer es crear un tipo de objeto stringBuilder, hacer todas las modificaciones y luego 
pasarlo a un objeto de tipo String para usar los metodos de String.

*/

/*

Algunos metodos muy usados en stringBuilder:

Constructores: La clase StringBuilder proporciona varios constructores que se pueden utilizar para crear un objeto StringBuilder. 
Estos constructores pueden tomar una cadena inicial o una capacidad inicial como parámetro.

setLength(int length): Este método establece la longitud de la cadena dentro del objeto StringBuilder. Si se especifica una longitud menor que la actual, 
se eliminarán los caracteres adicionales. Si se especifica una longitud mayor que la actual, se agregarán caracteres nulos para alcanzar la nueva longitud.

ensureCapacity(int minimumCapacity): Este método garantiza que el objeto StringBuilder tenga al menos la capacidad especificada. 
Si la capacidad actual es menor que la especificada, se reservará más espacio en memoria para acomodar la nueva capacidad.

append(Object obj): Este método agrega la representación en cadena del objeto especificado al final del objeto StringBuilder.

insert(int offset, Object obj): Este método inserta la representación en cadena del objeto especificado en la posición especificada dentro del objeto StringBuilder.

delete(int start, int end): Este método elimina los caracteres de la cadena del objeto StringBuilder desde la posición de inicio hasta la posición de fin especificadas.

deleteCharAt(int index): Este método elimina el carácter en la posición especificada dentro del objeto StringBuilder.

reverse(): Este método invierte el orden de los caracteres dentro del objeto StringBuilder.

*/
