import java.util.Scanner;

public class QuintoEsercizio {

    public static int menu(){
        Scanner tastiera = new Scanner(System.in);
        int scelta;

        System.out.println("");
        System.out.println("----CONVERSIONE TRA BASI----");
        System.out.println("Scrivi il numero corrispondente alla tua scelta:");
        System.out.println("1 - Decimale → Binario");
        System.out.println("2 - Binario → Decimale");
        System.out.println("3 - Esci dal programma");
        System.out.println("");
        System.out.print("Numero della scelta: ");
        scelta = tastiera.nextInt();

        return scelta;
    }

    public static int convertiDecInBin(int decimale){
        //scrivere il metodo
    }

    public static int convertiBinInDec(int binario){
        //scrivere il metodo
    }

    public static void main(String[] args) {
        //convertitore decimale - binario e viceversa
        Scanner tastiera = new Scanner(System.in);
        int scelta = 0;
        int decimale = 0;
        int binario = 0;
        int conversione = 0;

        while(true){

            scelta = menu();

            switch(scelta){
                case 1:
                    System.out.println("");
                    System.out.print("Inserisci il valore decimale: ");
                    decimale = tastiera.nextInt();

                    if(decimale >= 0){
                        conversione = convertiDecInBin(decimale);
                        System.out.println("Valore binario: " + conversione);
                    }
                    else{
                        System.out.println("Il valore inserito deve essere positivo.");
                    }
                    
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Inserisci i gradi celsius: ");
                    binario = tastiera.nextInt();

                    if(binario >= 0){
                        conversione = convertiBinInDec(binario);
                        System.out.println("Valore decimale: " + conversione);
                    }
                    else{
                        System.out.println("Il valore inserito deve essere positivo.");
                    }

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
