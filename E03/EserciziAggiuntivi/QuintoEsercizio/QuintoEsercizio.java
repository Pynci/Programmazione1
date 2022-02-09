import java.util.Scanner;

public class QuintoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int risultato = 0;
        int resto = 0;

        //inserimento n
        do{
            System.out.println("Inserire il dividendo:");
            n = tastiera.nextInt();
        }
        while(n < 0);

        //inserimento m
        do{
            System.out.println("Inserire il divisore:");
            m = tastiera.nextInt();
        }
        while(m <= 0);

        for(int i = n; i - m >= 0; i -= m){
            risultato++;
            resto = i - m;
        }
        if(n == 0){
            resto = m;
        }

        System.out.println("Risultato = " + risultato + "; Resto = " + resto + ";");


    }
}
