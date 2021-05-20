import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.Color.WHITE;
import java.io.*;
import java.io.StringBufferInputStream;
import java.util.*;
public class Programa {

    public static void menu() {

        AnsiConsole.systemInstall();
        System.out.println("              |                                                                                                                                                                          |             ");
        System.out.println("              |                                                                                                                                                                          |             ");
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a(" ---.  .---.     .-''-.    .---.     .---.     ,---.    ,---.  ___    _    .-'''-. ").fg(YELLOW).a(".-./`)").fg(CYAN).a("     _______").fg(WHITE).a("                                   |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a("|   |  |").fg(YELLOW).a("_ _").fg(CYAN).a("|   .'").fg(YELLOW).a("_ _").fg(CYAN).a("   \\   | ").fg(YELLOW).a(",_").fg(CYAN).a("|     | ,_|     |    \\  /    |.'   |  | |  / _     \\").fg(YELLOW).a("\\ .-.')   ").fg(CYAN).a("/   __  \\").fg(WHITE).a("                                  |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a("|   |  ").fg(YELLOW).a("( ' )  ").fg(CYAN).a("/").fg(YELLOW).a(" ( ` )").fg(CYAN).a("   '").fg(YELLOW).a(",-./  )   ,-./  )").fg(CYAN).a("     |  ,  \\/  ,  ||   .'  | | ").fg(YELLOW).a("(`' )").fg(CYAN).a("/`--'").fg(YELLOW).a("/ `-' \\").fg(CYAN).a("  | ").fg(YELLOW).a(",_").fg(CYAN).a("/  \\__)").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a("|   '-").fg(YELLOW).a("(_{;}_)").fg(CYAN).a(".").fg(YELLOW).a(" (_ o _)  ").fg(CYAN).a("|").fg(YELLOW).a("\\  '_ '`) \\  '_ '`)").fg(CYAN).a("   |  |\\").fg(YELLOW).a("_").fg(CYAN).a("   /|  |.'  '_  | |").fg(YELLOW).a("(_ o _)").fg(CYAN).a(".").fg(YELLOW).a("    `-'`'`,-./  )").fg(WHITE).a("                                       |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a("|      ").fg(YELLOW).a("(_,_)").fg(CYAN).a(" |  ").fg(YELLOW).a("(_,_)").fg(CYAN).a("___| ").fg(YELLOW).a("> (_)  )  > (_)  )   ").fg(CYAN).a("|  ").fg(YELLOW).a("_( )_").fg(CYAN).a("/ |  |'   ").fg(YELLOW).a("( \\.-.").fg(CYAN).a("| ").fg(YELLOW).a("(_,_)").fg(CYAN).a(". '.  .---. ").fg(YELLOW).a("\\  '_ '`)").fg(WHITE).a("                                     |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a("| ").fg(YELLOW).a("_ _").fg(CYAN).a("--.   | '  \\   .---.").fg(YELLOW).a("(  .  .-' (  .  .-'   ").fg(CYAN).a("| ").fg(YELLOW).a("(_ o _)").fg(CYAN).a(" |  |' ").fg(YELLOW).a("(`. _` /").fg(CYAN).a("|.---.  \\  : |   |  ").fg(YELLOW).a("> (_)  ) ").fg(CYAN).a(" __").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a("|").fg(YELLOW).a("( ' )").fg(CYAN).a(" |   |  \\  `-'    / ").fg(YELLOW).a("`-'`-'").fg(CYAN).a("|___").fg(YELLOW).a("`-'`-'").fg(CYAN).a("|___ |  ").fg(YELLOW).a("(_,_)").fg(CYAN).a("  |  || ").fg(YELLOW).a("(_ (_) _)").fg(CYAN).a("\\    `-'  | |   | ").fg(YELLOW).a("(  .  .-'").fg(CYAN).a("_/  )").fg(WHITE).a("                                |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(YELLOW).a("(_{;}_)").fg(CYAN).a("|   |   \\       /   |        \\|        \\|  |      |  | \\ ").fg(YELLOW).a("/  . \\ ").fg(CYAN).a("/ \\       /  |   |  ").fg(YELLOW).a("`-'`-'").fg(CYAN).a("     /").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |                                  ").fg(CYAN).a("'").fg(YELLOW).a("(_,_)").fg(CYAN).a(" '---'    `'-..-'    `--------``--------`'--'      '--'  `").fg(YELLOW).a("`-'`-'").fg(CYAN).a("'   `-...-'   '---'    `._____.'").fg(WHITE).a("                                  |").reset());

        System.out.println("              |                                                                                                                                                                          |             ");
        System.out.println("              |                                                                                                                                                                          |");
        System.out.println("              |                                                                                                                                                                          |");
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    ").fg(WHITE).a("@@@@@@@@@@@.").fg(CYAN).a("/&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,                      ").fg(WHITE).a("@@@@@@@@@@@.").fg(CYAN).a("/&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,    ").fg(WHITE).a("|             ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@").fg(WHITE).a("                      @@@@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@    ").fg(WHITE).a("|      ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@@@").fg(CYAN).a(". &&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|         ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@@@").fg(CYAN).a(".(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@@").fg(CYAN).a(".(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|      ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@@").fg(CYAN).a(".&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@").fg(CYAN).a(".&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|      ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@").fg(CYAN).a(" &&&&&&&&&&&%.&&&&&..").fg(WHITE).a("@").fg(CYAN).a(".%&&&&&&&&&&&&&&&,.").fg(WHITE).a("@@").fg(CYAN).a(",(&&&&&&%&&&&&(&&&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a(" &&&&&&&&&&&%.&&&&&.").fg(WHITE).a(".@").fg(CYAN).a(".%&&&&&&&&&&&&&&&,.").fg(WHITE).a("@@").fg(CYAN).a(",(&&&&&&%&&&&&(&&&&&&&&    ").fg(WHITE).a("|              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@").fg(CYAN).a("./&&&&&&&&&&%.&&&&%..").fg(WHITE).a("@@").fg(CYAN).a(".*&&&&&&,&&&&&&&*.").fg(WHITE).a("@@@@").fg(CYAN).a(".%&&&&&%*&&&&&*&&&&&&&").fg(WHITE).a("                      @@@").fg(CYAN).a("./&&&&&&&&&&%.&&&&%.").fg(WHITE).a(".@@").fg(CYAN).a(".*&&&&&&,&&&&&&&*.").fg(WHITE).a("@@@@").fg(CYAN).a(".%&&&&&%*&&&&&*&&&&&&&    ").fg(WHITE).a("|                          ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@").fg(CYAN).a("..&&&&&&&&&&..&&&%..").fg(WHITE).a("@@@@").fg(CYAN).a(",.&&&&&.*&&&&&&..").fg(WHITE).a("@@@@@@").fg(CYAN).a(".(&&&&&,*%&&&,&&&&&&&").fg(WHITE).a("                      @@").fg(CYAN).a("..&&&&&&&&&&..&&&%.").fg(WHITE).a(".@@@@").fg(CYAN).a(",.&&&&&.*&&&&&&..").fg(WHITE).a("@@@@@@").fg(CYAN).a(".(&&&&&,*%&&&,&&&&&&&    ").fg(WHITE).a("|                             ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@").fg(CYAN).a(".&&&&&&&&&#.(&&/").fg(WHITE).a("  ..   ..").fg(CYAN).a("  &&&&.,&&&&&.").fg(WHITE).a(",@&,,.... ").fg(CYAN).a(".&&&&&.,&&&**&&&&&&").fg(WHITE).a("                      @@").fg(CYAN).a(".&&&&&&&&&#.(&&/").fg(WHITE).a(". ..   ..  ").fg(CYAN).a("&&&&.,&&&&&.,").fg(WHITE).a("@&,,.... ").fg(CYAN).a(".&&&&&.,&&&**&&&&&&    ").fg(WHITE).a("|                                         ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @").fg(CYAN).a(",.&&&&&&%%./&/").fg(WHITE).a(" ,@@@@@@@@@@@").fg(CYAN).a(",*&&&..&&%,.").fg(WHITE).a("@@@@@@@@@@@@").fg(CYAN).a(",/&*/&*.&&%.&&&&&&").fg(WHITE).a("      1.Lista         @").fg(CYAN).a(",.&&&&&&%%./&/").fg(WHITE).a(" ,@@@@@@@@@@@").fg(CYAN).a(",*&&&..&&%,.").fg(WHITE).a("@@@@@@@@@@@@").fg(CYAN).a(",/&*/&*.&&%.&&&&&&    ").fg(WHITE).a("|                                    ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @").fg(CYAN).a(".%&&&&,#..").fg(WHITE).a(".@@@@@@@@@@@@@@@@@").fg(CYAN).a("(.%&&..,%").fg(WHITE).a("@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&,%%.&&&&&&").fg(WHITE).a("      2.Reproducir    @").fg(CYAN).a(".%&&&&,#..").fg(WHITE).a(".@@@@@@@@@@@@@@@@@").fg(CYAN).a("(.%&&..,").fg(WHITE).a("%@@@@@@@@@@@@@@@@,").fg(CYAN).a(",&&&&,%%.&&&&&&    ").fg(WHITE).a("|                              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @").fg(CYAN).a(".&&&&.(&% ").fg(WHITE).a(" @@@@@@@@@@@@@@#@@@@@").fg(CYAN).a(",/&/,").fg(WHITE).a("@@@@@@%&@@@@@@@@@@@@").fg(CYAN).a("**&&&,.&&&&&&").fg(WHITE).a("      3.Letras        @").fg(CYAN).a(".&&&&.(&%").fg(WHITE).a("  @@@@@@@@@@@@@@#@@@@@").fg(CYAN).a(",/&/,").fg(WHITE).a("@@@@@@%&@@@@@@@@@@@@").fg(CYAN).a("**&&&,.&&&&&&    ").fg(WHITE).a("|                           ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @").fg(CYAN).a(".&&&.,&&&%").fg(WHITE).a(" @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@").fg(CYAN).a("*.&&&&&&").fg(WHITE).a("      4.Random        @").fg(CYAN).a(".&&&.,&&&%").fg(WHITE).a(" @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@*").fg(CYAN).a(".&&&&&&    ").fg(WHITE).a("|                           ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @").fg(CYAN).a(".%&..,&&&&").fg(WHITE).a(".@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@").fg(CYAN).a("..&&&&&&").fg(WHITE).a("      5.Indice        @").fg(CYAN).a(".%&..,&&&&").fg(WHITE).a(".@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@").fg(CYAN).a("..&&&&&&    ").fg(WHITE).a("|                               ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @").fg(CYAN).a("(*,,.&&&&%").fg(WHITE).a(".%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@").fg(CYAN).a(".%&&&&&&").fg(WHITE).a("      6.Salir         @").fg(CYAN).a("(*,,.&&&&%").fg(WHITE).a(".%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@").fg(CYAN).a(".%&&&&&&    ").fg(WHITE).a("|                   ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@").fg(CYAN).a(",.%.&%%%#").fg(RED).a("**%%%%%%%&&&&").fg(WHITE).a("@@&,@@@@@@@@@@@@@..@@@@").fg(RED).a("&, .%&&&&&&&@@").fg(CYAN).a(",.&&&&S&&&").fg(WHITE).a("                     @@").fg(CYAN).a(",.%.&%%%#").fg(RED).a("**%%%%%%%&&&&").fg(WHITE).a("@@&,@@@@@@@@@@@@@..@@@@").fg(RED).a("&, .%&&&&&&&@@").fg(CYAN).a(",.&&&&&&&    ").fg(WHITE).a("|                           ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@&").fg(CYAN).a("//.&%%%%").fg(RED).a(" ,%%%%%%%%%&&&").fg(WHITE).a("@@  @@@.. .@@@@  (@@").fg(RED).a("&&&&%%%%%%%%&&&@").fg(CYAN).a(".%&&&&&&&").fg(WHITE).a("                      @@&").fg(CYAN).a("//.&%%%%").fg(RED).a(" ,%%%%%%%%%&&&").fg(WHITE).a("@@  @@@.. .@@@@  (@@").fg(RED).a("&&&&%%%%%%%%&&&@").fg(CYAN).a(".%&&&&&&&    ").fg(WHITE).a("|                              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@").fg(CYAN).a(",.%%%%#").fg(RED).a(" %%%%%%%%%%&&").fg(WHITE).a("@@@@..  .@@..  . @@@").fg(RED).a("&&&&%%%%%%%%%%%&").fg(CYAN).a(".,%%&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a(",.%%%%#").fg(RED).a(" %%%%%%%%%%&&").fg(WHITE).a("@@@@..  .@@..  . @@@").fg(RED).a("&&&&%%%%%%%%%%%&").fg(CYAN).a(".,%%&&&&&&    ").fg(WHITE).a("|                              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@").fg(CYAN).a("..&%%%%").fg(RED).a(" %&&&&&&&&&").fg(WHITE).a("@@@@@@@@@@@@@@@@@@@@@@@").fg(RED).a("&&&&&&%%%%%&&&").fg(CYAN).a("..%%%&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a("..&%%%%").fg(RED).a(" %&&&&&&&&&").fg(WHITE).a("@@@@@@@@@@@@@@@@@@@@@@@").fg(RED).a("&&&&&&%%%%%&&&").fg(CYAN).a("..%%%&&&&&&    ").fg(WHITE).a("|                                  ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@%").fg(CYAN).a(",.&&&&(").fg(WHITE).a(" *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&").fg(CYAN).a(",.&%%&&&&&..").fg(WHITE).a("                      @@@%").fg(CYAN).a(",.&&&&(").fg(WHITE).a(" *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&").fg(CYAN).a(",.&%%&&&&&").fg(WHITE).a("..    ").fg(WHITE).a("|                                  ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@").fg(CYAN).a("(..,&&&.*").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&&&&(").fg(WHITE).a("..&                      @@@").fg(CYAN).a("(..,&&&.*").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&&&&").fg(WHITE).a("(..&    ").fg(WHITE).a("|                          ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@%").fg(CYAN).a(".&.%&&../ ").fg(WHITE).a(".&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",%&&&&&&&.").fg(WHITE).a(",&&&                      @@@%").fg(CYAN).a(".&.%&&../").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",%&&&&&&&.").fg(WHITE).a(",&&&    ").fg(WHITE).a("|                             ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@&").fg(CYAN).a(",%&.#& ////*").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(").fg(CYAN).a("  %&&&&&/ ").fg(WHITE).a("(&&&&&                      @@@&").fg(CYAN).a(",%&.#& ////*").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a("(  %&&&&&/ ").fg(WHITE).a("(&&&&&    ").fg(WHITE).a("|                                    ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("              |    @@@@").fg(CYAN).a(",&&&&,.,////////,  ").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",.. .//,,&&&&&. /").fg(WHITE).a("//&&&&&&                      @@@@").fg(CYAN).a(",&&&&,.,////////,").fg(WHITE).a("  .*@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",.. .//,,&&&&&. /").fg(WHITE).a("//&&&&&&    ").fg(WHITE).a("|                     ").reset());
    }

    //Tildes
    public static String convertirUnicode(String letra, String cadena) {

        StringBuilder str = new StringBuilder(cadena);
        int indice = -1;
        char caracter = 0;
        indice = str.lastIndexOf(letra);

        if (indice >= 0)
        {
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
            str.replace(indice,indice + 1,""+caracter);
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




    public static StringBuilder obtenerLetraCancion(int inicio, int fin, String[] data) {
        StringBuilder str = new StringBuilder();
        StringTokenizer temp;

        for (int i = inicio; i <= fin; i++) {
            temp = new StringTokenizer(data[i], ";");

            while (temp.hasMoreTokens()) {
                System.out.print(temp.nextToken() + " ");
            }
            System.out.println();
        }
        return str;
    }




    public static void main(String[] args) {
        Audio audio = new Audio();
        int opcion = 0, numero_cancion = 0, inicio_letra = 0, fin_letra = 0;
        String[] canciones;
        String[][] info_canciones;
        StringBuilder letra_cancion;

        canciones = ConsoleFile.readBigFile("recursos/letras.csv");
        info_canciones = ConsoleData.dataList(canciones);

        try {
            System.out.println();
            menu();


            do {
                opcion = ConsoleInput.getInt();

                if(opcion == 1){
                    File lista = new File("canciones");
                    String[] nombre = lista.list();

                    int a = 0;
                    for(int i=0; i<nombre.length; i++){
                        System.out.println(a + ". " + nombre[i]);
                        a++;
                    }
                    
                    System.out.println("Desea volver al menu si/no");
                    Scanner datos7 = new Scanner(System.in);
                    String respuesta7 = datos7.nextLine();
                    respuesta7 = respuesta7.toLowerCase();
                    if (respuesta7.equals("si")) {
                        System.out.println();
                        menu();
                    }
                }


                if (opcion == 2) {


                    String respuesta5;
                    do {
                        audio.detener();
                        imprimir2("Ingrese el número de la canción, entre 0 y " + (info_canciones.length - 1));
                        numero_cancion = ConsoleInput.getInt();
                        imprimir("Nombre: " + info_canciones[numero_cancion][ConsoleData.NOMBRE_CANCION]);
                        audio.seleccionarCancion(info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
                        audio.reproducir();

                        System.out.println("");
                        System.out.println(ansi().eraseScreen().fg(CYAN).a("Desea mirar la letra si/no").reset());

                        Scanner datos4 = new Scanner(System.in);
                        String respuesta4 = datos4.nextLine();
                        respuesta4 = respuesta4.toLowerCase();
                        if (respuesta4.equals("si")) {
                            inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                            fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                            letra_cancion = obtenerLetraCancion(inicio_letra, fin_letra, canciones);
                        }

                        System.out.println("");
                        System.out.println("Desea escuchar otra cancion si/no ");
                        Scanner datos5 = new Scanner(System.in);
                        respuesta5 = datos5.nextLine();
                        respuesta5 = respuesta5.toLowerCase();

                    } while (respuesta5.equals("si"));

                    System.out.println("");
                    System.out.println("Desea volver al menu si/no");

                    Scanner datos7 = new Scanner(System.in);
                    String respuesta = datos7.nextLine();
                    respuesta = respuesta.toLowerCase();
                    if (respuesta.equals("si")) {
                        System.out.println();
                        menu();
                        audio.detener();
                    }
                }
                if (opcion == 3) {
                    imprimir2("Ingrese el número de la canción, entre 0 y " + (info_canciones.length-1));
                    numero_cancion = ConsoleInput.getInt();
                    inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                    fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                    letra_cancion = obtenerLetraCancion(inicio_letra, fin_letra, canciones);

                    imprimir3(letra_cancion.toString());
                    System.out.println("Desea volver al menu si/no");
                    Scanner datos1 = new Scanner(System.in);
                    String respuesta1 = datos1.nextLine();
                    respuesta1 = respuesta1.toLowerCase();
                    if (respuesta1.equals("si")) {
                        System.out.println();
                        menu();
                    }
                }

                if (opcion == 4) {

                    String respuesta8;
                    do {
                        audio.detener();

                        int numero_cancion1 = (int) Math.floor(Math.random() * info_canciones.length);


                        audio.seleccionarCancion(info_canciones[numero_cancion1][ConsoleData.RUTA_CANCION]);
                        audio.reproducir();

                        imprimir("Nombre: " + info_canciones[numero_cancion1][ConsoleData.NOMBRE_CANCION]);

                        System.out.println("");
                        System.out.println("Desea mirar la letra si/no");

                        Scanner datos6 = new Scanner(System.in);
                        String respuesta6 = datos6.nextLine();
                        respuesta6 = respuesta6.toLowerCase();

                        if (respuesta6.equals("si")) {
                            inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                            fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                            letra_cancion = obtenerLetraCancion(inicio_letra, fin_letra, canciones);
                        }
                        System.out.println("");
                        System.out.println("Desea escuchar otra cancion si/no ");
                        Scanner datos5 = new Scanner(System.in);
                        respuesta8 = datos5.nextLine();
                        respuesta8 = respuesta8.toLowerCase();


                    }while(respuesta8.equals("si"));

                    System.out.println("");
                    System.out.println("Desea volver al menu si/no");

                    Scanner datos2 = new Scanner(System.in);
                    String respuesta2 = datos2.nextLine();
                    respuesta2 = respuesta2.toLowerCase();
                    if (respuesta2.equals("si")) {
                        audio.detener();
                        System.out.println();
                        menu();
                    }
                }

                if (opcion == 5) {
                    imprimir("Ingrese indice de la cancion, entre 0 y " + (info_canciones.length-1 ));
                    numero_cancion = ConsoleInput.getInt();
                    inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                    fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                    System.out.println();


                    imprimir("Nombre : " + info_canciones[numero_cancion][ConsoleData.NOMBRE_CANCION]);
                    imprimir("Autor  : " + info_canciones[numero_cancion][ConsoleData.AUTOR_CANCION]);
                    imprimir("Archivo: " + info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
                    imprimir("Album  : " + info_canciones[numero_cancion][ConsoleData.ALBUM_CANCION]);
                    imprimir("Año    : " + info_canciones[numero_cancion][ConsoleData.ANO_CANCION]);
                    imprimir("Link   : " + info_canciones[numero_cancion][ConsoleData.RUTA_LINK]);

                    System.out.println("");
                    System.out.println("Desea volver al menu si/no");
                    Scanner datos3 = new Scanner(System.in);
                    String respuesta3 = datos3.nextLine();
                    respuesta3 = respuesta3.toLowerCase();
                    if(respuesta3.equals("si")){
                        System.out.println();
                        menu();}
                }
            } while (opcion != 6);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            audio.detener();
        }
    }

}


