        String original = "este es el curso de Programación 2";
        StringBuilder result = new StringBuilder("hola");
        int index = original.indexOf('a');
        
        
        result.setCharAt(0, original.charAt(0)); // "eola"
        System.out.println(result);
        
        result.setCharAt(1, original.charAt(original.length()-1)); //e2la
        System.out.println(result);
        
        result.insert(1, original.charAt(4)); //e 2la
        System.out.println(result);

        result.append(original.substring(1,4)); //e 2laste
        System.out.println(result);

        
        System.out.println(index);
        System.out.println(index+2);

        System.out.println(original.substring(25,  27));    
        
        result.insert(3, (original.substring(index, index+2) + " "));
        System.out.println(result); // Aca te da como resultado e 2am laste, apartir del indice 3, inseta "am" + " "

