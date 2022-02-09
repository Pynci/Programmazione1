import java.util.Scanner;

public class QuartoEsercizio {

    public static int menu(){
        Scanner tastiera = new Scanner(System.in);
        int scelta;

        System.out.println("");
        System.out.println("----CONVERSIONE TEMPERATURE----");
        System.out.println("Scrivi il numero corrispondente alla tua scelta:");
        System.out.println("1 - Fahrenheit → Celsius");
        System.out.println("2 - Celsius → Fahrenheit");
        System.out.println("3 - Esci dal programma");
        System.out.println("");
        System.out.print("Numero della scelta: ");
        scelta = tastiera.nextInt();

        return scelta;
    }

    public static double convertiFinC(double fahrenheit){
        double celsius = 0;
        celsius = (fahrenheit - 32)/1.8;

        return celsius;
    }

    public static double convertiCinF(double celsius){
        double fahrenheit = 0;
        fahrenheit = 1.8 * celsius + 32;

        return fahrenheit;
    }

    public static void main(String[] args) {
        //conversione temperature
        int scelta = 0;
        double fahrenheit = 0;
        double celsius = 0;
        double conversione = 0;
        Scanner tastiera = new Scanner(System.in);

        while(true){

            scelta = menu();

            switch(scelta){
                case 1:
                    System.out.println("");
                    System.out.print("Inserisci i gradi fahrenheit: ");
                    fahrenheit = tastiera.nextDouble();
                    conversione = convertiFinC(fahrenheit);

                    System.out.println("Gradi celsius: " + conversione);
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Inserisci i gradi celsius: ");
                    celsius = tastiera.nextDouble();
                    conversione = convertiCinF(celsius);

                    System.out.println("Gradi fahrenheit: " + conversione);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERRORE: scelta non valida, riprova.");
            }
        }

    }
}
