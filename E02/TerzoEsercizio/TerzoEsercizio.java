import java.util.Scanner;

public class TerzoEsercizio {
    public static void main(String[] args) {
        String inputUtente = "";
        String charset = "qwertyuiopasdfghjklzxcvbnm";
        int m = 0;
        int n = 0;
        boolean soloLettere = false;
        String nuovaStringa;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire una stringa composta da lettere minuscole dell'alfabeto, seguita da due numeri naturali compresi tra 0 e la lunghezza della stringa - 1: ");
        inputUtente = tastiera.next();
        m = tastiera.nextInt();
        n = tastiera.nextInt();

        //controllo che la stringa contenga solamente lettere dell'alfabeto minuscole
        for(int i = 0; i < inputUtente.length(); i++){
            for(int j = 0; j < charset.length(); j++){
                if(inputUtente.charAt(i) == charset.charAt(j)){
                    soloLettere = true;
                }
            }
            if(!soloLettere){
                System.out.println("La stringa inserita non è valida");
                System.exit(0);
            }
            soloLettere = false;
        }

        //controllo che m e n non superino la lunghezza della stringa
        if(m >= inputUtente.length() || n >= inputUtente.length() || m < 0 || n < 0){
            System.out.println("Uno o più valori numerici inseriti non solo validi");
            System.exit(0);
        }


    }

    // public static void calcola(int m, int n, int k, String input){
    //     String stringaElaborata;

    // }
}
