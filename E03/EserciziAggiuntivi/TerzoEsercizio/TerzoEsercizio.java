import java.util.Scanner;

public class TerzoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int base = 0;
        int esponente = 1;
        int potenza = 1;

        System.out.println("Inserire la base:");
        base = tastiera.nextInt();

        do{
            System.out.println("Inserire l'esponente:");
            esponente = tastiera.nextInt();
        }
        while(esponente < 0);

        System.out.print("\nPotenza = ");
        if(esponente == 0){
            System.out.println(potenza);
        }
        else{
            if(esponente == 1){
                System.out.println(base);
            }
            else{
                for(int i = 1; i <= esponente; i++){
                    potenza *= base;
                }
                System.out.println(potenza);
            }
        }
    }
}
