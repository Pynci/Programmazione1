import java.util.Scanner;

import javax.management.NotificationEmitter;

public class QuintoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String nomeGiocatore = "";
        String giocataGiocatore = "";
        int giocataCPU = -1;
        boolean giocoFermo = false;
        String risposta = "";

        System.out.print("Nome del giocatore: ");
        nomeGiocatore = tastiera.next();

        do{
            System.out.println(nomeGiocatore + " forbice, carta o pietra?");
            giocataGiocatore = tastiera.next();
            giocataGiocatore = giocataGiocatore.trim();
            giocataGiocatore = giocataGiocatore.toLowerCase();

            giocataCPU = (int) Math.random()*3;

            switch(giocataGiocatore){
                case "forbice":
                    switch(giocataCPU){
                        case 0:
                            System.out.println("Il computer ha giocato forbice!");
                            System.out.println("La giocata e' pari!");
                            break;
                        case 1:
                            System.out.println("Il computer ha giocato carta!");
                            System.out.println(nomeGiocatore + " vince!");
                            break;
                        case 2:
                            System.out.println("Il computer ha giocato pietra!");
                            System.out.println("Il computer vince!");
                            break;
                        default:
                            System.out.println("ERRORE");
                            giocoFermo = true;
                    }
                    break;
                case "carta":
                    switch(giocataCPU){
                        case 0:
                            System.out.println("Il computer ha giocato forbice!");
                            System.out.println("Il computer vince!");
                            break;
                        case 1:
                            System.out.println("Il computer ha giocato carta!");
                            System.out.println("La giocata e' pari!");
                            break;
                        case 2:
                            System.out.println("Il computer ha giocato pietra!");
                            System.out.println(nomeGiocatore + " vince!");
                            break;
                        default:
                            System.out.println("ERRORE");
                            giocoFermo = true;
                    }
                    break;
                case "pietra":
                    switch(giocataCPU){
                        case 0:
                            System.out.println("Il computer ha giocato forbice!");
                            System.out.println(nomeGiocatore + " vince!");
                            break;
                        case 1:
                            System.out.println("Il computer ha giocato carta!");
                            System.out.println("Il computer vince!");
                            break;
                        case 2:
                            System.out.println("Il computer ha giocato pietra!");
                            System.out.println("La giocata e' pari!");
                            break;
                        default:
                            System.out.println("ERRORE");
                            giocoFermo = true;
                    }
                    break;
                default:
                    System.out.println("Input non valido.");
                    giocoFermo = true;
            }

            System.out.println("Vuoi giocare ancora? (s/n)");
            risposta = tastiera.next();

            if(risposta.equalsIgnoreCase("n") || risposta.equalsIgnoreCase("no")){
                giocoFermo = true;
            }
        }
        while(!giocoFermo);

        System.exit(0);
    }
}
