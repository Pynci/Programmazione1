public class Programma {

    //da debuggare perché non va una madonna
    
    public static void main(String[] args) {
        int[][] mondo = Metodi.creaMondo();
        int numeroOstacoli = 10;
        int rigaObiettivo;
        int colonnaObiettivo;
        int esito = 0;

        if(args[0].length() > 1){
            rigaObiettivo = ((args[0].charAt(0) - '0')*10) + (args[0].charAt(1) - '0');
        }
        else{
            rigaObiettivo = (args[0].charAt(0) - '0');
        }

        if(args[1].length() > 1){
            colonnaObiettivo = ((args[1].charAt(0) - '0')*10) + (args[1].charAt(1) - '0');
        }
        else{
            colonnaObiettivo = (args[1].charAt(0) - '0');
        }

        if(Metodi.aggiungiObiettivo(mondo, rigaObiettivo-1, colonnaObiettivo-1)){

            System.out.println("entra");
            
            for(int i = 0; i < numeroOstacoli; i++){
                Metodi.aggiungiOstacolo(mondo);
            }
            esito = Metodi.aggiungiPosizioniRobot(mondo, args[2]);
            Metodi.stampaMondo(mondo);
            System.out.println();
            switch(esito){
                case 0:
                    System.out.println("L'obiettivo non è stato raggiunto.");
                    break;
                case 1:
                    System.out.println("L'obiettivo è stato raggiunto con successo.");
                    break;
                case 2:
                    System.out.println("Il robot è finito contro un ostacolo.");
                    break;
                case 3:
                    System.out.println("Il robot ha tentato di uscire dal mondo di gioco.");
                    break;
                default:
                    System.out.println("Si è verificato un errore nel main.");
                    System.exit(0);
            }
            
        }


        // for(int i = 0; i < mondo.length; i++){
        //     for(int j = 0; j < mondo[i].length; j++){
        //         System.out.print(mondo[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
