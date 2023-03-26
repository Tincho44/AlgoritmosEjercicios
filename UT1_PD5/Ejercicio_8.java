StringBuilder sb = new StringBuilder("Able was I ere I saw
Elba.");
                                     
// La capacidad inicial es de 26 (que son los caracteres que tiene el stringBuilder en esta ocasion + 16 que proporciona la misma clase, dando un total de 42.
                                     
// Para comprobarlo hice:
                                     
StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
System.out.println(sb.capacity());
