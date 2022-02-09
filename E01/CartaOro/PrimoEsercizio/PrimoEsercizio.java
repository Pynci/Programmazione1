import java.util.Scanner;

public class PrimoEsercizio {
    public static void main(String[] args) {
        int n;
        int an = 2;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire un numero intero maggiore di 0:");
        n = tastiera.nextInt();

        while(n <= 0){
            System.out.println("Il numero inserito non risulta corretto, riprova:");
            n = tastiera.nextInt();
        }

        calcola(n, an);
    }

    public static void calcola(int valoreN, int valoreAn){
        if(valoreN >= 1){
            valoreAn = 3 * valoreAn - 2;
            System.out.println("Valore di An: " + valoreAn);
            calcola(valoreN-1, valoreAn);
        }
    }
}
