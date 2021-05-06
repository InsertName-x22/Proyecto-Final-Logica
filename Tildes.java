public class Tildes {

    public static String convertirUnicode(String letra,String cadena){

        StringBuilder str = new StringBuilder(cadena);
        int indice = -1;
        char caracter = 0;
        indice = str.lastIndexOf(letra);

        if(indice>=0 )
        {
            switch(letra){
                case "á": caracter = '\u00E1';
                    break;
                case "é": caracter = '\u00E9';
                    break;
                case "í": caracter = '\u00ED';
                    break;
                case "ó": caracter = '\u00F3';
                    break;
                case "ú": caracter = '\u00FA';
                    break;
                case "ñ": caracter = '\u00F1';
                    break;
                case "Á": caracter = '\u00C1';
                    break;
                case "É": caracter = '\u00C9';
                    break;
                case "Í": caracter = '\u00CD';
                    break;
                case "Ó": caracter = '\u00D3';
                    break;
                case "Ú": caracter = '\u00DA';
                    break;
                case "Ñ": caracter = '\u00D1';
                    break;
            }
            str.replace(indice,indice+2,""+caracter);
        }

        return str.toString();
    }

    public static void imprimir(String cadena) {
        String str;
        str = convertirUnicode("á", cadena);
        str = convertirUnicode("é", str);
        str = convertirUnicode("í", str);
        str = convertirUnicode("ó", str);
        str = convertirUnicode("ú", str);
        str = convertirUnicode("ñ", str);
        str = convertirUnicode("Á", str);
        str = convertirUnicode("É", str);
        str = convertirUnicode("Í", str);
        str = convertirUnicode("Ó", str);
        str = convertirUnicode("Ú", str);
        str = convertirUnicode("Ñ", str);
        System.out.println(str);
    }

    public static void main(String[] args) {

        System.out.println("ÁÉÍÓÚÑ");
    }


}


