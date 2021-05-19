import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.Color.WHITE;

import java.io.StringBufferInputStream;
import java.util.*;
public class Programa {

    public static void menu() {

        AnsiConsole.systemInstall();
        System.out.println("                |                                                                                                                                                                          |             ");
        System.out.println("                |                                                                                                                                                                          |             ");
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a(" ---.  .---.     .-''-.    .---.     .---.     ,---.    ,---.  ___    _    .-'''-. ").fg(YELLOW).a(".-./`)").fg(CYAN).a("     _______").fg(WHITE).a("                                   |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a("|   |  |").fg(YELLOW).a("_ _").fg(CYAN).a("|   .'").fg(YELLOW).a("_ _").fg(CYAN).a("   \\   | ").fg(YELLOW).a(",_").fg(CYAN).a("|     | ,_|     |    \\  /    |.'   |  | |  / _     \\").fg(YELLOW).a("\\ .-.')   ").fg(CYAN).a("/   __  \\").fg(WHITE).a("                                  |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a("|   |  ").fg(YELLOW).a("( ' )  ").fg(CYAN).a("/").fg(YELLOW).a(" ( ` )").fg(CYAN).a("   '").fg(YELLOW).a(",-./  )   ,-./  )").fg(CYAN).a("     |  ,  \\/  ,  ||   .'  | | ").fg(YELLOW).a("(`' )").fg(CYAN).a("/`--'").fg(YELLOW).a("/ `-' \\").fg(CYAN).a("  | ").fg(YELLOW).a(",_").fg(CYAN).a("/  \\__)").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a("|   '-").fg(YELLOW).a("(_{;}_)").fg(CYAN).a(".").fg(YELLOW).a(" (_ o _)  ").fg(CYAN).a("|").fg(YELLOW).a("\\  '_ '`) \\  '_ '`)").fg(CYAN).a("   |  |\\").fg(YELLOW).a("_").fg(CYAN).a("   /|  |.'  '_  | |").fg(YELLOW).a("(_ o _)").fg(CYAN).a(".").fg(YELLOW).a("    `-'`'`,-./  )").fg(WHITE).a("                                       |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a("|      ").fg(YELLOW).a("(_,_)").fg(CYAN).a(" |  ").fg(YELLOW).a("(_,_)").fg(CYAN).a("___| ").fg(YELLOW).a("> (_)  )  > (_)  )   ").fg(CYAN).a("|  ").fg(YELLOW).a("_( )_").fg(CYAN).a("/ |  |'   ").fg(YELLOW).a("( \\.-.").fg(CYAN).a("| ").fg(YELLOW).a("(_,_)").fg(CYAN).a(". '.  .---. ").fg(YELLOW).a("\\  '_ '`)").fg(WHITE).a("                                     |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a("| ").fg(YELLOW).a("_ _").fg(CYAN).a("--.   | '  \\   .---.").fg(YELLOW).a("(  .  .-' (  .  .-'   ").fg(CYAN).a("| ").fg(YELLOW).a("(_ o _)").fg(CYAN).a(" |  |' ").fg(YELLOW).a("(`. _` /").fg(CYAN).a("|.---.  \\  : |   |  ").fg(YELLOW).a("> (_)  ) ").fg(CYAN).a(" __").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a("|").fg(YELLOW).a("( ' )").fg(CYAN).a(" |   |  \\  `-'    / ").fg(YELLOW).a("`-'`-'").fg(CYAN).a("|___").fg(YELLOW).a("`-'`-'").fg(CYAN).a("|___ |  ").fg(YELLOW).a("(_,_)").fg(CYAN).a("  |  || ").fg(YELLOW).a("(_ (_) _)").fg(CYAN).a("\\    `-'  | |   | ").fg(YELLOW).a("(  .  .-'").fg(CYAN).a("_/  )").fg(WHITE).a("                                |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(YELLOW).a("(_{;}_)").fg(CYAN).a("|   |   \\       /   |        \\|        \\|  |      |  | \\ ").fg(YELLOW).a("/  . \\ ").fg(CYAN).a("/ \\       /  |   |  ").fg(YELLOW).a("`-'`-'").fg(CYAN).a("     /").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |                                  ").fg(CYAN).a("'").fg(YELLOW).a("(_,_)").fg(CYAN).a(" '---'    `'-..-'    `--------``--------`'--'      '--'  `").fg(YELLOW).a("`-'`-'").fg(CYAN).a("'   `-...-'   '---'    `._____.'").fg(WHITE).a("                                  |").reset());

        System.out.println("                |                                                                                                                                                                          |             ");
        System.out.println("                |                                                                                                                                                                          |");
        System.out.println("                |                                                                                                                                                                          |");
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    ").fg(WHITE).a("@@@@@@@@@@@.").fg(CYAN).a("/&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,                      ").fg(WHITE).a("@@@@@@@@@@@.").fg(CYAN).a("/&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,    ").fg(WHITE).a("|             ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@").fg(WHITE).a("                      @@@@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@    ").fg(WHITE).a("|      ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@@@").fg(CYAN).a(". &&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|         ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@@@").fg(CYAN).a(".(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@@").fg(CYAN).a(".(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|      ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@@").fg(CYAN).a(".&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@").fg(CYAN).a(".&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|      ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@").fg(CYAN).a(" &&&&&&&&&&&%.&&&&&..").fg(WHITE).a("@").fg(CYAN).a(".%&&&&&&&&&&&&&&&,.").fg(WHITE).a("@@").fg(CYAN).a(",(&&&&&&%&&&&&(&&&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a(" &&&&&&&&&&&%.&&&&&.").fg(WHITE).a(".@").fg(CYAN).a(".%&&&&&&&&&&&&&&&,.").fg(WHITE).a("@@").fg(CYAN).a(",(&&&&&&%&&&&&(&&&&&&&&    ").fg(WHITE).a("|              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@").fg(CYAN).a("./&&&&&&&&&&%.&&&&%..").fg(WHITE).a("@@").fg(CYAN).a(".*&&&&&&,&&&&&&&*.").fg(WHITE).a("@@@@").fg(CYAN).a(".%&&&&&%*&&&&&*&&&&&&&").fg(WHITE).a("                      @@@").fg(CYAN).a("./&&&&&&&&&&%.&&&&%.").fg(WHITE).a(".@@").fg(CYAN).a(".*&&&&&&,&&&&&&&*.").fg(WHITE).a("@@@@").fg(CYAN).a(".%&&&&&%*&&&&&*&&&&&&&    ").fg(WHITE).a("|                          ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@").fg(CYAN).a("..&&&&&&&&&&..&&&%..").fg(WHITE).a("@@@@").fg(CYAN).a(",.&&&&&.*&&&&&&..").fg(WHITE).a("@@@@@@").fg(CYAN).a(".(&&&&&,*%&&&,&&&&&&&").fg(WHITE).a("                      @@").fg(CYAN).a("..&&&&&&&&&&..&&&%.").fg(WHITE).a(".@@@@").fg(CYAN).a(",.&&&&&.*&&&&&&..").fg(WHITE).a("@@@@@@").fg(CYAN).a(".(&&&&&,*%&&&,&&&&&&&    ").fg(WHITE).a("|                             ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@").fg(CYAN).a(".&&&&&&&&&#.(&&/").fg(WHITE).a("  ..   ..").fg(CYAN).a("  &&&&.,&&&&&.").fg(WHITE).a(",@&,,.... ").fg(CYAN).a(".&&&&&.,&&&**&&&&&&").fg(WHITE).a("                      @@").fg(CYAN).a(".&&&&&&&&&#.(&&/").fg(WHITE).a(". ..   ..  ").fg(CYAN).a("&&&&.,&&&&&.,").fg(WHITE).a("@&,,.... ").fg(CYAN).a(".&&&&&.,&&&**&&&&&&    ").fg(WHITE).a("|                                         ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @").fg(CYAN).a(",.&&&&&&%%./&/").fg(WHITE).a(" ,@@@@@@@@@@@").fg(CYAN).a(",*&&&..&&%,.").fg(WHITE).a("@@@@@@@@@@@@").fg(CYAN).a(",/&*/&*.&&%.&&&&&&").fg(WHITE).a("       Opcion 1       @").fg(CYAN).a(",.&&&&&&%%./&/").fg(WHITE).a(" ,@@@@@@@@@@@").fg(CYAN).a(",*&&&..&&%,.").fg(WHITE).a("@@@@@@@@@@@@").fg(CYAN).a(",/&*/&*.&&%.&&&&&&    ").fg(WHITE).a("|                                    ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @").fg(CYAN).a(".%&&&&,#..").fg(WHITE).a(".@@@@@@@@@@@@@@@@@").fg(CYAN).a("(.%&&..,%").fg(WHITE).a("@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&,%%.&&&&&&").fg(WHITE).a("       Opcion 2       @").fg(CYAN).a(".%&&&&,#..").fg(WHITE).a(".@@@@@@@@@@@@@@@@@").fg(CYAN).a("(.%&&..,").fg(WHITE).a("%@@@@@@@@@@@@@@@@,").fg(CYAN).a(",&&&&,%%.&&&&&&    ").fg(WHITE).a("|                              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @").fg(CYAN).a(".&&&&.(&% ").fg(WHITE).a(" @@@@@@@@@@@@@@#@@@@@").fg(CYAN).a(",/&/,").fg(WHITE).a("@@@@@@%&@@@@@@@@@@@@").fg(CYAN).a("**&&&,.&&&&&&").fg(WHITE).a("       Opcion 3       @").fg(CYAN).a(".&&&&.(&%").fg(WHITE).a("  @@@@@@@@@@@@@@#@@@@@").fg(CYAN).a(",/&/,").fg(WHITE).a("@@@@@@%&@@@@@@@@@@@@").fg(CYAN).a("**&&&,.&&&&&&    ").fg(WHITE).a("|                           ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @").fg(CYAN).a(".&&&.,&&&%").fg(WHITE).a(" @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@").fg(CYAN).a("*.&&&&&&").fg(WHITE).a("       Opcion 4       @").fg(CYAN).a(".&&&.,&&&%").fg(WHITE).a(" @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@*").fg(CYAN).a(".&&&&&&    ").fg(WHITE).a("|                           ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @").fg(CYAN).a(".%&..,&&&&").fg(WHITE).a(".@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@").fg(CYAN).a("..&&&&&&").fg(WHITE).a("       Opcion 5       @").fg(CYAN).a(".%&..,&&&&").fg(WHITE).a(".@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@").fg(CYAN).a("..&&&&&&    ").fg(WHITE).a("|                               ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @").fg(CYAN).a("(*,,.&&&&%").fg(WHITE).a(".%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@").fg(CYAN).a(".%&&&&&&").fg(WHITE).a("       Opcion 6       @").fg(CYAN).a("(*,,.&&&&%").fg(WHITE).a(".%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@").fg(CYAN).a(".%&&&&&&    ").fg(WHITE).a("|                   ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@").fg(CYAN).a(",.%.&%%%#").fg(RED).a("**%%%%%%%&&&&").fg(WHITE).a("@@&,@@@@@@@@@@@@@..@@@@").fg(RED).a("&, .%&&&&&&&@@").fg(CYAN).a(",.&&&&&&&").fg(WHITE).a("                      @@").fg(CYAN).a(",.%.&%%%#").fg(RED).a("**%%%%%%%&&&&").fg(WHITE).a("@@&,@@@@@@@@@@@@@..@@@@").fg(RED).a("&, .%&&&&&&&@@").fg(CYAN).a(",.&&&&&&&    ").fg(WHITE).a("|                           ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@&").fg(CYAN).a("//.&%%%%").fg(RED).a(" ,%%%%%%%%%&&&").fg(WHITE).a("@@  @@@.. .@@@@  (@@").fg(RED).a("&&&&%%%%%%%%&&&@").fg(CYAN).a(".%&&&&&&&").fg(WHITE).a("                      @@&").fg(CYAN).a("//.&%%%%").fg(RED).a(" ,%%%%%%%%%&&&").fg(WHITE).a("@@  @@@.. .@@@@  (@@").fg(RED).a("&&&&%%%%%%%%&&&@").fg(CYAN).a(".%&&&&&&&    ").fg(WHITE).a("|                              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@").fg(CYAN).a(",.%%%%#").fg(RED).a(" %%%%%%%%%%&&").fg(WHITE).a("@@@@..  .@@..  . @@@").fg(RED).a("&&&&%%%%%%%%%%%&").fg(CYAN).a(".,%%&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a(",.%%%%#").fg(RED).a(" %%%%%%%%%%&&").fg(WHITE).a("@@@@..  .@@..  . @@@").fg(RED).a("&&&&%%%%%%%%%%%&").fg(CYAN).a(".,%%&&&&&&    ").fg(WHITE).a("|                              ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@").fg(CYAN).a("..&%%%%").fg(RED).a(" %&&&&&&&&&").fg(WHITE).a("@@@@@@@@@@@@@@@@@@@@@@@").fg(RED).a("&&&&&&%%%%%&&&").fg(CYAN).a("..%%%&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a("..&%%%%").fg(RED).a(" %&&&&&&&&&").fg(WHITE).a("@@@@@@@@@@@@@@@@@@@@@@@").fg(RED).a("&&&&&&%%%%%&&&").fg(CYAN).a("..%%%&&&&&&    ").fg(WHITE).a("|                                  ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@%").fg(CYAN).a(",.&&&&(").fg(WHITE).a(" *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&").fg(CYAN).a(",.&%%&&&&&..").fg(WHITE).a("                      @@@%").fg(CYAN).a(",.&&&&(").fg(WHITE).a(" *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&").fg(CYAN).a(",.&%%&&&&&").fg(WHITE).a("..    ").fg(WHITE).a("|                                  ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@").fg(CYAN).a("(..,&&&.*").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&&&&(").fg(WHITE).a("..&                      @@@").fg(CYAN).a("(..,&&&.*").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&&&&").fg(WHITE).a("(..&    ").fg(WHITE).a("|                          ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@%").fg(CYAN).a(".&.%&&../ ").fg(WHITE).a(".&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",%&&&&&&&.").fg(WHITE).a(",&&&                      @@@%").fg(CYAN).a(".&.%&&../").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",%&&&&&&&.").fg(WHITE).a(",&&&    ").fg(WHITE).a("|                             ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@&").fg(CYAN).a(",%&.#& ////*").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(").fg(CYAN).a("  %&&&&&/ ").fg(WHITE).a("(&&&&&                      @@@&").fg(CYAN).a(",%&.#& ////*").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a("(  %&&&&&/ ").fg(WHITE).a("(&&&&&    ").fg(WHITE).a("|                                    ").reset());
        System.out.println(ansi().eraseScreen().fg(WHITE).a("                |    @@@@").fg(CYAN).a(",&&&&,.,////////,  ").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",.. .//,,&&&&&. /").fg(WHITE).a("//&&&&&&                      @@@@").fg(CYAN).a(",&&&&,.,////////,").fg(WHITE).a("  .*@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",.. .//,,&&&&&. /").fg(WHITE).a("//&&&&&&    ").fg(WHITE).a("|                     ").reset());
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
            do {
                System.out.println();
                menu();
                opcion = ConsoleInput.getInt();

                if (opcion == 2) {
                    imprimir("Ingrese el número de la canción, entre 0 y " + (info_canciones.length - 1));
                    numero_cancion = ConsoleInput.getInt();
                    audio.seleccionarCancion(info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
                    audio.reproducir();
                }
                if (opcion == 3) {
                    imprimir("Ingrese el número de la canción, entre 0 y " + (info_canciones.length - 1));
                    numero_cancion = ConsoleInput.getInt();
                    inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                    fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                    letra_cancion = obtenerLetraCancion(inicio_letra, fin_letra, canciones);

                    imprimir(letra_cancion.toString());
                }
                if (opcion == 4) {
                    audio.detener();
                }
                if (opcion == 5) {
                    imprimir("Ingrese indice de la cancion, entre 0 y " + (info_canciones.length - 1));
                    numero_cancion = ConsoleInput.getInt();
                    inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                    fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                    System.out.println();
                    imprimir("Inicio letra " + inicio_letra);
                    imprimir("Fin letra " + fin_letra);
                    imprimir("Nombre " + info_canciones[numero_cancion][ConsoleData.NOMBRE_CANCION]);
                    imprimir("Autor " + info_canciones[numero_cancion][ConsoleData.AUTOR_CANCION]);
                    imprimir("Archivo " + info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
                    imprimir("Primera estrofa: " + canciones[inicio_letra]);
                    imprimir("Última estrofa: " + canciones[fin_letra]);
                }
            } while (opcion != 6);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            audio.detener();
        }
    }

}


