import java.util.Scanner;

public class TerzoEsercizio{

    public static boolean cercaCarattere(String stringa, char carattere){
        boolean risultaPresente = false;

        for(int i = 0; i < stringa.length(); i++){
            if(stringa.charAt(i) == carattere){
                risultaPresente = true;
            }
        }

        return risultaPresente;
    }

    public static String rimuoviCarattere(String stringa, char carattere){
        String nuovaStringa = stringa;

        for(int i = 0; i < nuovaStringa.length(); i++){
            if(nuovaStringa.charAt(i) == carattere){
                nuovaStringa = nuovaStringa.substring(0,i) + nuovaStringa.substring(i + 1);
                i--;
            }
        }

        return nuovaStringa;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String stringaUtente = "";
        String carattereUtente = "";
        String nuovaStringa = "";

        System.out.print("Inserire la stringa: ");
        stringaUtente = tastiera.nextLine();

        do{
            System.out.print("Inserire il carattere: ");
            carattereUtente = tastiera.next();
        }
        while(carattereUtente.length() != 1);

        if(cercaCarattere(stringaUtente, carattereUtente.charAt(0))){
            nuovaStringa = rimuoviCarattere(stringaUtente, carattereUtente.charAt(0));
            System.out.println("Stringa aggiornata: " + nuovaStringa);
        }
    }
}