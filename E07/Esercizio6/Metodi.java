import java.util.Scanner;

public class Metodi {
    public static int[][] creaNuovaConfigurazione(){
        int[][] tabella = new int[5][5];

        for(int i = 0; i < tabella.length; i++){
            for(int j = 0; j < tabella[i].length; j++){
                if(i > 0 && i < 4 && j > 0 && j < 4){
                    tabella[i][j] = 0;
                }
                else{
                    tabella[i][j] = 9;
                }
            }
        }

        return tabella;
    }

    public static void stampaConfigurazioneDiGioco(int[][] tabella){

        System.out.println();
        
        for(int i = 1; i < tabella.length-1; i++){
            for(int j = 1; j < tabella[i].length-1; j++){
                switch(tabella[i][j]){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("X"); //mossa computer
                        break;
                    case 2:
                        System.out.print("O"); //mossa utente
                        break;
                    default:
                        System.out.println("Si è verificato un errore nella stampa della configurazione di gioco.");
                        System.exit(0);
                }
                if(j != tabella[i].length-2){
                    System.out.print("|");
                }
            }
            System.out.println();

            if(i != tabella.length-2){
                for(int k = 0; k < (tabella[i].length-2)*2 - 1; k++){
                    if(k%2 == 0){
                        System.out.print("-");
                    }
                    else{
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
            
        }

    }

    //ritorna true se è stata effettuata una mossa, false se qualcosa è andato storto e nessuna condizione è stata verificata
    public static boolean mossaComputer(int[][] tabella){
        
        //1. se l'avversario ha occupato due caselle di fila, occupare la casella rimanente
        for(int i = 1; i < tabella.length-1; i++){  //i riga
            for(int j = 1; j < tabella[i].length-1; j++){   //j colonna

                if(tabella[i][j] == 2){
                    for(int k = i-1; k <= i+1 ; k++){   //k corrispondente di riga
                        for(int t = j-1; t <= j+1; t++){    //t corrispondente di colonna

                            int riga = -1;
                            int colonna = -1;

                            if(tabella[k][t] == 2){
                                
                                if(k != i || t != j){
                                    
                                    if(k > i){
                                        riga = i - 1;
                                    }
                                    else{
                                        if(k < i){
                                            riga = i + 1;
                                        }
                                        else{
                                            riga = i;
                                        }
                                    }

                                    if(t > j){
                                        colonna = j - 1;
                                    }
                                    else{
                                        if(t < j){
                                            colonna = j + 1;
                                        }
                                        else{
                                            colonna = j;
                                        }
                                    }

                                    if(tabella[riga][colonna] == 0){
                                        tabella[riga][colonna] = 1;
                                        return true;
                                    }

                                }
                            }

                        }
                        
                    }

                }
                else{
                    if(tabella[i-1][j] == 2 && tabella[i+1][j] == 2){
                        if(tabella[i][j] == 0){
                            tabella[i][j] = 1;
                            return true;
                        }
                    }
                    else{
                        if(tabella[i][j-1] == 2 && tabella[i][j+1] == 2){
                            if(tabella[i][j] == 0){
                                tabella[i][j] = 1;
                                return true;
                            }
                        }
                    }
                }

            }
        }

        //2. se c'è una mossa che crea due coppie di caselle adiacenti in un colpo solo, scegliere quella
        for(int i = 1; i < tabella.length-1; i++){  //i riga
            for(int j = 1; j < tabella[i].length-1; j++){   //j colonna

                if(tabella[i][j] == 1){
                    for(int k = i-1; k <= i+1 ; k++){   //k corrispondente di riga
                        for(int t = j-1; t <= j+1; t++){    //t corrispondente di colonna

                            if(tabella[k][t] == 1){
                                if(k != i || t != j){

                                    int riga = -1;
                                    int colonna = -1;

                                    if(k == i){                     //se le due caselle sono affiancate
                                        if(tabella[i][j-1] == 0){
                                            tabella[i][j-1] = 1;
                                            return true;
                                        }
                                        else{
                                            if(tabella[i][j+1] == 0){
                                                tabella[i][j+1] = 1;
                                                return true;
                                            }
                                            else{
                                                if(tabella[i][t-1] == 0){
                                                    tabella[i][t-1] = 1;
                                                    return true;
                                                }
                                                else{
                                                    if(tabella[i][t+1] == 0){
                                                        tabella[i][t+1] = 1;
                                                        return true;
                                                    }
                                                }
                                            }
                                        }

                                        if(tabella[i-1][t] == 0){
                                            tabella[i-1][t] = 1;
                                            return true;
                                        }
                                        else{
                                            if(tabella[i-1][j] == 0){
                                                tabella[i-1][j] = 1;
                                                return true;
                                            }
                                            else{
                                                if(tabella[i+1][t] == 0){
                                                    tabella[i+1][t] = 1;
                                                    return true;
                                                }
                                                else{
                                                    if(tabella[i+1][j] == 0){
                                                        tabella[i+1][j] = 1;
                                                        return true;
                                                    }
                                                }
                                            }
                                            
                                        }
                                    }
                                    else{
                                        if(t == j){                 //se le due caselle sono incolonnate

                                            if(tabella[i-1][j] == 0){
                                                tabella[i-1][j] = 1;
                                                return true;
                                            }
                                            else{
                                                if(tabella[i+1][j] == 0){
                                                    tabella[i+1][j] = 1;
                                                    return true;
                                                }
                                                else{
                                                    if(tabella[k-1][j] == 0){
                                                        tabella[k-1][j] = 1;
                                                        return true;
                                                    }
                                                    else{
                                                        if(tabella[k+1][j] == 0){
                                                            tabella[k+1][j] = 1;
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }

                                            if(tabella[k][j-1] == 0){
                                                tabella[k][j-1] = 1;
                                                return true;
                                            }
                                            else{
                                                if(tabella[i][j-1] == 0){
                                                    tabella[i][j-1] = 1;
                                                    return true;
                                                }
                                                else{
                                                    if(tabella[k][j+1] == 0){
                                                        tabella[k][j+1] = 1;
                                                        return true;
                                                    }
                                                    else{
                                                        if(tabella[i][j+1] == 0){
                                                            tabella[i][j+1] = 1;
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else{   //se le due caselle sono in diagonale

                                            if(tabella[i+1][j+1] == 0){
                                                tabella[i+1][j+1] = 1;
                                                return true;
                                            }
                                            else{
                                                if(tabella[i-1][j-1] == 0){
                                                    tabella[i-1][j-1] = 1;
                                                    return true;
                                                }
                                                else{
                                                    if(tabella[k-1][t-1] == 0){
                                                        tabella[k-1][t-1] = 1;
                                                        return true;
                                                    }
                                                    else{
                                                        if(tabella[k+1][t+1] == 0){
                                                            tabella[k+1][t+1] = 1;
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }

                                            if(tabella[k][j] == 0){
                                                tabella[k][j] = 1;
                                                return true;
                                            }
                                            else{
                                                if(tabella[i][t] == 0){
                                                    tabella[i][t] = 1;
                                                    return true;
                                                }
                                            }
                                        }
                                    }

                                }
                            }

                        }
                    }
                }

            }
        }

        //3. se la casella centrale è libera, occuparla;
        if(tabella[2][2] == 0){
            tabella[2][2] = 1;
            return true;
        }

        //4. se l'avversario ha occupato una casella d'angolo, occupare la casella opposta;
        for(int i = 1; i < tabella.length-1; i++){  //i riga
            for(int j = 1; j < tabella[i].length-1; j++){   //j colonna
                if(i != 2 || j != 2){
                    
                    if(i == j){
                        if(tabella[i][j] == 2){
                            if(tabella[i-1][j-1] == 0){
                                tabella[i-1][j-1] = 1;
                                return true;
                            }
                            else{
                                if(tabella[i+1][j+1] == 0){
                                    tabella[i+1][j+1] = 1;
                                    return true;
                                }
                            }
                        }
                    }
                    else{
                        if(i - j == 2 || i - j == -2){
                            if(tabella[i][j] == 2){
                                if(tabella[j][i] == 0){
                                    tabella[j][i] = 1;
                                    return true;
                                }
                            }
                        }
                    }

                }
            }
        }

        //5. se c'è un angolo vuoto, occuparlo
        for(int i = 1; i < tabella.length-1; i++){  //i riga
            for(int j = 1; j < tabella[i].length-1; j++){   //j colonna
                if(i == j || i - j == 2 || i - j == -2){
                    if(tabella[i][j] == 0){
                        tabella[i][j] = 1;
                        return true;
                    }
                }
            }
        }

        //6. occupare una casella vuota qualsiasi.
        for(int i = 1; i < tabella.length-1; i++){  //i riga
            for(int j = 1; j < tabella[i].length-1; j++){   //j colonna
                if(tabella[i][j] == 0){
                    tabella[i][j] = 1;
                    return true;
                }
            }
        }

        return false;

    }

    public static void mossaUtente(int[][] tabella){
        Scanner tastiera = new Scanner(System.in);
        int riga = -1;
        int colonna = -1;
        boolean inputOK = true;

        do{
            System.out.println();
            System.out.println("Tocca a te! In che casella vuoi piazzare il tuo O?");
            System.out.print("Riga (da 1 a 3): ");
            riga = tastiera.nextInt();

            System.out.print("Colonna (da 1 a 3): ");
            colonna = tastiera.nextInt();

            if(riga < 1 || riga > 3 || colonna < 1 || colonna > 3){
                System.out.println("Riga e/o colonna non valida/e.");
                inputOK = false;
            }

            if(inputOK){
                if(tabella[riga][colonna] != 0){
                    System.out.println("La posizione specificata è già occupata, riprova.");
                    inputOK = false;
                }
                else{
                    tabella[riga][colonna] = 2;
                    inputOK = true;
                }
            }

            if(!inputOK){
                stampaConfigurazioneDiGioco(tabella);
            }
        }
        while(!inputOK);
    }

    //deve restituire 1 se l'utente ha vinto, -1 se il computer ha vinto, 0 se si pareggia (o si verifica un errore)
    public static int verificaVittoria(int[][] tabella){

        boolean continua = false;
        int primaDiagonaleComputer = 0;
        int secondaDiagonaleComputer = 0;
        int primaDiagonaleUtente = 0;
        int secondaDiagonaleUtente = 0;

        int[] righeComputer = new int[3];
        int[] colonneComputer = new int[3];
        int[] righeUtente = new int[3];
        int[] colonneUtente = new int[3];

        for(int i = 1; i < tabella.length-1; i++){  //i riga
            for(int j = 1; j < tabella[i].length-1; j++){   //j colonna

                if(tabella[i][j] == 1){
                    switch(i){
                        case 1:
                            righeComputer[0]++;
                            break;
                        case 2:
                            righeComputer[1]++;
                            break;
                        case 3:
                            righeComputer[2]++;
                            break;
                        default:
                            System.out.println("Errore nello switch e");
                            System.exit(0);
                    }

                    switch(j){
                        case 1:
                            colonneComputer[0]++;
                            break;
                        case 2:
                            colonneComputer[1]++;
                            break;
                        case 3:
                            colonneComputer[2]++;
                            break;
                        default:
                            System.out.println("Errore nello switch f");
                            System.exit(0);
                    }
                }
                else{
                    if(tabella[i][j] == 2){
                        switch(i){
                            case 1:
                                righeUtente[0]++;
                                break;
                            case 2:
                                righeUtente[1]++;
                                break;
                            case 3:
                                righeUtente[2]++;
                                break;
                            default:
                                System.out.println("Errore nello switch g");
                                System.exit(0);
                        }
    
                        switch(j){
                            case 1:
                                colonneUtente[0]++;
                                break;
                            case 2:
                                colonneUtente[1]++;
                                break;
                            case 3:
                                colonneUtente[2]++;
                                break;
                            default:
                                System.out.println("Errore nello switch h");
                                System.exit(0);
                        }
                    }
                }

                if(i == j){
                    if(tabella[i][j] == 1){
                        primaDiagonaleComputer++;
                    }
                    else{
                        if(tabella[i][j] == 2){
                            primaDiagonaleUtente++;
                        }
                    }
                }
                else{
                    if(i - j == 2 || i - j == -2){
                        if(tabella[i][j] == 1){
                            secondaDiagonaleComputer++;
                        }
                        else{
                            if(tabella[i][j] == 2){
                                secondaDiagonaleUtente++;
                            }
                        }
                    }
                }
            }
        }

        for(int n = 0; n < righeComputer.length; n++){
            if(righeComputer[n] == 3 || colonneComputer[n] == 3){
                return -1;
            }
            else{
                if(righeUtente[n] == 3 || colonneUtente[n] == 3){
                    return 1;
                }
            }
        }

        if(primaDiagonaleComputer == 3 || secondaDiagonaleComputer == 3){
            return -1;
        }
        else{
            if(primaDiagonaleUtente == 3 || secondaDiagonaleUtente == 3){
                return 1;
            }
        }

        for(int i = 1; i < tabella.length-1; i++){  //i riga
            for(int j = 1; j < tabella[i].length-1; j++){   //j colonna
                if(tabella[i][j] == 0){
                    continua = true;
                    //System.out.println("dentro");
                }
            }
        }

        if(!continua){
            return 0;
        }
        else{
            return -2;
        }

    }
}
