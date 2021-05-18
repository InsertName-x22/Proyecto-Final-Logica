import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import java.io.StringBufferInputStream;
import java.util.*;
public class Programa {


    //Consola de Colores

    // Reset
    public static final String A = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    //Tildes
    public static String convertirUnicode(String letra, String cadena) {

        StringBuilder str = new StringBuilder(cadena);
        int indice = -1;
        char caracter = 0;
        indice = str.lastIndexOf(letra);

        if (indice >= 0) {
            switch (letra) {
                case "á":
                    caracter = '\u00E1';
                    break;
                case "é":
                    caracter = '\u00E9';
                    break;
                case "í":
                    caracter = '\u00ED';
                    break;
                case "ó":
                    caracter = '\u00F3';
                    break;
                case "ú":
                    caracter = '\u00FA';
                    break;
                case "ñ":
                    caracter = '\u00F1';
                    break;
                case "Á":
                    caracter = '\u00C1';
                    break;
                case "É":
                    caracter = '\u00C9';
                    break;
                case "Í":
                    caracter = '\u00CD';
                    break;
                case "Ó":
                    caracter = '\u00D3';
                    break;
                case "Ú":
                    caracter = '\u00DA';
                    break;
                case "Ñ":
                    caracter = '\u00D1';
                    break;
            }
            str.replace(indice, indice + 2, "" + caracter);
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
        str = convertirUnicode("⢕", str);
        str = convertirUnicode("⣿", str);
        str = convertirUnicode("⠿", str);
        str = convertirUnicode("⣛", str);
        
        System.out.println(str);
    }

    public static StringBuilder LetraCancion(int inicio, int fin, String[]data){
        StringBuilder str = new StringBuilder();
        StringTokenizer temp;

        for(int i = inicio; i<=fin; i++){
            temp = new StringTokenizer(data[i],";");

            while(temp.hasMoreTokens()){
                System.out.print(temp.nextToken()+" ");
            }
            System.out.println();
        }
        return str;
    }

    public static void menu(){

        System.out.println(A + "                |                                                                                                                                                                          |         ");
        System.out.println(A + "                |" + CYAN + "                                 .---.  .---.     .-''-.    .---.     .---.     ,---.    ,---.  ___    _    .-'''-. " + YELLOW + ".-./`)     " + CYAN + "_______                                    "+ A +          "|                                                                                                                            ");
        System.out.println(A + "                |" + CYAN + "                                 |   |  |" + YELLOW + "_ _" + CYAN + "|   .'" + YELLOW + "_ _" + CYAN + "   \\   | " + YELLOW + ",_" + CYAN + "|     | " + YELLOW + ",_" + CYAN + "|     |    \\  /    |.'   |  | |  / " + YELLOW + "_" + CYAN + "     \\" + YELLOW + "\\ .-.')" + CYAN + "   /   __  \\                                   " + A + "|                  ");
        System.out.println(A + "                |" + CYAN + "                                 |   |  " + YELLOW + "( ' )" + CYAN + "  / " + YELLOW + "( ` )" + CYAN + "   '" + YELLOW + ",-./  )   ,-./  )" + CYAN + "     |  ,  \\/  ,  ||   .'  | | " + YELLOW + "(`' )" + CYAN + "/`--'" + YELLOW + "/ `-' \\" + CYAN + "  | " + YELLOW + ",_" + CYAN + "/  \\__)                                  " + A + "|             ");
        System.out.println(A + "                |" + CYAN + "                                 |   '-" + YELLOW + "(_{;}_)" + CYAN + "." + YELLOW + " (_ o _)" + CYAN + "  |" + YELLOW + "\\  '_ '`) \\  '_ '`)" + CYAN + "   |  |\\" + YELLOW + "_" + CYAN + "   /|  |.'  '" + YELLOW + "_" + CYAN + "  | |" + YELLOW + "(_ o _)" + CYAN + "." + YELLOW + "    `-'`'`,-./  )                                        " + A + "|            ");
        System.out.println(A + "                |" + CYAN + "                                 |      " + YELLOW + "(_,_)" + CYAN + " |  " + YELLOW + "(_,_)" + CYAN + "___| " + YELLOW + "> (_)  )  > (_)  )   " + CYAN + "|" + YELLOW + "  _( )_" + CYAN + "/ |  |'   " + YELLOW + "( \\.-." + CYAN + "| " + YELLOW + "(_,_)" + CYAN + ". '.  .---. " + YELLOW + "\\  '_ '`)                                      " + A + "|           ");
        System.out.println(A + "                |" + CYAN + "                                 | " + YELLOW + "_ _" + CYAN + "--.   | '  \\   .---." + YELLOW + "(  .  .-' (  .  .-'   " + CYAN + "| " + YELLOW + "(_ o _)" + CYAN + " |  |' " + YELLOW + "(`. _` /" + CYAN + "|.---.  \\  : |   |  " + YELLOW + "> (_)  )" + CYAN + "  __                                  " + A + "|           ");
        System.out.println(A + "                |" + YELLOW + "                                 (_{;}_)" + CYAN + "|   |   \\       /   |        \\|         |  " + YELLOW + "|" + CYAN + "      |  |" + YELLOW + " \\ /  . \\ /" + CYAN + " \\       /  |   |  " + YELLOW + "`-'`-'     " + CYAN + "/                                  " + A + "|                  ");
        System.out.println(A + "                |" + CYAN + "                                 |" + YELLOW + "( ' )" + CYAN + " |   |  \\  `-'    / `-'`-'|___`-'`-'|___ |  " + YELLOW + "(_,_)" + CYAN + "  |  || " + YELLOW + "(_ (_) _)" + CYAN + "\\    `-'  | |   |   (.  .-'_/)                                   " + A + "|            ");
        System.out.println(A + "                |" + CYAN + "                                 '" + YELLOW + "(_,_)" + CYAN + " '---'    `'-..-'    `--------``--------`'--'      '--'  " + YELLOW + "``-'`-''" + CYAN + "   `-...-'   '---'    `._____.'                                   " + A + "|               ");
        System.out.println(A + "                |                                                                                                                                                                          |             ");
        System.out.println(A + "                |                                                                                                                                                                          |");
        System.out.println(A + "                |                                                                                                                                                                          |");
        System.out.println("                |    @@@@@@@@@@@./&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,                      @@@@@@@@@@@./&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,    |             ");
        System.out.println("                |    @@@@@@@@@ .&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@                      @@@@@@@@@ .&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@    |      ");
        System.out.println("                |    @@@@@@@. &&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&                      @@@@@@@. &&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&    |         ");
        System.out.println("                |    @@@@@@.(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&                      @@@@@@.(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&    |      ");
        System.out.println("                |    @@@@@.&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&                      @@@@@.&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&    |      ");
        System.out.println("                |    @@@@ &&&&&&&&&&&%.&&&&&..@.%&&&&&&&&&&&&&&&,.@@,(&&&&&&%&&&&&(&&&&&&&&                      @@@@ &&&&&&&&&&&%.&&&&&..@.%&&&&&&&&&&&&&&&,.@@,(&&&&&&%&&&&&(&&&&&&&&    |              ");
        System.out.println("                |    @@@./&&&&&&&&&&%.&&&&%..@@.*&&&&&&,&&&&&&&*.@@@@.%&&&&&%*&&&&&*&&&&&&&                      @@@./&&&&&&&&&&%.&&&&%..@@.*&&&&&&,&&&&&&&*.@@@@.%&&&&&%*&&&&&*&&&&&&&    |                          ");
        System.out.println("                |    @@..&&&&&&&&&&..&&&%..@@@@,.&&&&&.*&&&&&&..@@@@@@.(&&&&&,*%&&&,&&&&&&&                      @@..&&&&&&&&&&..&&&%..@@@@,.&&&&&.*&&&&&&..@@@@@@.(&&&&&,*%&&&,&&&&&&&    |                             ");
        System.out.println("                |    @@.&&&&&&&&&#.(&&/  ..   ..  &&&&.,&&&&&.,@&,,.... .&&&&&.,&&&**&&&&&&                      @@.&&&&&&&&&#.(&&/. ..   ..  &&&&.,&&&&&.,@&,,.... .&&&&&.,&&&**&&&&&&    |                                         ");
        System.out.println("                |    @,.&&&&&&%%./&/ ,@@@@@@@@@@@,*&&&..&&%,.@@@@@@@@@@@@,/&*/&*.&&%.&&&&&&       Opcion 1       @,.&&&&&&%%./&/ ,@@@@@@@@@@@,*&&&..&&%,.@@@@@@@@@@@@,/&*/&*.&&%.&&&&&&    |                                    ");
        System.out.println("                |    @.%&&&&,#...@@@@@@@@@@@@@@@@@(.%&&..,%@@@@@@@@@@@@@@@@,,&&&&,%%.&&&&&&       Opcion 2       @.%&&&&,#...@@@@@@@@@@@@@@@@@(.%&&..,%@@@@@@@@@@@@@@@@,,&&&&,%%.&&&&&&    |                              ");
        System.out.println("                |    @.&&&&.(&%  @@@@@@@@@@@@@@#@@@@@,/&/,@@@@@@%&@@@@@@@@@@@@**&&&,.&&&&&&       Opcion 3       @.&&&&.(&%  @@@@@@@@@@@@@@#@@@@@,/&/,@@@@@@%&@@@@@@@@@@@@**&&&,.&&&&&&    |                           ");
        System.out.println("                |    @.&&&.,&&&% @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@*.&&&&&&       Opcion 4       @.&&&.,&&&% @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@*.&&&&&&    |                           ");
        System.out.println("                |    @.%&..,&&&&.@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@..&&&&&&       Opcion 5       @.%&..,&&&&.@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@..&&&&&&    |                               ");
        System.out.println("                |    @(*,,.&&&&%.%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@.%&&&&&&       Opcion 6       @(*,,.&&&&%.%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@.%&&&&&&    |                   ");
        System.out.println("                |    @@,.%.&%%%#**%%%%%%%&&&&@@&,@@@@@@@@@@@@@..@@@@&, .%&&&&&&&@@,.&&&&&&&                      @@,.%.&%%%#**%%%%%%%&&&&@@&,@@@@@@@@@@@@@..@@@@&, .%&&&&&&&@@,.&&&&&&&    |                           ");
        System.out.println("                |    @@&//.&%%%% ,%%%%%%%%%&&&@@  @@@.. .@@@@  (@@&&&&%%%%%%%%&&&@.%&&&&&&&                      @@&//.&%%%% ,%%%%%%%%%&&&@@  @@@.. .@@@@  (@@&&&&%%%%%%%%&&&@.%&&&&&&&    |                              ");
        System.out.println("                |    @@@@,.%%%%# %%%%%%%%%%&&@@@@..  .@@..  . @@@&&&&%%%%%%%%%%%&.,%%&&&&&&                      @@@@,.%%%%# %%%%%%%%%%&&@@@@..  .@@..  . @@@&&&&%%%%%%%%%%%&.,%%&&&&&&    |                              ");
        System.out.println("                |    @@@@..&%%%% %&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@&&&&&&%%%%%&&&..%%%&&&&&&                      @@@@..&%%%% %&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@&&&&&&%%%%%&&&..%%%&&&&&&    |                                  ");
        System.out.println("                |    @@@%,.&&&&( *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&,.&%%&&&&&..                      @@@%,.&&&&( *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&,.&%%&&&&&..    |                                  ");
        System.out.println("                |    @@@(..,&&&.*.*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,&&&&&&&(..&                      @@@(..,&&&.*.*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,&&&&&&&(..&    |                          ");
        System.out.println("                |    @@@%.&.%&&../ .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,%&&&&&&&.,&&&                      @@@%.&.%&&../ .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,%&&&&&&&.,&&&    |                             ");
        System.out.println("                |    @@@&,%&.#& ////* .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(  %&&&&&/ (&&&&&                      @@@&,%&.#& ////* .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(  %&&&&&/ (&&&&&    |                                    ");
        System.out.println("                |    @@@@,&&&&,.,////////,  .*@@@@@@@@@@@@@@@@@@@@,.. .//,,&&&&&. ///&&&&&&                      @@@@,&&&&,.,////////,  .*@@@@@@@@@@@@@@@@@@@@,.. .//,,&&&&&. ///&&&&&&    |                     ");


        public static void main(String[] args) {
            Audio audio = new Audio();
            int opcion = 0, numero_cancion = 0, inicio_letra = 0, fin_letra = 0;
            String [] canciones; 
            String [][] info_canciones;
            StringBuilder letra_cancion;

            canciones = ConsoleFile.readBigFile("recursos/letras.csv");
            info_canciones = ConsoleData.dataList(canciones);

            try {
                do{
                    System.out.println();
                    menu();
                    opcion = ConsoleInput.getInt();

                    if(opcion == 2){
                        imprimir("Ingrese el número de la canción, entre 0 y " + (info_canciones.length-1));
                        numero_cancion = ConsoleInput.getInt();
                        audio.seleccionarCancion(info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
					    audio.reproducir();
                    }
                    if(opcion == 3){
                        imprimir("Ingrese el número de la canción, entre 0 y " + (info_canciones.length-1));
                        numero_cancion = ConsoleInput.getInt();
                        inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
					    fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
					    letra_cancion = obtenerLetraCancion(inicio_letra,fin_letra,canciones);
                    }
                    if(opcion == 4){
                        audio.detener();
                    }
                    if(opcion == 5){
                        imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					numero_cancion = ConsoleInput.getInt();
					inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
					System.out.println();
					imprimir("Inicio letra "+inicio_letra);
					imprimir("Fin letra "+fin_letra);
					imprimir("Nombre "+info_canciones[numero_cancion][ConsoleData.NOMBRE_CANCION]);
					imprimir("Autor "+info_canciones[numero_cancion][ConsoleData.AUTOR_CANCION]);
					imprimir("Archivo "+info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
					imprimir("Primera estrofa: "+canciones[inicio_letra]);
					imprimir("Última estrofa: "+canciones[fin_letra]);
                    }
                }while(opcion!=6);
            } 
            catch (Exception e){
                System.out.println(e);
            }
            finally{
                audio.detener();
            }
    }
}




