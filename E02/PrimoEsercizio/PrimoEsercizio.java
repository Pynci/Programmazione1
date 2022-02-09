import java.util.Scanner;
import java.util.function.IntPredicate;

public class PrimoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String inputGrezzo = "";
        String inputUtente = "";
        int espressione = 0;
        char[] charset = {'1','2','3','4','5','6','7','8','9','+','-'};
        boolean inputOK = false;
        char carattereIndicato;
        String sottostringa;
        int valore;
        
        //input dati da parte dell'utente
        System.out.println("Inserire un'espressione matematica composta da addizioni e sottrazioni (senza spazi):");
        inputGrezzo = tastiera.next();
        inputUtente = inputGrezzo.trim();

        //controllo che impedisce di avere stringhe che iniziato o finiscono con un operatore
        if(inputUtente.startsWith("+") || inputUtente.startsWith("-") || inputUtente.endsWith("+") || inputUtente.endsWith("-")){
            System.out.println("Input non valido");
            System.exit(0);
        }
        
        //controllo che verifica che le stringhe contengano unicamente i caratteri consentiti
        for(int indice = 0; indice < inputUtente.length(); indice++){
            for(int i = 0; i < charset.length; i++){
                if(inputUtente.charAt(indice) == charset[i]){
                    inputOK = true;
                }
            }
            if(!inputOK){
                System.out.println("Input non valido");
                System.exit(0);
            }
            inputOK = false;
        }

        System.out.println("Espressione inserita: " + inputUtente);

        //scorro l'input dopo averlo verificato
        for(int indice = 0; indice < inputUtente.length(); indice++){
            carattereIndicato = inputUtente.charAt(indice); 

            //se sono arrivato ad un + allora estrai la sottostringa antecedente al + e riparti da 0 (l'input viene troncato)
            if(carattereIndicato == '+'){
                sottostringa = inputUtente.substring(0, indice);
                valore = Integer.parseInt(sottostringa);
                espressione = espressione + valore;

                inputUtente = inputUtente.substring(indice, inputUtente.length());
                indice = 0;
            }
            else{
                //se sono arrivato ad un - allora estrai la sottostringa antecedente al - e riparti da 0 (l'input viene troncato)
                if(carattereIndicato == '-'){
                    sottostringa = inputUtente.substring(0, indice);
                    valore = Integer.parseInt(sottostringa);
                    espressione = espressione + valore;

                    inputUtente = inputUtente.substring(indice, inputUtente.length());
                    indice = 0;
                }
                else{
                    //se sono giusto all'ultima cifra della stringa sommala e termina
                    if(indice + 1 == inputUtente.length()){
                        espressione = espressione + Integer.parseInt(String.valueOf(carattereIndicato));
                    }
                }
            }
        }

        System.out.println("Il valore dell'espressione risulta: " + espressione);

    }
}
