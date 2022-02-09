public class Metodi {
    public static int[][] creaMondo(){
        int[][] mondo = new int[20][20];

        //inizializzazione matrice
        for(int i = 0; i < mondo.length; i++){
            for(int j = 0; j < mondo[i].length; j++){
                mondo[i][j] = 0;
            }
        }

        return mondo;
    }

    public static boolean aggiungiObiettivo(int[][] mondo, int riga, int colonna){
        boolean esito = false;

        if(riga < 0 || riga > mondo.length || colonna < 0 || colonna > mondo[0].length){
            esito = false;
        }
        else{
            if(mondo[riga][colonna] != 0){
                esito = false;
            }
            else{
                mondo[riga][colonna] = 1;
                esito = true;
            }
        }

        return esito;
    }

    public static void aggiungiOstacolo(int[][] mondo){
        int riga;
        int colonna;
        boolean occupata = true;

        do{
            riga = (int)(Math.random() * mondo.length);
            colonna = (int)(Math.random() * mondo[0].length);

            if(mondo[riga][colonna] == 0){
                mondo[riga][colonna] = 2;
                occupata = false;
            }
        }
        while(occupata);
    }

    public static int aggiungiPosizioniRobot(int[][] mondo, String percorso){
        int riga = 0;
        int colonna = 0;
        boolean finito = false;
        int esito = 0;
        int indiceStringa = 0;

        do{
            if(riga < 0 || riga > mondo.length || colonna < 0 || colonna > mondo[0].length){
                finito = true;
                esito = 3;  //si sta provando ad uscire dalla matrice
            }
            else{
                
                if(mondo[riga][colonna] == 1){
                    finito = true;
                    esito = 1;  //si ha centrato l'obiettivo
                }
                else{
                    if(mondo[riga][colonna] == 2){
                        finito = true;
                        esito = 2;  //ci si è scontrati con un ostacolo
                    }
                    else{
                        mondo[riga][colonna] = 3;
                    }
                }

                if(indiceStringa < percorso.length()){
                    switch(percorso.charAt(indiceStringa)){
                        case 'n':
                            riga--;
                            break;
                        case 's':
                            riga++;
                            break;
                        case 'o':
                            colonna--;
                            break;
                        case 'e':
                            colonna++;
                            break;
                        default:
                            System.out.println("Si è verificato un errore nella specifica del percorso.");
                            System.exit(0);
                    }
                    indiceStringa++;
                }
                else{
                    finito = true;
                    esito = 0;  //non si è raggiunto l'obiettivo
                }
            }
        }
        while(!finito);

        return esito;
    }

    public static void stampaMondo(int[][] mondo){
        
        for(int i = 0; i < mondo[0].length; i++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i = 0; i < mondo.length; i++){
            System.out.print("* ");
            for(int j = 0; j < mondo[0].length; j++){
                
                switch(mondo[i][j]){
                    case 0:
                        System.out.print("  ");
                        break;
                    case 1:
                        System.out.print("X ");
                        break;
                    case 2:
                        System.out.print("# ");
                        break;
                    case 3:
                        System.out.print("O ");
                        break;
                    default:
                        System.out.println("Si è verificato un errore nella stampa del mondo.");
                }

            }
            System.out.println("*");
        }

        for(int i = 0; i < mondo[0].length; i++){
            System.out.print("* ");
        }

    }
}
