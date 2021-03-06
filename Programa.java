import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.Color.WHITE;
import java.io.*;
import java.io.StringBufferInputStream;
import java.util.*;
public class Programa {


    //-----------------------------------------------------------------------------------------Interfaz Grafica Consola------------------------------------------------------------//
    public static void menu() {

        AnsiConsole.systemInstall();
        System.out.println("              |                                                                                                                                                                          |             ");
        System.out.println("              |                                                                                                                                                                          |             ");
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a(" ---.  .---.     .-''-.    .---.     .---.     ,---.    ,---.  ___    _    .-'''-. ").fg(YELLOW).a(".-./`)").fg(CYAN).a("     _______").fg(WHITE).a("                                   |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a("|   |  |").fg(YELLOW).a("_ _").fg(CYAN).a("|   .'").fg(YELLOW).a("_ _").fg(CYAN).a("   \\   | ").fg(YELLOW).a(",_").fg(CYAN).a("|     | ,_|     |    \\  /    |.'   |  | |  / _     \\").fg(YELLOW).a("\\ .-.')   ").fg(CYAN).a("/   __  \\").fg(WHITE).a("                                  |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a("|   |  ").fg(YELLOW).a("( ' )  ").fg(CYAN).a("/").fg(YELLOW).a(" ( ` )").fg(CYAN).a("   '").fg(YELLOW).a(",-./  )   ,-./  )").fg(CYAN).a("     |  ,  \\/  ,  ||   .'  | | ").fg(YELLOW).a("(`' )").fg(CYAN).a("/`--'").fg(YELLOW).a("/ `-' \\").fg(CYAN).a("  | ").fg(YELLOW).a(",_").fg(CYAN).a("/  \\__)").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a("|   '-").fg(YELLOW).a("(_{;}_)").fg(CYAN).a(".").fg(YELLOW).a(" (_ o _)  ").fg(CYAN).a("|").fg(YELLOW).a("\\  '_ '`) \\  '_ '`)").fg(CYAN).a("   |  |\\").fg(YELLOW).a("_").fg(CYAN).a("   /|  |.'  '_  | |").fg(YELLOW).a("(_ o _)").fg(CYAN).a(".").fg(YELLOW).a("    `-'`'`,-./  )").fg(WHITE).a("                                       |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a("|      ").fg(YELLOW).a("(_,_)").fg(CYAN).a(" |  ").fg(YELLOW).a("(_,_)").fg(CYAN).a("___| ").fg(YELLOW).a("> (_)  )  > (_)  )   ").fg(CYAN).a("|  ").fg(YELLOW).a("_( )_").fg(CYAN).a("/ |  |'   ").fg(YELLOW).a("( \\.-.").fg(CYAN).a("| ").fg(YELLOW).a("(_,_)").fg(CYAN).a(". '.  .---. ").fg(YELLOW).a("\\  '_ '`)").fg(WHITE).a("                                     |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a("| ").fg(YELLOW).a("_ _").fg(CYAN).a("--.   | '  \\   .---.").fg(YELLOW).a("(  .  .-' (  .  .-'   ").fg(CYAN).a("| ").fg(YELLOW).a("(_ o _)").fg(CYAN).a(" |  |' ").fg(YELLOW).a("(`. _` /").fg(CYAN).a("|.---.  \\  : |   |  ").fg(YELLOW).a("> (_)  ) ").fg(CYAN).a(" __").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a("|").fg(YELLOW).a("( ' )").fg(CYAN).a(" |   |  \\  `-'    / ").fg(YELLOW).a("`-'`-'").fg(CYAN).a("|___").fg(YELLOW).a("`-'`-'").fg(CYAN).a("|___ |  ").fg(YELLOW).a("(_,_)").fg(CYAN).a("  |  || ").fg(YELLOW).a("(_ (_) _)").fg(CYAN).a("\\    `-'  | |   | ").fg(YELLOW).a("(  .  .-'").fg(CYAN).a("_/  )").fg(WHITE).a("                                |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(YELLOW).a("(_{;}_)").fg(CYAN).a("|   |   \\       /   |        \\|        \\|  |      |  | \\ ").fg(YELLOW).a("/  . \\ ").fg(CYAN).a("/ \\       /  |   |  ").fg(YELLOW).a("`-'`-'").fg(CYAN).a("     /").fg(WHITE).a("                                 |").reset());
        System.out.println(ansi().fg(WHITE).a("              |                                  ").fg(CYAN).a("'").fg(YELLOW).a("(_,_)").fg(CYAN).a(" '---'    `'-..-'    `--------``--------`'--'      '--'  `").fg(YELLOW).a("`-'`-'").fg(CYAN).a("'   `-...-'   '---'    `._____.'").fg(WHITE).a("                                  |").reset());

        System.out.println("              |                                                                                                                                                                          |             ");
        System.out.println("              |                                                                                                                                                                          |");
        System.out.println("              |                                                                                                                                                                          |");
        System.out.println(ansi().fg(WHITE).a("              |    ").fg(WHITE).a("@@@@@@@@@@@.").fg(CYAN).a("/&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,                      ").fg(WHITE).a("@@@@@@@@@@@.").fg(CYAN).a("/&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&,    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@").fg(WHITE).a("                      @@@@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&/&&&&&&&&&&&&&&&&&&&&&&@    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@@@@ ").fg(CYAN).a(".&&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@@@").fg(CYAN).a(". &&&&&&&&&&&&&&&&&(,&&&&&&&&&&&&&&&&&&,&&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@@@").fg(CYAN).a(".(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@@").fg(CYAN).a(".(&&&&&&&&&&&&&&&&&& #&&&&&&&&&&&&&&&%,..&&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@@").fg(CYAN).a(".&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&").fg(WHITE).a("                      @@@@@").fg(CYAN).a(".&&&&&&&&&&&&&&&&&&%..%&&&&&&&&&&&&&&&&../,&&&&&&&&&&&&&&&&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@").fg(CYAN).a(" &&&&&&&&&&&%.&&&&&..").fg(WHITE).a("@").fg(CYAN).a(".%&&&&&&&&&&&&&&&,.").fg(WHITE).a("@@").fg(CYAN).a(",(&&&&&&%&&&&&(&&&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a(" &&&&&&&&&&&%.&&&&&.").fg(WHITE).a(".@").fg(CYAN).a(".%&&&&&&&&&&&&&&&,.").fg(WHITE).a("@@").fg(CYAN).a(",(&&&&&&%&&&&&(&&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@").fg(CYAN).a("./&&&&&&&&&&%.&&&&%..").fg(WHITE).a("@@").fg(CYAN).a(".*&&&&&&,&&&&&&&*.").fg(WHITE).a("@@@@").fg(CYAN).a(".%&&&&&%*&&&&&*&&&&&&&").fg(WHITE).a("                      @@@").fg(CYAN).a("./&&&&&&&&&&%.&&&&%.").fg(WHITE).a(".@@").fg(CYAN).a(".*&&&&&&,&&&&&&&*.").fg(WHITE).a("@@@@").fg(CYAN).a(".%&&&&&%*&&&&&*&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@").fg(CYAN).a("..&&&&&&&&&&..&&&%..").fg(WHITE).a("@@@@").fg(CYAN).a(",.&&&&&.*&&&&&&..").fg(WHITE).a("@@@@@@").fg(CYAN).a(".(&&&&&,*%&&&,&&&&&&&").fg(WHITE).a("                      @@").fg(CYAN).a("..&&&&&&&&&&..&&&%.").fg(WHITE).a(".@@@@").fg(CYAN).a(",.&&&&&.*&&&&&&..").fg(WHITE).a("@@@@@@").fg(CYAN).a(".(&&&&&,*%&&&,&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@").fg(CYAN).a(".&&&&&&&&&#.(&&/").fg(WHITE).a("  ..   ..").fg(CYAN).a("  &&&&.,&&&&&.").fg(WHITE).a(",@&,,.... ").fg(CYAN).a(".&&&&&.,&&&**&&&&&&").fg(WHITE).a("                      @@").fg(CYAN).a(".&&&&&&&&&#.(&&/").fg(WHITE).a(". ..   ..  ").fg(CYAN).a("&&&&.,&&&&&.,").fg(WHITE).a("@&,,.... ").fg(CYAN).a(".&&&&&.,&&&**&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @").fg(CYAN).a(",.&&&&&&%%./&/").fg(WHITE).a(" ,@@@@@@@@@@@").fg(CYAN).a(",*&&&..&&%,.").fg(WHITE).a("@@@@@@@@@@@@").fg(CYAN).a(",/&*/&*.&&%.&&&&&&").fg(WHITE).a("      1.Lista         @").fg(CYAN).a(",.&&&&&&%%./&/").fg(WHITE).a(" ,@@@@@@@@@@@").fg(CYAN).a(",*&&&..&&%,.").fg(WHITE).a("@@@@@@@@@@@@").fg(CYAN).a(",/&*/&*.&&%.&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @").fg(CYAN).a(".%&&&&,#..").fg(WHITE).a(".@@@@@@@@@@@@@@@@@").fg(CYAN).a("(.%&&..,%").fg(WHITE).a("@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&,%%.&&&&&&").fg(WHITE).a("      2.Reproducir    @").fg(CYAN).a(".%&&&&,#..").fg(WHITE).a(".@@@@@@@@@@@@@@@@@").fg(CYAN).a("(.%&&..,").fg(WHITE).a("%@@@@@@@@@@@@@@@@,").fg(CYAN).a(",&&&&,%%.&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @").fg(CYAN).a(".&&&&.(&% ").fg(WHITE).a(" @@@@@@@@@@@@@@#@@@@@").fg(CYAN).a(",/&/,").fg(WHITE).a("@@@@@@%&@@@@@@@@@@@@").fg(CYAN).a("**&&&,.&&&&&&").fg(WHITE).a("      3.Letras        @").fg(CYAN).a(".&&&&.(&%").fg(WHITE).a("  @@@@@@@@@@@@@@#@@@@@").fg(CYAN).a(",/&/,").fg(WHITE).a("@@@@@@%&@@@@@@@@@@@@").fg(CYAN).a("**&&&,.&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @").fg(CYAN).a(".&&&.,&&&%").fg(WHITE).a(" @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@").fg(CYAN).a("*.&&&&&&").fg(WHITE).a("      4.Random        @").fg(CYAN).a(".&&&.,&&&%").fg(WHITE).a(" @@@@..@@@@@@@@.*@@@@@@@@@@@@@@@../@@@@@@@@..@@@@@@*").fg(CYAN).a(".&&&&&&    ").fg(WHITE).a("|                           ").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @").fg(CYAN).a(".%&..,&&&&").fg(WHITE).a(".@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@").fg(CYAN).a("..&&&&&&").fg(WHITE).a("      5.Indice        @").fg(CYAN).a(".%&..,&&&&").fg(WHITE).a(".@@@@   @@@@@   &@@@@@@@@@@@@@@@   %@@@@@    @@@@@@").fg(CYAN).a("..&&&&&&    ").fg(WHITE).a("|                               ").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @").fg(CYAN).a("(*,,.&&&&%").fg(WHITE).a(".%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@").fg(CYAN).a(".%&&&&&&").fg(WHITE).a("      6.Salir         @").fg(CYAN).a("(*,,.&&&&%").fg(WHITE).a(".%&&&#         @@@@@@@@@@@@@@@@@@           @@@@@@@").fg(CYAN).a(".%&&&&&&    ").fg(WHITE).a("|                   ").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@").fg(CYAN).a(",.%.&%%%#").fg(RED).a("**%%%%%%%&&&&").fg(WHITE).a("@@&,@@@@@@@@@@@@@..@@@@").fg(RED).a("&, .%&&&&&&&@@").fg(CYAN).a(",.&&&&S&&&").fg(WHITE).a("                     @@").fg(CYAN).a(",.%.&%%%#").fg(RED).a("**%%%%%%%&&&&").fg(WHITE).a("@@&,@@@@@@@@@@@@@..@@@@").fg(RED).a("&, .%&&&&&&&@@").fg(CYAN).a(",.&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@&").fg(CYAN).a("//.&%%%%").fg(RED).a(" ,%%%%%%%%%&&&").fg(WHITE).a("@@  @@@.. .@@@@  (@@").fg(RED).a("&&&&%%%%%%%%&&&@").fg(CYAN).a(".%&&&&&&&").fg(WHITE).a("                      @@&").fg(CYAN).a("//.&%%%%").fg(RED).a(" ,%%%%%%%%%&&&").fg(WHITE).a("@@  @@@.. .@@@@  (@@").fg(RED).a("&&&&%%%%%%%%&&&@").fg(CYAN).a(".%&&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@").fg(CYAN).a(",.%%%%#").fg(RED).a(" %%%%%%%%%%&&").fg(WHITE).a("@@@@..  .@@..  . @@@").fg(RED).a("&&&&%%%%%%%%%%%&").fg(CYAN).a(".,%%&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a(",.%%%%#").fg(RED).a(" %%%%%%%%%%&&").fg(WHITE).a("@@@@..  .@@..  . @@@").fg(RED).a("&&&&%%%%%%%%%%%&").fg(CYAN).a(".,%%&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@").fg(CYAN).a("..&%%%%").fg(RED).a(" %&&&&&&&&&").fg(WHITE).a("@@@@@@@@@@@@@@@@@@@@@@@").fg(RED).a("&&&&&&%%%%%&&&").fg(CYAN).a("..%%%&&&&&&").fg(WHITE).a("                      @@@@").fg(CYAN).a("..&%%%%").fg(RED).a(" %&&&&&&&&&").fg(WHITE).a("@@@@@@@@@@@@@@@@@@@@@@@").fg(RED).a("&&&&&&%%%%%&&&").fg(CYAN).a("..%%%&&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@%").fg(CYAN).a(",.&&&&(").fg(WHITE).a(" *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&").fg(CYAN).a(",.&%%&&&&&..").fg(WHITE).a("                      @@@%").fg(CYAN).a(",.&&&&(").fg(WHITE).a(" *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&").fg(CYAN).a(",.&%%&&&&&").fg(WHITE).a("..    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@").fg(CYAN).a("(..,&&&.*").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&&&&(").fg(WHITE).a("..&                      @@@").fg(CYAN).a("(..,&&&.*").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",,&&&&&&&").fg(WHITE).a("(..&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@%").fg(CYAN).a(".&.%&&../ ").fg(WHITE).a(".&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",%&&&&&&&.").fg(WHITE).a(",&&&                      @@@%").fg(CYAN).a(".&.%&&../").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",%&&&&&&&.").fg(WHITE).a(",&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@&").fg(CYAN).a(",%&.#& ////*").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(").fg(CYAN).a("  %&&&&&/ ").fg(WHITE).a("(&&&&&                      @@@&").fg(CYAN).a(",%&.#& ////*").fg(WHITE).a(" .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a("(  %&&&&&/ ").fg(WHITE).a("(&&&&&    ").fg(WHITE).a("|").reset());
        System.out.println(ansi().fg(WHITE).a("              |    @@@@").fg(CYAN).a(",&&&&,.,////////,  ").fg(WHITE).a(".*@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",.. .//,,&&&&&. /").fg(WHITE).a("//&&&&&&                      @@@@").fg(CYAN).a(",&&&&,.,////////,").fg(WHITE).a("  .*@@@@@@@@@@@@@@@@@@@@").fg(CYAN).a(",.. .//,,&&&&&. /").fg(WHITE).a("//&&&&&&    ").fg(WHITE).a("|").reset());
    }
    //------------------------------------------------------------------------------Interfaz men?? minijuego------------------------------------------------------------------//
    public static void start_menu_final()
    {
        System.out.println(ansi().fg(RED).a("   ___________________________"));
        System.out.println("   ??        Minijuego        ??");
        System.out.println("   ??                         ??");
        System.out.println("   ??       1. Luchar         ??");
        System.out.println("   ??                         ??");
        System.out.println("   ??                         ??");
        System.out.println(ansi().a("   ___________________________").reset());
    }
    public static void start_menu()
    {
        System.out.println(ansi().fg(RED).a("   ___________________________"));
        System.out.println("   ??        Minijuego        ??");
        System.out.println("   ??                         ??");
        System.out.println("   ??       1. Luchar         ??");
        System.out.println("   ??       2. Huir           ??");
        System.out.println("   ??                         ??");
        System.out.println(ansi().a("   ___________________________").reset());
    }
    public static void reglas()
    {
        System.out.println(ansi().fg(RED).a("   _________________________________"));
        System.out.println("   ??             Reglas            ??");
        System.out.println("   ??  Deberas de tomar decisiones, ??");
        System.out.println("   ??   perdiendo vida o energia,   ??");
        System.out.println("   ??   para abrirte paso por los   ??");
        System.out.println("   ??   enemigos hasta llegar al    ??");
        System.out.println("   ?? jefe final, ??podr??s lograrlo? ??");
        System.out.println("   ??          1. Iniciar           ??");
        System.out.println("   ??          2. Salir             ??");
        System.out.println(ansi().a("   _________________________________").reset());
    }
    public static void menu1()
    {
        System.out.println(ansi().fg(RED).a("   ___________________________"));
        System.out.println("   ??        Minijuego        ??");
        System.out.println("   ??                         ??");
        System.out.println("   ??        1. Iniciar       ??");
        System.out.println("   ??        2. Relgas        ??");
        System.out.println("   ??        3. Salir         ??");
        System.out.println(ansi().a("   ___________________________").reset());
    }
    //---------------------------------------------------------------------------------Minijuego--------------------------------------------------------------------//
    public static void start()
    {
        int vida = 1000;
        int energia = 500;
        int boton = 0;

        

            System.out.println("Te has encontrado con un "+ ansi().fg(GREEN).a("slime").reset()+" apestoso de las monta??as de necrabol, ??qu?? deseas hacer?");
            start_menu();
            boton = ConsoleInput.getInt();
            if(boton == 1)
            {
                int valor_energia;
                valor_energia = energia - 100;
                System.out.println("Has ganado la batalla pero te queda " + valor_energia + " de energia");
                System.out.println("Has obtenido escencia de "+ ansi().fg(GREEN).a("slime").reset());
                System.out.println("____________________________________________________________________________________________");
                System.out.println(ansi().fg(WHITE).a("APARECIO EL ").fg(YELLOW).a("DIOS DEMONIO").fg(WHITE).a(" DEL REINO DE URDAK, DECIDE RAPIDO").reset());

                start_menu_final();
                int boton1 = ConsoleInput.getInt();

                if(boton1 == 1)
                {
                    System.out.println(ansi().fg(WHITE).a("Usando la escencia de").fg(GREEN).a(" slime").fg(WHITE).a(" derrotaste al ").fg(YELLOW).a("DIOS DEMONIO").fg(WHITE).a(", enhorabuna").reset());
                    boton = 3;
                    System.out.println("");
                    System.out.println(ansi().fg(YELLOW).a("Oprima 3 para volver al menu").reset());




                }

            }
            if(boton == 2)
            {
                int valor_vida;
                valor_vida = vida - 400;
                System.out.println("Has huido del "+ ansi().fg(GREEN).a("slime").reset()+" a cambio de tu vida, te queda " + valor_vida + " de vida");
                System.out.println("____________________________________________________________________________________________");
                System.out.println(ansi().fg(WHITE).a("APARECIO EL ").fg(YELLOW).a("DIOS DEMONIO").fg(WHITE).a(" DEL REINO DE URDAK, DECIDE RAPIDO").reset());

                start_menu_final();
                int boton2 = ConsoleInput.getInt();

                if(boton2 == 1)
                {

                    System.out.println("El "+ ansi().fg(YELLOW).a("DIOS DEMONIO").reset()+" te derrot??, mala suerte");
                    boton = 3;
                    System.out.println("");
                    System.out.println(ansi().fg(YELLOW).a("Oprima 3 para volver al menu").reset());
                }


            }



    }
    //----------------------------------------------------------------------------------------Tildes-------------------------------------------------------------------------//
    public static String convertirUnicode(String letra, String cadena)
    {

        StringBuilder str = new StringBuilder(cadena);
        int indice = -1;
        char caracter = 0;
        indice = str.lastIndexOf(letra);

        if (indice >= 0)
        {
            switch (letra) {
                case "??":
                    caracter = '\u00E1';
                    break;
                case "??":
                    caracter = '\u00E9';
                    break;
                case "??":
                    caracter = '\u00ED';
                    break;
                case "??":
                    caracter = '\u00F3';
                    break;
                case "??":
                    caracter = '\u00FA';
                    break;
                case "??":
                    caracter = '\u00F1';
                    break;
                case "??":
                    caracter = '\u00C1';
                    break;
                case "??":
                    caracter = '\u00C9';
                    break;
                case "??":
                    caracter = '\u00CD';
                    break;
                case "??":
                    caracter = '\u00D3';
                    break;
                case "??":
                    caracter = '\u00DA';
                    break;
                case "??":
                    caracter = '\u00D1';
                    break;
            }
            str.replace(indice,indice + 1,""+caracter);
        }

        return str.toString();
    }
    //---------------------------------------------------------------------------- imprimir teniendo en cuenta las tildes-----------------------------------------------------------------//
    public static void imprimir(String cadena)
    {
        String str;
        str = convertirUnicode("??", cadena);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);
        str = convertirUnicode("??", str);


        System.out.println(str);
    }



   //------------------------------------------------------------------------------Funcion para las letras de las canciones----------------------------------------------------------------//
    public static StringBuilder obtenerLetraCancion(int inicio, int fin, String[] data)
    {
        StringBuilder str = new StringBuilder();
        StringTokenizer temp;

        for (int i = inicio; i <= fin; i++)
        {
            temp = new StringTokenizer(data[i], ";");

            while (temp.hasMoreTokens())
            {
                System.out.print(temp.nextToken() + " ");
            }
            System.out.println();
        }
        return str;
    }



   //------------------------------------------------------------------------------- Inicio Programa pincipal---------------------------------------------------------------------------------//
    public static void main(String[] args)
    {
        Audio audio = new Audio();
        int opcion = 0, numero_cancion = 0, inicio_letra = 0, fin_letra = 0, seleccion = 0;
        String[] canciones;
        String[][] info_canciones;
        StringBuilder letra_cancion;

        canciones = ConsoleFile.readBigFile("recursos/letras.csv");
        info_canciones = ConsoleData.dataList(canciones);

        try
        {
            System.out.println();
            menu();


            do {
                opcion = ConsoleInput.getInt();
//--------------------------------------------------------------------------------------------Lista----------------------------------------------------------------------------//
                if(opcion == 1)
                {
                    File lista = new File("canciones");
                    String[] nombre = lista.list();

                    int a = 0;
                    for(int i=0; i<nombre.length; i++)
                    {
                        System.out.println(ansi().fg(CYAN).a(a).reset() + ". " + nombre[i]);
                        a++;
                    }

                    System.out.println("");
                    System.out.println("Desea volver al menu "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());
                    String respuesta = ConsoleInput.getString();

                    if (respuesta.equals("si"))
                    {
                        System.out.println();
                        menu();
                    }
                }

//--------------------------------------------------------------------------------------------Reproduccion---------------------------------------------------------------------------//
                if (opcion == 2)
                {




                    System.out.println("");
                    System.out.println("");
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMM").fg(YELLOW).a("myosooyh").fg(WHITE).a("NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMM").fg(YELLOW).a("o`omhmmds").fg(WHITE).a("+/smMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMM").fg(YELLOW).a("o`sNNy:smmmmy//y").fg(WHITE).a("NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN").fg(YELLOW).a("ho//++sss").fg(WHITE).a("NMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMM").fg(YELLOW).a("-.mNNdhh/odmmdh+").fg(WHITE).a(":omMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM").fg(YELLOW).a("do::+ydmdysy:-").fg(WHITE).a("NMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("d`+mmmoNMNo:ymdddds").fg(WHITE).a(":+mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN").fg(YELLOW).a("h+-/ohmmmd+-smmd`o").fg(WHITE).a("MM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("+`dmmmoMMMMm++dddmmds").fg(WHITE).a(":+mMMMMMMMMMMMMMMMMMMMMMMMMMMMN").fg(YELLOW).a("ho-/sdmmmmmy-+mMNmm/-").fg(WHITE).a("NM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("/`mNmdyMMMMMMd+ymmmmdds:o").fg(WHITE).a("NMMMMNNmmmmmmmmmNNMMMMMm").fg(YELLOW).a("y+/+sdmmmmmmh//dMMMMhmy`d").fg(WHITE).a("M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("+`mNmomMMMMMMMNssmmmmmmh:-+/////+++++++++++++oo:./ydmmmmmmmdo:yNMMMMMomh`yM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("+`dmm+MMMMMMMMMMhoddmmmmyoyhhddmmmmmmmmmmmmmddhhys+ommmmmms:oNMMMMMMM/mm.oM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("o`dNm/MMMMMMMMMdy:/odmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddmmh:+dMMMMMMMMM+dm").fg(WHITE).a("-+M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("o`hNm+MMMMMMms//shmmdyyhdmmmmmddmmdmmmmmmmmmmmmdddmmmmmmdosyNMMMMMMMMohm").fg(WHITE).a("-/M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("y`yNmoMMMMh/:ohmmmh/ohdhysydmmmmmdohmmmmmmmmyooyhysmmmmmmmho/smMMMMMMsym").fg(WHITE).a("-/M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMm").fg(YELLOW).a(".+mdsMNh/:sdmmmmmy/mNMMMNhoymmmmsd+mmmmmmd+omMMMm-mmmmmmmmmho:sNMMMMyym").fg(WHITE).a("-+M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMM").fg(YELLOW).a("-:mdyd//ydmmmmmmmmdhhhhhhhh/ymmm/Modmmmmh+hmdhysshmmmmmmmmmmmh//dMMMyym").fg(WHITE).a("-oM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMo").fg(YELLOW).a(".mm/:smmmmdhysosssyyhdmmmmddmmyoMyhmmmmoyhhhhhddddmmmmmmmmmmmms-yNMhsm").fg(WHITE).a(".sM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMm").fg(YELLOW).a(":ymhdmmds+oydmNMMNNddysshdmmmm/dMmsmmmmmdys+osyyysssshdmmmmmmmmh/+Nyyd").fg(WHITE).a("`hM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMy").fg(YELLOW).a("+mmmdo/smMMMMMMMMMMMMMNhssdmd-MMMsmmhsosydNMMMMMMMMmhyoyhmmmmmmms/+dh").fg(WHITE).a("`NM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMN").fg(YELLOW).a("o-dmmy/yNMMMMMMMMMMMMMMMMMMdoyy+MMMsyosdNMMMMMMMMMMMMMMMMdsoydmmmmms:mh").fg(WHITE).a("-MM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("+.hmmo/mMMMMMMMMMMMMMMMMMMMMMMhosMMMohNMMMMMMMMMMMMMMMMMMMMMNs/hmmmmdsm+s").fg(WHITE).a("MM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMs").fg(YELLOW).a("`ymmh-NMMMMMMMMMMNNNNMMMMMMMMMMNNMMNNMMMMMMMMMMMMMNmmNMMMMMMMMm/odmmmdo:").fg(WHITE).a("NMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMm").fg(YELLOW).a(".+mmm+yMMMMMMMMMMh:ohysNMMMMMMNdyo++oymMMMMMMMMMMNo/ydhomMMMMMMMN++mmmmy:").fg(WHITE).a("NMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(YELLOW).a("o.dmmm:NMMMMMMMMMh`yMMMs/MMMMMN-`.......+MMMMMMMMM/`dMMM//MMMMMMMMN:ymmmmo/").fg(WHITE).a("NM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(YELLOW).a("-+mmmm/mMMMMMMMMM/`/yho.`NMNMMMNo/---:/odMMMMMMMMy` -oo/`.NMMMMMMMMy/mmmmd.").fg(WHITE).a("sM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMN").fg(YELLOW).a(".smmmdh+MMMMMMMMM.``-...`NN:NMMMMMMMNMMMMMMMMNMMMo.:::....MMMMMMMMMd:mmmmm/:").fg(WHITE).a("M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(YELLOW).a("sodhdddysNMMMMMMM//hhhho/MMhsmMMMMNy+smMMMMmshMMMy:ddddho/MMMMMMMMMm/Nmmmm:-").fg(WHITE).a("M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMM").fg(YELLOW).a("sh-dddddydMMMMMMh-hddd-mMMMMhhhysodMNdhhyyhNMMMMd.ddddd:dMMMMMMMMMssmmmmd.+").fg(WHITE).a("M").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("y-ddddy+mMMMMMMMmsyyohMMMMMMMMMMMMMMMMMMMMMMMMMMs+hdh+hMMMMMMMMMd+mmmmm+`").fg(WHITE).a("mM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMM").fg(YELLOW).a("h.hddy/MMMMMMMMMMNMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmhhNNMMMMMMMMmyNmmmmy`").fg(WHITE).a("sMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMM").fg(YELLOW).a("s:yd/dMMMMMMMNNMNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMNNNNMMMMMMshNNNmds.").fg(WHITE).a("oMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMm").fg(YELLOW).a("+/:MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm-mmm+.").fg(WHITE).a("sdMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMM").fg(YELLOW).a("d++ymMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM-ds:").fg(WHITE).a("/mMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMM").fg(YELLOW).a("mdssymMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNh`").fg(WHITE).a("/smMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMN").fg(YELLOW).a("mhyyydmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmhs+oym").fg(WHITE).a("NMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMNN").fg(YELLOW).a("mdyyyymMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmdyoosh").fg(WHITE).a("mNMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMMMMMMM").fg(YELLOW).a("//ydMMMMMMMMMMMMMMMMMMMMMMMMMMMN/y").fg(WHITE).a("hdNNMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMMMMMM").fg(YELLOW).a("h.hmsdMMMMMMMMMMMMMMMMMMMMMMMMMdo-").fg(WHITE).a("hMMMMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMMMMMN").fg(YELLOW).a(":/mmmyydNMMMMMMMMMMMMMMMMMMMmdyyds.").fg(WHITE).a("hMMMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMMMMN").fg(YELLOW).a("o:dmmmhoomMMMMMMMMMMMMMMMMNdyddmmmmo.").fg(WHITE).a("MMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMN").fg(YELLOW).a("mmmmmmNNMMm/+dmmh+smMMMMMMMMMMMMMMMMMMMMh+dmmmmm+-").fg(WHITE).a("hMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMM").fg(YELLOW).a("mho/osyso+/osy-ommmy+dMMMMMMMMMMMMMMMMMMMMMMMd/hmmmmm/-").fg(WHITE).a("mMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMN").fg(YELLOW).a("y/:ohdhsoshdNMNdo+hms+NMMMMMMMmNMMMMMMNMMMMMMMMMm:hmmmmd::").fg(WHITE).a("NMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MN").fg(YELLOW).a("s-:ymdyshmMMMMMMMMMd/o:mMMMMMMMMhsMMMMNodMMMMMMMMMMd:dmmmmh.o").fg(WHITE).a("MMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("N").fg(YELLOW).a("+.ommm+omMMMMMMMMMMMMNo-mMMMMMMMMm.dMMMo-NMMMMMMMMMMM-smmmmm+-").fg(WHITE).a("NMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(YELLOW).a("y.ommmmdy+sNMMMMMMMMMMMM+:NMMMMMMMM//MMN.+MMMMMMMMMMMm.hmmmmmh").fg(WHITE).a("//sNMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(YELLOW).a("o.hdssyhddmMMMMMMMMMMMMMN-oMMMMMMMMy.mMs.dMMMMMMMMMMM+:hsohmmmds").fg(WHITE).a("`/MMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(YELLOW).a("y.hd//NMMMMMMMMMMMMMMMMMMd.hMMMMMMMN-sN-/MMMMMMMMMMMh.:oydmmmmmd").fg(WHITE).a(":`dMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("N").fg(YELLOW).a("-omm//mMMMMMMMMMMMMMMMMMMs-NMMMMMMMo-s.dMMMMMMMMMMN./dmmmmmmmmm+.d").fg(WHITE).a("MMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("M").fg(YELLOW).a("d-ymms:sNMMMMMMMMMMMMMMMMMo+NMMMMMMN-.:MMMMMMMMMMM+-dmmmmmmmmmd--").fg(WHITE).a("NMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMm").fg(YELLOW).a("+od-shdMMMMMMMMMMMMNNmdys:+NMMMMMMo`yMMMMMMMMMMy.hNNmmmmmmmd+-").fg(WHITE).a("hMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMM").fg(YELLOW).a("hoo+oNMMMMMMNmhso+oosydmNMMMhMMyN+.NMMNMMmMMMm.oNNmmmmmmds/").fg(WHITE).a("sNMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMN").fg(YELLOW).a("dyssyyysssshmMMMMMMMmhdmm:Nm+s--MMsmMmyMMM:-hyyysyyys").fg(WHITE).a("ymMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMN").fg(YELLOW).a("mdhhhhmNssh:yy:syso").fg(WHITE).a("+mMMMMMMMMMMMMMMMMMMMMMMMMMMMMM").reset());


                    String respuesta4;
                    do {
                        audio.detener();



                        System.out.println("");
                        imprimir("Ingrese el n??mero de la canci??n, entre 0 y " + (info_canciones.length - 1));
                        numero_cancion = ConsoleInput.getInt();

                        System.out.println(ansi().fg(CYAN).a("Nombre:").reset());
                        imprimir(info_canciones[numero_cancion][ConsoleData.NOMBRE_CANCION]);
                        audio.seleccionarCancion(info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
                        audio.reproducir();

                        System.out.println("");
                        System.out.println("Desea mirar la letra "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());

                        String respuesta = ConsoleInput.getString();

                        if (respuesta.equals("si"))
                        {
                            inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                            fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                            letra_cancion = obtenerLetraCancion(inicio_letra, fin_letra, canciones);
                        }

                        System.out.println("");
                        imprimir("Desea escuchar otra canci??n "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());


                       respuesta4 = ConsoleInput.getString();

                    } while (respuesta4.equals("si"));

                    System.out.println("");
                    System.out.println("Desea volver al menu "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());


                    String respuesta = ConsoleInput.getString();

                    if (respuesta.equals("si"))
                    {
                        System.out.println();
                        menu();
                        audio.detener();
                    }
                }

  //-----------------------------------------------------------------------------------------Letras--------------------------------------------------------------------------------//

                if (opcion == 3)
                {


                    System.out.println("");
                    System.out.println("");
                    System.out.println("MMMMNMMMNmho/-------/ohNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
                    System.out.println("MMMMMMNo--:///:/::::/:.:dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmmmmNMMMMMMMMMM");
                    System.out.println("MMMMMh:-////://:::::://..dMNmhyssssssooooosssyhdmNMMMMMMMMMMNho/------:oydNMMMMM");
                    System.out.println("MMMMy.:///:::::/:/:/:::-./osyhdNNNNNNMMNNNNNmmhhsoooshmNMMmo:://:/://:::--:smMMM");
                    System.out.println("NNNm--///////////////+sdNNNMMMMMMMMMMMMMMMMMMMMMMMNNdyo+oo.:////////:::://:--+mM");
                    System.out.println("MMMs.://////////oydNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmy+--:////////::://:-./N");
                    System.out.println("MMMs.://////:/yNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNms:-:///////:////:..y");
                    System.out.println("MMMm-.///::odNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNms/////////:///:.o");
                    System.out.println("MMMMy--::smNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNy:://///////:./");
                    System.out.println("MMMMNy-omMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd/.:///////:.o");
                    System.out.println("MMMNy:yNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNs.-//////-:m");
                    System.out.println("MMNs:hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNh..://::sNM");
                    System.out.println("MMd-sNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNd-.::omNMM");
                    System.out.println("MN/:NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd-/mNMMMM");
                    System.out.println("My-yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo-yNMMMM");
                    System.out.println("m:+NNNNmdhddmNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmmmdddmNNMMMMMMMMMMMMMMMMMm-:mMMMM");
                    System.out.println("+-mNh+::::::::odNMMMMMMMMMMMMMMMMMMMMMMMMNdo+/://::::::+ydNMMMMMMMMMMMMMMs-yMMMM");
                    System.out.println("-od/-:://///:::-omNMMMMMMMMMMMMMMMMMMMMNs/:::///::::::::--:sNMMMMMMMMMMMMm-+MMMM");
                    System.out.println("-s--://///////::-/NMMMNNmmmmNMMMMMMMMMm/-:/::/:/::::://:::-./mMMMMMMMMMMMN:/NMMM");
                    System.out.println("-.-://:-----:://:.sMMh/:---::+dMMMMMMd::///:::::::::::::::::./NMMMMMMMMMMN/:NMMM");
                    System.out.println("../::-......-..:/-:NMm/-.-..-:yMMMMMm:::::-..........-:::::/:-+NMMMMMMMMMN+:NMMM");
                    System.out.println("`://::::://///::/:-mMMNmmmddmNNMMMMd:-::-.``.--::::-.`.::::::::yMMMMMMMMMN//NMMM");
                    System.out.println(".:///////////////:.mMMMMmhydNMMMMMN/.:::-.--:::::::::--/:::::::+NMMMMMMMMd-oMMMM");
                    System.out.println(".:////////+//////--NMMNh:--.:mMMMMN-::::::::::::-:::::::::::::::mMMMMMMMMs-dMMMM");
                    System.out.println("-.//////++++/////.oMMMm:.--.`+NMMMm-:::::-:::::---:::::-::::::::sMMMMMMMN/:NMMMM");
                    System.out.println("y.-////++++//////:NMMMs`....`-NMMNm:/::::::::-:---:-----:-:-::::/MMMMMMMm-+NMMMM");
                    System.out.println("No.:////++///////mMNMM+`...-.-NMMMNo//:::::::-----------::---::::NMMMMMMy-yMMMMM");
                    System.out.println("NN/.:////////:/:yNMMNM/`-+sy::NMMNNm+::::::-:------------::-:::.oMMMMNMN+/mMMMMM");
                    System.out.println("MMm/.:///:/:/::sNMMNMMo.yhdh-+MMMMMNd+::::---------:----:::-::.:mMMMMMNs:dMMMMMM");
                    System.out.println("MMMNs--::::::/hNMMMMMMd-oddo-mNMMMMMNm+.-::------------::-::--/mNNMNNmo/dNMMMMMM");
                    System.out.println("MMMMNd+-/ssyhNNMMMMMMMNdooyodMMMMMMMNNNy/------------:-:::-:+hNMNMMNh/omMMMMMMMM");
                    System.out.println("MMMMNMNho+ymNMMMMMMNNNMNMNNNMMMMMNNNNNNNNmy+::-------:::/ohmNNMMNNh++dNMMMMMMMMM");
                    System.out.println("MMMMMMMMNmy+odNNMMMNMMMMMNMNMNMMMMMMMMNMMNNNNmddhhhhdmmNNMNMNNNmy+odNMMMMMMMMMMM");
                    System.out.println("MMMMMMMMMMMNhooshdmNNNMMNNMMMMMMMMMNNMNNNMNNNNMNNNNNNNNNNNmmhsoohmNMMMMMMMMMMMMM");
                    System.out.println("MMMMMMMMMMMMMMNmdhs:/+syhhddmmmmmmmmmmmmmmmmmNNNNNNmmdhyo/osydNNMMMMMMMMMMMMMMMM");
                    System.out.println("MMMMMMMMMMMNMMMMMN/./::----:::---:-::--:::::::////::----..sNNNMMMMMMMMMMMMMMMMMM");
                    System.out.println("MMMMMMMMMMMMMMMMNy`:::---:::::::::-::--:::::--..---------..sNNMMNMMMMMMMMMMMMMMM");
                    System.out.println("MMMMMMMMMNNNNNMMd--:-:-`.::-::-----------------...--------..yNMMMMMMMMMMMMMMMMMM");
                    System.out.println("MMMMMNNMMNNNNMNN:.::-:.`-:::-::----..-------..........-----.-dNNMMMMMMMMMMMMMMMM");
                    System.out.println("MMMMNNNNNNNNNNNo.::::-`.----:-----.`-------..........-.-----.-dNMMMMMMMMMMMMMMMM");
                    System.out.println("MMMNNNNNNNNNNNy.-:::-`:sssyyyyyss/`----.-.......```.......---`:mNMMMMMMMMMMMMMMM");
                    System.out.println("MMMNNNNNNNNNNd.-::::.`hNNNNNNNNNN-.--------.....``.........---`/NNMMNNMMMMMMMMMM");
                    System.out.println("MMMMNNNNNNNNN:.:::::`-NNNNNNNNNNo`::--..---....```.........---..sNmmmmNNNMMMMMMM");
                    System.out.println("MMMNMNy::/ss+.-::::-`/NNNNNNNddh-.----.```````````........-----``-----:+yNNMNMMM");
                    System.out.println("MMMMNo..-:-:-`-::::-`+NNNNmo----.`````..---::::--........-------``-::::-.:mMNMMM");
                    System.out.println("MMMMh.ohs.::-`.::::-`/NNNm:-s/.---``.------:::-----.....--------``.-:-::-.sMMMMM");
                    System.out.println("MMMN/-mNNy.:-.`.::::`-mNN/-dNNy`---`..----------------...-------.``-::::..yMMMMM");
                    System.out.println("MMMN/:NMMN+-::-......`:dy.oNNNN:.-------.-------------......----.``::::-.+NMMMMM");
                    System.out.println("MMNMo.dMNNh.::--------..-.hNNNN+.-----::::--::::-:-----.------:-.``--::+dNNMMMMM");
                    System.out.println("MMMNm:/NNNy.:::---------.`sNNNN/.--:::/++//////:::::---------::-`.shdNNNMNMMMMMM");
                    System.out.println("NNMMMm//dy.::::----------`:mNNh.-::-://+///////:::::---------..-omNNMMMMMMMMMMMM");
                    System.out.println("MMMMNNNdyso+ooooooooossyyys/+s.--::---::::::-------.....-/+sydNNNNNMNMNMMMMMMMMM");


                    String respuesta2;
                    do {
                        System.out.println("");
                        imprimir("Ingrese el n??mero de la canci??n, entre 0 y " + (info_canciones.length - 1));
                        numero_cancion = ConsoleInput.getInt();
                        System.out.println(ansi().fg(CYAN).a("Nombre:").reset());
                        imprimir(info_canciones[numero_cancion][ConsoleData.NOMBRE_CANCION]);
                        System.out.println("");
                        inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                        fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                        letra_cancion = obtenerLetraCancion(inicio_letra, fin_letra, canciones);

                        imprimir(letra_cancion.toString());


                        imprimir("Desea ver otras letras de otra canci??n "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());

                        respuesta2 = ConsoleInput.getString();

                    }while(respuesta2.equals("si"));

                    System.out.println("");
                    System.out.println("Desea volver al menu "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());

                    String respuesta = ConsoleInput.getString();

                    if (respuesta.equals("si"))
                    {
                        System.out.println();
                        menu();
                    }
                }

  //----------------------------------------------------------------------------------------------------------------------Random-----------------------------------------------------------//

                if (opcion == 4)
                {

                    System.out.println("");
                    System.out.println("");
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMNNNNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmm").fg(GREEN).a("ho:-:/++/:/y").fg(WHITE).a("NMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMN").fg(GREEN).a("y+::::----/").fg(WHITE).a("sdmmmmmmmmmmmmmmmmmmmmmmmmmmmd").fg(GREEN).a("/:ymMMMMMMMmo-s").fg(WHITE).a("NMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMm").fg(GREEN).a("+.-sdNMMMMNmy+-:").fg(WHITE).a("ymmmmmmmmmmmmmmmmmmmmmmmmy").fg(GREEN).a("-yMMMMMMmsdMMMm/:d").fg(WHITE).a("MMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMM").fg(GREEN).a("d.:dMMMMMMMMMMMMNy.").fg(WHITE).a("-ymmmmmmmmmmmmddddmmmmmm").fg(GREEN).a("-sMMMMMMs.sNMMMMNo-m").fg(WHITE).a("MMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMN").fg(GREEN).a("y`sMMMMMMMMMMMMMMMMN/`/hho+//::::------::///.ohdNMMo.hMMMMMMMN+:m").fg(WHITE).a("NNMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMNNN").fg(GREEN).a("h`yMMMMMMMMmsyNMMMMMMN+`-oydNNMMMNmmmmmmNMMNNmdhsosd.yMMMMMMMMMm.hm").fg(WHITE).a("NNNNMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MNNmmm").fg(GREEN).a("+:MMMMMMMMMMNh/sNMMMMMNmMMMMMMMMMMNmmmmmmMMMMMMMMMMdss+++yMMMMMN:s").fg(WHITE).a("NmmmNNMM").reset());
                    System.out.println(ansi().fg(WHITE).a("Nmmmmm").fg(GREEN).a(":+MMMMMMMMMMMMNs:NMMMMMMMMMMMMMMMMMNmmmmmNMMMMMMMMMMMMMm--mMMMMN-y").fg(WHITE).a("mmmmmmNN").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmmm").fg(GREEN).a(":/MMMMMMMMMdoosy//MMMMMMMMMMMMMMMMMMmmmmmmMMMMMMMMMMMMMMNhoNMMN/.").fg(WHITE).a("mmmmmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmmms").fg(GREEN).a("`mMMMMMMMdo-.sNmNMMMMMMMMMMMMMMMMMMMmmmmmNMMMMMMMMMMMMMMMMm+s--").fg(WHITE).a("hmmmmmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmmmm").fg(GREEN).a("::NMMMMMNhmNMMMMMMMMMMMMMMMMMMMMMMMMNmmmmmMMMMMMMMMMMMMMMMMm/`").fg(WHITE).a("smmmmmmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmNmmm").fg(GREEN).a("/-smMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmmmmmMMMMMMMMMMMMMMMMMMMy-").fg(WHITE).a("smmmmmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmNmmm").fg(GREEN).a("/.sNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmmmNMMMMMMMMMMMMMMMMMMMMN/").fg(WHITE).a("+mmmmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmmmd").fg(GREEN).a(":+NMMMMMMMMMMMMMMMMMMMMMmyshNMMMMMMMMMMNMMMMMMMMMy+omMMMMMMMMMMMo/").fg(WHITE).a("mmmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmm").fg(GREEN).a("d:sMMMMMMMMMMMMMMMMMMMMMMd.`` /NMMMMMMMMMMMMMMMMMMM`` .dMMMMMMMMMMM:o").fg(WHITE).a("mmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmm").fg(GREEN).a("d-sMMysosyhmNMMMMMMMMMMMMMm-` `+NMMMMMMMMMmmMMMMMMMMh/:+NmyshNMMMMMMh.oo++++").reset());
                    System.out.println(ansi().fg(WHITE).a("mmN").fg(GREEN).a("d-yMMMMMMNmhyooomMMMMMMMMMMMMmdmMMMMMMMd+//++///hMMMNs+oo+.syo-yMMMdsy+-").fg(WHITE).a("dmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mm").fg(GREEN).a("d:sMMMMMMMMMMMNmmNMMMMMMMMMMMMMMMMMMMMMMMs:hhho.hMMMN:/ddho:hdd/.ymMMMMm.").fg(WHITE).a("hmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mm").fg(GREEN).a(":oMMMMMMMNho+oshmNMMMMMMMMMMMMMMMMMMMMMMMNyo++smMMMMMo-shhdhddd++/.yMNhy.y").fg(WHITE).a("mmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("m").fg(GREEN).a("+/NMMMMMh//ymMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM/`.:+hdddhdd-:MNms.+++sd").reset());
                    System.out.println(ansi().fg(WHITE).a("h").fg(GREEN).a(".mMMMMMMMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMdo +dddhohd:.:omMMM/+mNmy+").reset());
                    System.out.println(ansi().fg(GREEN).a("-sMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmo:+h:.+ys:`:yo.dMMMMh-d").fg(WHITE).a("mmmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("-NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd+/hNMMMmysymh+/+dMMMMm-y").fg(WHITE).a("Nmmmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMdsssyhmMMMMMm/:hMMMMMMMMMMMMMMMMMMMMo:").fg(WHITE).a("Nmmmmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNmdyo/+dMy`-+ossdMMMMMMMMMMMMMMMMMm.d").fg(WHITE).a("Nmmmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNd-..yNNMMMMMMMMMMMMMMMMMMMMMM++").fg(WHITE).a("mmmmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNmdo.:.ymNMMMMMMMMMMMMMMMMMMMMMMN-").fg(WHITE).a("ymmmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMhyyso+/:.-dMmo//oydmNMMMMMMMMMMMMMMMMMMh-").fg(WHITE).a("dNmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMdddmNNMm/mMMMMMMNdysyMMMMMMMMMMMMMMMMMMM+").fg(WHITE).a("/mmmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN-hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm-").fg(WHITE).a("ymmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMy-NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM+/").fg(WHITE).a("mmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM+/MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd-").fg(WHITE).a("hmm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMysMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN:").fg(WHITE).a("omm").reset());
                    System.out.println(ansi().fg(GREEN).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMs:").fg(WHITE).a("mm").reset());
                    System.out.println(ansi().fg(GREEN).a("mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMy").fg(WHITE).a("-mm").reset());
                    System.out.println(ansi().fg(GREEN).a(":NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMs").fg(WHITE).a("-mm").reset());
                    System.out.println(ansi().fg(GREEN).a("::mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm-").fg(WHITE).a("omm").reset());
                    System.out.println(ansi().fg(WHITE).a("m").fg(GREEN).a(":-dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm:").fg(WHITE).a("+mmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mm").fg(GREEN).a("+.hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd-").fg(WHITE).a("ommmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmy").fg(GREEN).a(":+mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm/").fg(WHITE).a(":hmmmmm").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmm").fg(GREEN).a("o-omMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNh/-").fg(WHITE).a("ymmmmmmN").reset());
                    System.out.println(ansi().fg(WHITE).a("mmmmmmm").fg(GREEN).a("o-:sdNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNds/:os-/").fg(WHITE).a("dmmNNNM").reset());
                    System.out.println(ansi().fg(WHITE).a("NmNmmmmo").fg(GREEN).a(":yho/:+shmNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNMNNmddhys++++/:ymNNNy-").fg(WHITE).a("dNMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMNNNNs").fg(GREEN).a("-mNNNmy/-ooo++++++++++++++++++/////////::::::/++ossyhdmmmmmdo/+syy:y").fg(WHITE).a("MMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMd//////odNmmmmmmmNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmNNNNNNNdhhmMMMMMM").reset());





                    String respuesta3;
                    do {
                        audio.detener();

                        int numero_cancion1 = (int) Math.floor(Math.random() * info_canciones.length);


                        audio.seleccionarCancion(info_canciones[numero_cancion1][ConsoleData.RUTA_CANCION]);
                        audio.reproducir();

                        System.out.println("");
                        System.out.println(ansi().fg(CYAN).a("Nombre:").reset());
                        imprimir(info_canciones[numero_cancion1][ConsoleData.NOMBRE_CANCION]);

                        System.out.println("");
                        System.out.println("Desea mirar la letra "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());
                        System.out.println("");

                        String respuesta = ConsoleInput.getString();

                        if (respuesta.equals("si")) {
                            inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                            fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                            letra_cancion = obtenerLetraCancion(inicio_letra, fin_letra, canciones);
                        }
                        System.out.println("");
                        imprimir("Desea escuchar otra "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());

                           respuesta3 = ConsoleInput.getString();

                    }while(respuesta3.equals("si"));

                    System.out.println("");
                    System.out.println("Desea volver al menu "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());


                    String respuesta = ConsoleInput.getString();

                    if (respuesta.equals("si")) {
                        audio.detener();
                        System.out.println();
                        menu();
                    }
                }

 //------------------------------------------------------------------------------------------------------Indice--------------------------------------------------------------------------//

                if (opcion == 5)
                {


                    System.out.println("");
                    System.out.println("");
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMMMMM").fg(RED).a("mhsoooooooooooooooosh").fg(WHITE).a("mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMM").fg(RED).a("myoooydNMMMMMMMMMMMMMMMMNdyoooymddhhyyyyyhhd").fg(WHITE).a("NMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMM").fg(RED).a("mo+sdMMMMMMMMMMMMMMMMMMMMMMMMMMMMdyhddmmmmmmmds").fg(WHITE).a(":MMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(RED).a("MmhsoooooooooosmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNmmdddmNh").fg(WHITE).a(":MMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(RED).a("h-dNNNNNNmNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmmddM").fg(WHITE).a("s+MMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("M").fg(RED).a("+oMmdddmNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmdmM").fg(WHITE).a("/hMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MM").fg(RED).a("/sMmdmmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNm").fg(WHITE).a("-MMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(RED).a("+oMmmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM/").fg(WHITE).a("yMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMM").fg(RED).a("o/NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd").fg(WHITE).a("-NMMMMMMMMMMMMMMmyyN").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMN").fg(RED).a("-mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmyymMMMMMMMMMMMMMMMy/").fg(WHITE).a("MMMMMMMMMMMMM").fg(RED).a("o+md.").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMM").fg(RED).a("s+MMMMMMMMMMMMMMMs:-/mMMMMMMMMMMMMMMd....dMMMMMMMMMMMMMMM:").fg(WHITE).a("dMMMMMMMMMM").fg(RED).a("m/sMMd-").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMM").fg(RED).a("++MMMMMMMNddhhhhy....oMMMyNMhodMMoMMN+--+NMMMMMMMMMMMMMMMs/h").fg(WHITE).a("NMMMMM").fg(RED).a("ds+omMNs:m").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(RED).a("d-NMMMMMMMMMMMMMMMMh/yMMMMdyydMdyydMMMMMMMMMMMMMMMMMMMMMMMh-hs+sNm/smMNho+h").fg(WHITE).a("MM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(RED).a("/yMMMMMMMMMMMMMMMMMMMhyMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMh:MMMmo-hMNo+h").fg(WHITE).a("MMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(RED).a(":dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMooMMMMMN+o:h").fg(WHITE).a("MMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMM").fg(RED).a("+sMMMMmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd-NMMMMMMMh:").fg(WHITE).a("NMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMm").fg(RED).a("-mMMMMsydNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm:dMMMMMMMMMd:").fg(WHITE).a("NMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMM").fg(RED).a("m:yMMM-mMddddhhdMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNs/mMMMMMMMMMMMy:sood").fg(WHITE).a("MM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMM").fg(RED).a("s/yN/sMMMMMMMd/hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMms/hMMMMMMMMMMMMMMmMMm-").fg(WHITE).a("MM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMM").fg(RED).a("do+--sMMMMMMN.MMMMMMMMMMMMMMMMMMMMMMMMMMMMNmyo+smMMMMMMMMMMMMMMMMMMm+s").fg(WHITE).a("MM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMN").fg(RED).a("o/NMMMMMM.NMMMMMMMMMMMMMMMMMMmyssooooooydMMMMMMMMMMMMMMMMMMMds+om").fg(WHITE).a("NNN").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMNN").fg(RED).a("d-NMMMMMMo+MMMMMMMMMMMMMMMMMMMMmNNNsMMMMMMmMMMMMMMMMMMMMNhsooym").fg(WHITE).a("NNNNNM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMNNNNNNN").fg(RED).a("+sMMMMMMMmMMNMMMMMMMMMMMMMMdsossssosMMMMMM+sMMMMMNmhyoooshm").fg(WHITE).a("NNNMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMNNNNNN").fg(RED).a("y/dMMMMMmyo+oooooosssyyyys++NMMMMMMMMMMMMMs:ssooooshm").fg(WHITE).a("NMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMNNNN").fg(RED).a("myooooosdNNNNNNNNNNmmmmmN+oNMMMMMMMMMMMMh:hm").fg(WHITE).a("NNNNMMMMMMMMMMMMMMMMMMMM").reset());
                    System.out.println(ansi().fg(WHITE).a("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNN").fg(RED).a("hoooooooooooooy").fg(WHITE).a("NNNNMMMMMMMMMMMMMMMMMMMMMMM").reset());

                    imprimir("Ingrese indice de la canci??n, entre 0 y " + (info_canciones.length-1 ));
                    numero_cancion = ConsoleInput.getInt();
                    inicio_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.INICIO_CANCION]);
                    fin_letra = ConsoleInput.stringToInt(info_canciones[numero_cancion][ConsoleData.FIN_CANCION]);
                    System.out.println();

                    System.out.println(ansi().fg(CYAN).a("Nombre :").reset());
                    imprimir(info_canciones[numero_cancion][ConsoleData.NOMBRE_CANCION]);
                    System.out.println(ansi().fg(CYAN).a("Autor  :").reset());
                    imprimir(info_canciones[numero_cancion][ConsoleData.AUTOR_CANCION]);
                    System.out.println(ansi().fg(CYAN).a("Archivo:").reset());
                    imprimir(info_canciones[numero_cancion][ConsoleData.RUTA_CANCION]);
                    System.out.println(ansi().fg(CYAN).a("Album  :").reset());
                    imprimir(info_canciones[numero_cancion][ConsoleData.ALBUM_CANCION]);
                    System.out.println(ansi().fg(CYAN).a("A??o    :").reset());
                    imprimir(info_canciones[numero_cancion][ConsoleData.ANO_CANCION]);
                    System.out.println(ansi().fg(CYAN).a("Link:  :").reset());
                    imprimir(info_canciones[numero_cancion][ConsoleData.RUTA_LINK]);

                    System.out.println("");
                    System.out.println("Desea volver al menu "+ansi().fg(YELLOW).a("si").fg(WHITE).a("/").fg(CYAN).a("no").reset());

                    String respuesta = ConsoleInput.getString();

                    if(respuesta.equals("si"))
                    {
                        System.out.println();
                        menu();
                    }
                }


                if(opcion == 666)
                {
                    audio.seleccionarCancion(info_canciones[0][ConsoleData.RUTA_CANCION]);
                    audio.reproducir();
                    menu1();
                    do{
                        seleccion = ConsoleInput.getInt();
                        if(seleccion == 1)
                        {

                            start();

                        }
                        if(seleccion == 2)
                        {
                            reglas();
                            int seleccion2 = 0;
                            seleccion2 = ConsoleInput.getInt();
                            if(seleccion2 == 1)
                            {
                                start();
                            }
                            if(seleccion2 == 2)
                            {
                               seleccion = 3;
                            } 
                        }
                    }while(seleccion != 3);
                    audio.detener();
                    menu();
                }
                
 //-----------------------------------------------------------------------------------------------------------------------Salir-------------------------------------------------------------------//

            } while (opcion != 6);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            audio.detener();
        }
    }

}


