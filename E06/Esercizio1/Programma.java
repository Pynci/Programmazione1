import java.util.Scanner;


public class Programma {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int estrazione = 0;
        int inserimento = -1;
        int confronto = -1;
        int minimoMaggiorante = 100;
        int massimoMinorante = 0;
        int contaTentativi = 0;
        int[] numeriDaIndovinare = new int[5];
        boolean[] indovinati = new boolean[5];
        int[] numeriTentativi = new int[5];
        String nuovaPartita = "";
        boolean giocaAncora = true;

        //inizializzo gli array
        for(int i = 0; i < 5; i++){
            numeriDaIndovinare[i] = 0;
            indovinati[i] = false;
            numeriTentativi[i] = 0;

        }

        //ciclo che gestisce il gioco
        do{
            System.out.println("Sto pensando ad un numero tra 1 e 100... Ma quale?");
            estrazione = Metodi.estraiNumeroCasuale();

            //ciclo che gestisce la singola partita
            do{
                contaTentativi++;
    
                if(contaTentativi >= 10){
                    System.out.println("Tentativi terminati, partita conclusa (coglione).");
                    Metodi.aggiornaInformazioniPartite(estrazione, false, contaTentativi, numeriDaIndovinare, indovinati, numeriTentativi);
                    break;
                }
                else{

                    System.out.print("Numero: ");
                    inserimento = tastiera.nextInt();

                    if(inserimento < 1 || inserimento > 99){
                        System.out.println("Input non valido, riprova.");
                    }
                    else{
                        confronto = Metodi.confrontaNumeri(inserimento, estrazione);

                        if(confronto == 0){
                            System.out.println("Hai indovinato! Grande!");
                            Metodi.aggiornaInformazioniPartite(estrazione, true, contaTentativi, numeriDaIndovinare, indovinati, numeriTentativi);
                        }
                        else{
                            if(confronto == -1){
                                if(massimoMinorante < inserimento){
                                    massimoMinorante = inserimento;
                                    System.out.println("Il numero inserito è più piccolo di quello da indovinare!");
                                }
                                else{
                                    System.out.println("Ti ho già detto che il massimo minorante è " + massimoMinorante + ", cosa mi metti " + inserimento + "?");
                                }
                            }
                            else{
                                if(minimoMaggiorante > inserimento){
                                    minimoMaggiorante = inserimento;
                                    System.out.println("Il numero inserito è più grande di quello da indovinare!");
                                }
                                else{
                                    System.out.println("Ti ho già detto che il minimo maggiorante è " + minimoMaggiorante + ", cosa mi metti " + inserimento + "?");
                                }
                            }
                        }
                    }
                    
                }
            }
            while(confronto != 0);
            contaTentativi = 0;

            System.out.println("-------PARTITA CONCLUSA--------");
            System.out.println("");
            System.out.println("|Info partita|");
            System.out.println("Numero da indovinare: " + numeriDaIndovinare[4]);
            if(indovinati[4]){
                System.out.println("Sei riuscito ad indovinare il numero in " + numeriTentativi[4] + " tentativi.");
            }
            else{
                System.out.println("Purtroppo non hai indovinato il numero.");
            }

            System.out.println("");
            System.out.println("Vuoi giocare ancora? (si/no)");
            nuovaPartita = tastiera.next();

            if(nuovaPartita.equalsIgnoreCase("no")){
                giocaAncora = false;
            }

        }
        while(giocaAncora);
        
    }
}
