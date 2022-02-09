import java.util.Scanner;

public class SettimoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int n = 0;
        int primoPrecedente = 0;
        int secondoPrecedente = 0;
        int fibonacci = 0;
        int contatore = 0;

        do{
            System.out.println("Inserire un numero intero positivo:");
            n = tastiera.nextInt();
        }
        while(n < 0);

        System.out.print("Sequenza di Fibonacci: ");

        while(contatore <= n){
            if(contatore == 0){
                fibonacci = 0;
                secondoPrecedente = 0;
            }
            if(contatore == 1){
                fibonacci = 1;
                primoPrecedente = 1;
            }
            if(contatore > 1){
                fibonacci = primoPrecedente + secondoPrecedente;
                secondoPrecedente = primoPrecedente;
                primoPrecedente = fibonacci;
            }

            contatore++;

            System.out.print(fibonacci + " ");
        }

    }
}
