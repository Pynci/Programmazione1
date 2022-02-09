import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String stringaEstratta = Metodi.estraiStringaCasuale();
        char[] caratteriStringa = new char[stringaEstratta.length()];
        char[] caratteriIndovinati = new char[stringaEstratta.length()];
        char carattereInserito = '%';
        boolean indovinato = false;
        int contaCaratteriIndovinati = 0;
        int contaTentativi = 0;

        //conversione stringa -> array di caratteri
        //inizializzazione array caratteriIndovinati
        for(int i = 0; i < stringaEstratta.length(); i++){
            caratteriStringa[i] = stringaEstratta.charAt(i);
            caratteriIndovinati[i] = '-';
        }

        do{
            contaTentativi++;

            //stampa dei caratteri della stringa indovinati fino ad ora
            Metodi.stampaLettereIndovinate(caratteriIndovinati);

            //inserimento della lettera da cercare
            System.out.print("Lettera: ");
            String temp = tastiera.next().toLowerCase();
            carattereInserito = temp.charAt(0);

            contaCaratteriIndovinati = Metodi.scopriLettera(carattereInserito, caratteriIndovinati, caratteriStringa, contaCaratteriIndovinati);

            if(contaCaratteriIndovinati == caratteriStringa.length){
                indovinato = true;
            }

        }
        while(contaTentativi < 20 && !indovinato);

        System.out.println("---------PARTITA TERMINATA---------");
        System.out.println("La parola era " + stringaEstratta);
        if(indovinato){
            System.out.println("Complimenti, hai vinto!");
        }
        else{
            System.out.println("Hai esaurito i tentativi a disposizione.");
        }
    }
}
