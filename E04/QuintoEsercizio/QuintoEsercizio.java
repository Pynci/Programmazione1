import java.util.Scanner;

public class QuintoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int n = 0;
        boolean eseguiAncora = true;

        System.out.println("Inserire un numero intero:");
        n = tastiera.nextInt();

        if(n < 1){
            System.out.println("Input non valido.");
            System.exit(0);
        }
        else{
            while(eseguiAncora){
            
                System.out.print(n + " ");
    
                if(n == 1){
                    eseguiAncora = false;
                }
    
                if(n % 2 == 0){
                    n = n / 2;
                }
                else{
                    n = 3*n + 1;
                }
            }
        }


    }
}
