import java.util.Scanner;

public class Metodi{
    public static int sceltaMenu(){
        int scelta = -1;
        Scanner tastiera = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("1 - Inserisci/cambia la parola chiave");
        System.out.println("2 - Cifra un messaggio");
        System.out.println("3 - Decifra un messaggio");
        System.out.println("0 - Esci dal programma");
        System.out.println();

        do{
            System.out.print("Scelta: ");
            scelta = tastiera.nextInt();

            if(scelta == 0){
                System.exit(0);
            }

            if(scelta < 1 || scelta > 3){
                System.out.println("Input non valido, riprova.");
            }
        }
        while(scelta < 1 || scelta > 3);

        return scelta;

    }

    public static String cambiaParolaChiave(){
        Scanner tastiera = new Scanner(System.in);
        String nuovaParola = "";
        boolean inputSbagliato = false;

        do{
            System.out.print("Inserisci la nuova parola chiave: ");
            nuovaParola = tastiera.next();

            for(int i = 0; i < nuovaParola.length(); i++){
                if(nuovaParola.charAt(i) < 'a' || nuovaParola.charAt(i) > 'z'){
                    System.out.println("Input non corretto.");
                    inputSbagliato = true;
                }
            }
        }
        while(inputSbagliato);

        return nuovaParola;

    }

    public static char[][] creaMatrice(){
        char[][] matrice = new char[26][26];
        int carattere = 97; //a

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                matrice[i][j] = (char)carattere;
                if(carattere < 122){
                    carattere++;
                }
                else{
                    carattere = 97;
                }
            }
            carattere = 97 + (i+1);
        }

        return matrice;

        /*
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        */

    }

    public static char cifraLettera(char carattereChiaro, char carattereChiave, char[][] matrice){
        int indiceChiaro = carattereChiaro - 97;
        int indiceChiave = carattereChiave - 97;
        char carattereCifrato = matrice[indiceChiaro][indiceChiave];
        return carattereCifrato;
    }

    public static char decifraLettera(char carattereCifrato, char carattereChiave, char[][] matrice){
        int indiceChiave = carattereChiave - 97;
        char carattereChiaro = '/';

        for(int i = 0; i < 26; i++){
            if(matrice[i][indiceChiave] == carattereCifrato){
                carattereChiaro = matrice[i][0];
            }
        }

        return carattereChiaro;
    }

    public static String cifraMessaggio(String daCifrare, String parolaChiave, char[][] matrice){
        if(parolaChiave.equals("")){
            System.out.println("È necessario specificare anticipatamente una parola chiave.");
            return null;
        }
        else{
            int j = 0;
            String messaggioCifrato = "";

            for(int i = 0; i < daCifrare.length(); i++){
                if(j == parolaChiave.length()){
                    j = 0;
                }
                
                messaggioCifrato = messaggioCifrato + Metodi.cifraLettera(daCifrare.charAt(i), parolaChiave.charAt(j), matrice);
            }

            return messaggioCifrato;
        }
        
    }

    public static String decifraMessaggio(String daDecifrare, String parolaChiave, char[][] matrice){
        if(parolaChiave.equals("")){
            System.out.println("È necessario specificare anticipatamente una parola chiave.");
            return null;
        }
        else{
            int j = 0;
            String messaggioDecifrato = "";
    
            for(int i = 0; i < daDecifrare.length(); i++){
                if(j == parolaChiave.length()){
                    j = 0;
                }
                
                messaggioDecifrato = messaggioDecifrato + Metodi.decifraLettera(daDecifrare.charAt(i), parolaChiave.charAt(j), matrice);
            }
    
            return messaggioDecifrato;
        }

    }
}
