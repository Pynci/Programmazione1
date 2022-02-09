import java.util.Scanner;

public class QuintoEsercizioVariante {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int numeroMassimo = 0;
        int n = 0;
        boolean eseguiAncora = true;

        System.out.println("Inserire un numero intero maggiore di 0: ");
        numeroMassimo = tastiera.nextInt();

        if(numeroMassimo < 1){
            System.out.println("Input non valido.");
            System.exit(0);
        }
        else{
            for(int i = 1; i <= numeroMassimo; i++){
                
                n = i;
                while(eseguiAncora){

                    if(n == 1){
                        eseguiAncora = false;
                        System.out.println("Provo la congettura per n = " + i + " ... Ok, vale.");
                    }
        
                    if(n % 2 == 0){
                        n = n / 2;
                    }
                    else{
                        n = 3*n + 1;
                    }
                }
                eseguiAncora = true;

            }
        }
    }
}
