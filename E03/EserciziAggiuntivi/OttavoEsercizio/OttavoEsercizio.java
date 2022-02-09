import java.util.Scanner;

public class OttavoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int risultato = 0;

        do{
            System.out.println("Inserire un numero intero positivo:");
            n = tastiera.nextInt();
        }
        while(n <= 0);

        do{
            System.out.println("Inserire un numero intero positivo:");
            m = tastiera.nextInt();
        }
        while(m <= 0);

        //Regola:
        //MCD(x,x) = x
        //MCD(x,y) = MCD(y,x)
        //MCD(x,y) = MCD(x-y,y)  se x > y
        while(risultato == 0){
            if(n == m){
                risultato = n;
            }
            else{
                if(n > m){
                    n -= m;
                }
                if(m > n){
                    m -= n;
                }
            }
        }

        System.out.println("Il massimo comun divisore dei due numeri risulta " + n);
    }
}
