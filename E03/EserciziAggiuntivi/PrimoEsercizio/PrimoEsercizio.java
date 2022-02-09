import java.util.Scanner;

public class PrimoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int numUtente = 0;
        int n = 0;


        do{
            System.out.println("Inserisci un numero intero: ");
            numUtente = tastiera.nextInt();
        }
        while(numUtente < 0);

        n = numUtente;

        do{
            System.out.println("Inserisci nuovamente un numero intero: ");
            numUtente = tastiera.nextInt();
        }
        while(n != numUtente);
    }
}
