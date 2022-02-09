import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SecondoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String minuscola;
        String maiuscola;
        String temporaneaMinuscola;
        String temporaneaMaiuscola;
        boolean soloLettere = false;
        String charset = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";

        //inserimento stringhe da tastiera
        System.out.println("Inserire due stringhe separate da uno spazio (la prima minuscola e la seconda maiuscola):");
        minuscola = tastiera.next();
        maiuscola = tastiera.next();

        //controllo che la prima stringa contenga solo lettere dell'alfabeto
        for(int indice = 0; indice<minuscola.length(); indice++){
            for(int i = 0; i < charset.length(); i++){
                if(minuscola.charAt(indice) == charset.charAt(i)){
                    soloLettere = true;
                }
            }
            if(!soloLettere){
                System.out.println("Le stringhe possono contenere unicamente lettere dell'alfabeto");
                System.exit(0);
            }
            soloLettere = false;
        }

        //controllo che la seconda stringa contenga solo lettere dell'alfabeto
        for(int indice = 0; indice<maiuscola.length(); indice++){
            for(int i = 0; i < charset.length(); i++){
                if(maiuscola.charAt(indice) == charset.charAt(i)){
                    soloLettere = true;
                }
            }
            if(!soloLettere){
                System.out.println("Le stringhe possono contenere unicamente lettere dell'alfabeto");
                System.exit(0);
            }
            soloLettere = false;
        }

        //dichiaro le stringhe d'appoggio per il confronto e gli array che dovranno contenere i caratteri
        temporaneaMinuscola = minuscola;
        temporaneaMinuscola = temporaneaMinuscola.toLowerCase();
        temporaneaMaiuscola = maiuscola;
        temporaneaMaiuscola = temporaneaMaiuscola.toUpperCase();
        char[] arrayMinuscola = new char[minuscola.length()];
        char[] arrayMaiuscola = new char[maiuscola.length()];

        //controllo che le stringhe rispettino i parametri (minuscola la prima e maiuscola la seconda)
        if(temporaneaMinuscola.equals(minuscola) && temporaneaMaiuscola.equals(maiuscola)){

            //creo degli array di caratteri corrispondenti alle stringhe
            for(int i = 0; i < minuscola.length(); i++){
                arrayMinuscola[i] = minuscola.charAt(i);
            }
            for(int i = 0; i < maiuscola.length(); i++){
                arrayMaiuscola[i] = maiuscola.charAt(i);
            }

            //combino i caratteri usando gli indici degli array (e li stampo)
            for(int i = 0; i < minuscola.length(); i++){
                for(int j = 0; j < maiuscola.length(); j++){
                    System.out.println("" + arrayMinuscola[i] + arrayMaiuscola[j]);
                }
            }
        }

    }
}
