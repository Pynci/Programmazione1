import java.util.Scanner;

public class SecondoEsercizio {
    public static void main(String[] args) {
        double epsilon;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire un valore di epsilon compreso tra 0 e 1: ");
        epsilon = tastiera.nextDouble();

        while(epsilon <= 0 || epsilon > 1){
            System.out.println("Il valore inserito non risulta corretto, riprova: ");
            epsilon = tastiera.nextDouble();
        }

        calcola(epsilon, 0.0);
    }

    public static void calcola(double valoreEpsilon, double n){
        double successione = n/(n+1);
        if(successione > 1 - valoreEpsilon && successione <= 1){
            System.out.println("Il valore della successione cercato risulta: " + successione + "; Valore di n: " + n);
        }
        else{
            System.out.println("Tentativo fallito con valore: " + successione + " - continuo a cercare. Valore di n: " + n);
            calcola(valoreEpsilon, n+1);
        }
    }
}
