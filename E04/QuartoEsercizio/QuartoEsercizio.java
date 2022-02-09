import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class QuartoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("Inserire il primo numero intero: ");
        a = tastiera.nextInt();

        System.out.println("Inserire il secondo numero intero: ");
        b = tastiera.nextInt();

        if(a < 0 || b < 0){
            System.out.println("Input non valido.");
            System.exit(0);
        }
        else{
            for(int i = 0; i < a; i++){
                b++;
            }
            System.out.println("La somma dei due numeri risulta: " + b);
        }
    }
}
