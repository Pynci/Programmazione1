import java.util.Scanner;
import java.util.function.IntPredicate;

public class PrimoEsercizio {

    public static String aggiornaStringa(int numero, String stringaAttuale){
        String nuovaStringa;
        nuovaStringa = stringaAttuale + String.valueOf(numero);
        
        return nuovaStringa;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int inputUtente;
        String stringaNumeri = "";
        boolean continua = true;
        int contatore = 0;


        do{
            System.out.print("Inserisci un numero positivo: ");
            inputUtente = tastiera.nextInt();

            if(inputUtente > 0){
                stringaNumeri = aggiornaStringa(inputUtente, stringaNumeri);
            }
            else{
                if(inputUtente == 0){
                    continua = false;
                }
            }

        }
        while(continua);

        for(int i = 1; i <= stringaNumeri.length(); i++){
            if(i % 2 == 0){
                System.out.print(stringaNumeri.charAt(i-1));
            }
        }
    }
}
