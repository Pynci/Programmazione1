import java.util.Scanner;

public class QuartoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String primoGiocatore = "";
        String secondoGiocatore = "";
        String giocataPrimoGiocatore = "";
        String giocataSecondoGiocatore = "";
        boolean giocoFermo = false;
        String risposta;

        System.out.print("Nome del primo giocatore: ");
        primoGiocatore = tastiera.next();

        System.out.print("Nome del secondo giocatore: ");
        secondoGiocatore = tastiera.next();

        do{
            System.out.println(primoGiocatore + " forbice, carta o pietra?");
            giocataPrimoGiocatore = tastiera.next();

            System.out.println(secondoGiocatore + " forbice, carta o pietra?");
            giocataSecondoGiocatore = tastiera.next();

            //switch annidati per i vari esiti delle giocate
            switch(giocataPrimoGiocatore){
                case "forbice":
                    switch(giocataSecondoGiocatore){
                        case "forbice":
                            System.out.println("La giocata e' pari!");
                            break;
                        case "carta":
                            System.out.println(primoGiocatore + " vince!");
                            break;
                        case "pietra":
                            System.out.println(secondoGiocatore + " vince!");
                            break;
                        default:
                            System.out.println("Input non valido.");
                            giocoFermo = true;
                    }
                    break;
                case "carta":
                    switch(giocataSecondoGiocatore){
                        case "forbice":
                            System.out.println(secondoGiocatore + " vince!");
                            break;
                        case "carta":
                            System.out.println("La giocata e' pari!");
                            break;
                        case "pietra":
                            System.out.println(primoGiocatore + " vince!");
                            break;
                        default:
                            System.out.println("Input non valido.");
                            giocoFermo = true;
                    }
                    break;
                case "pietra":
                    switch(giocataSecondoGiocatore){
                        case "forbice":
                            System.out.println(primoGiocatore + " vince!");
                            break;
                        case "carta":
                            System.out.println(secondoGiocatore + " vince!");
                            break;
                        case "pietra":
                            System.out.println("La giocata e' pari!");
                            break;
                        default:
                            System.out.println("Input non valido.");
                            giocoFermo = true;
                    }
                    break;
                default:
                    System.out.println("Input non valido");
                    giocoFermo = true;
            }

            System.out.println("Vuoi giocare ancora? (s/n)");
            risposta = tastiera.next();

            if(risposta.equalsIgnoreCase("n")){
                giocoFermo = true;
            }
            
        }
        while(!giocoFermo);

        System.exit(0);
        
        
    }
}
