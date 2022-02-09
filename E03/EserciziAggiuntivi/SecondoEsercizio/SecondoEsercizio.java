import java.util.Scanner;

public class SecondoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int n = 0;
        int fattoriale = 0;

        do{
            System.out.println("Inserisci un numero interno non negativo:");
            n = tastiera.nextInt();
            System.out.print("Il fattoriale di " + n + " risulta: ");
        }
        while(n < 0);

        if(n == 0){
            fattoriale = 1;
        }
        else{
            fattoriale = n;
            while(n > 1){
                fattoriale *= n-1;
                n--;
            }
            System.out.print(fattoriale + ";");
        }
    }
}
