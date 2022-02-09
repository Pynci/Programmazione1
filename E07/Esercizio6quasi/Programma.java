import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        int[][] campoDiGioco = Metodi.creaNuovaConfigurazione();
        String risposta = "";
        int esitoPartita = -2;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Benvenuto! Vuoi effettuare la prima mossa? (si/no)");
        risposta = tastiera.next();

        if(risposta.equalsIgnoreCase("si")){
            do{
                Metodi.mossaUtente(campoDiGioco);
                Metodi.stampaConfigurazioneDiGioco(campoDiGioco);
                esitoPartita = Metodi.verificaVittoria(campoDiGioco);
                if(esitoPartita == -2){
                    Metodi.mossaComputer(campoDiGioco);
                    Metodi.stampaConfigurazioneDiGioco(campoDiGioco);
                    esitoPartita = Metodi.verificaVittoria(campoDiGioco);
                }
            }
            while(esitoPartita == -2);
        }
        else{
            do{
                Metodi.mossaComputer(campoDiGioco);
                Metodi.stampaConfigurazioneDiGioco(campoDiGioco);
                esitoPartita = Metodi.verificaVittoria(campoDiGioco);
                if(esitoPartita == -2){
                    Metodi.mossaUtente(campoDiGioco);
                    Metodi.stampaConfigurazioneDiGioco(campoDiGioco);
                    esitoPartita = Metodi.verificaVittoria(campoDiGioco);
                }
            }
            while(esitoPartita == -2);
        }

        /*
        for(int i = 1; i < campoDiGioco.length-1; i++){  //i riga
            for(int j = 1; j < campoDiGioco[i].length-1; j++){   //j colonna
                System.out.print(campoDiGioco[i][j]  + " ");
            }
            System.out.println();
        }
        */

        switch(esitoPartita){
            case 0:
                System.out.println("La partita si conclude con un pareggio!");
                break;
            case 1:
                System.out.println("La partita si conclude con la vittoria dell'utente! Complimenti!");
                break;
            case -1:
                System.out.println("La partita si conclude con la vittoria del computer, mi dispiace.");
                break;
            default:
                System.out.println("Si e' verificato un errore inaspettato nel main.");
                System.exit(0);
        }
    }
}
