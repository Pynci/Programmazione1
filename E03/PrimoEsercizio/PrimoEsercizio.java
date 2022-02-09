import java.util.Scanner;
import java.util.function.IntPredicate;

public class PrimoEsercizio {
    public static void main(String[] args) {
        //leggo da tastiera due interi (mese e anno) [range mese 1-12 range anno 1900-2099]
        //devo stampare a video da quanti giorni è formato il mese dell'anno inserito 

        //REGOLA: anno bisestile se divisibile per 4 ma non per 100 oppure divisibile per 400
        //30 giorni ha novembre, con april, giugno e settembre. Di 28 ce n'è uno, tutti gli altri ne han 31.
        int inputMese = 0;
        int inputAnno = 0;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire il numero del mese e il numero dell'anno separati da uno spazio: ");
        inputMese = tastiera.nextInt();
        inputAnno = tastiera.nextInt();

        //flag di controllo
        boolean meseOk = inputMese > 0  && inputMese < 13;
        boolean annoOk = inputAnno > 1899 && inputAnno < 2100;
        boolean risultaBisestile = (inputAnno % 4 == 0 && inputAnno % 100 != 0) || inputAnno % 400 == 0;

        if(!meseOk || !annoOk){
            System.out.println("Input non valido");
            System.exit(0);
        }
        else{
            if(risultaBisestile){
                switch(inputMese){
                    case 2:
                        System.out.println("Il mese selezionato ha 29 giorni!");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Il mese selezionato ha 30 giorni!");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Il mese selezionato ha 31 giorni!");
                        break;
                    default: System.out.println("Si e' verificato un errore (switch bisestile)");
                }
            }
            else{
                switch(inputMese){
                    case 2:
                        System.out.println("Il mese selezionato ha 28 giorni!");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Il mese selezionato ha 30 giorni!");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Il mese selezionato ha 31 giorni!");
                        break;
                    default: System.out.println("Si e' verificato un errore (switch bisestile)");
                }
            }
        }

    }
}
