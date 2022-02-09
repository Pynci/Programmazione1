import java.util.Scanner;

public class SettimoEsercizio{
    public static void main(String[] args){
        //non funge, correggere
        Scanner tastiera = new Scanner(System.in);
        int n = 0;
        int m = 0;
        String primoNumero = "";
        String secondoNumero = "";
        int esponente = 1;
        int potenza = 1;
        int risultato = 0;

        System.out.println("Inserisci due numeri interi separati da uno spazio:");
        primoNumero = tastiera.next();
        secondoNumero = tastiera.next();

        //converto in intero il primo numero inserito
        for(int i = 0; i < primoNumero.length(); i++){
            if(primoNumero.charAt(i) < 48 || primoNumero.charAt(i) > 57){
                System.out.println("Sono ammesse solo cifre decimali.");
                System.exit(0);
            }
            else{
                esponente = (primoNumero.length() - 1) - i;
                for(int j = 0; j < esponente; j++){
                    potenza = potenza * 10;
                }
                n += potenza * (primoNumero.charAt(i) - '0');
                potenza = 1;
            }
        }

        //ripristino le variabili per il calcolo della potenza
        esponente = 1;
        potenza = 1;

        //converto in intero il secondo numero inserito
        for(int i = 0; i < secondoNumero.length(); i++){
            if(secondoNumero.charAt(i) < 48 || secondoNumero.charAt(i) > 57){
                System.out.println("Sono ammesse solo cifre decimali.");
                System.exit(0);
            }
            else{
                esponente = (secondoNumero.length() - 1) - i;
                for(int j = 0; j < esponente; j++){
                    potenza = potenza * 10;
                }
                m += potenza * (secondoNumero.charAt(i) - '0');
                potenza = 1;
            }
        }

        //stampo i due fattori
        System.out.println("");
        System.out.println(n);
        System.out.println(m);
        System.out.println("------");

        //calcolo e stampo i risultati intermedi
        for(int i = 0; i < primoNumero.length(); i++){
            for(int j = 0; j < secondoNumero.length(); j++){
                risultato += n * (secondoNumero.charAt(j) - '0');
            }
            System.out.println(risultato);
        }

        //stampo il risultato del prodotto
        System.out.println("------");
        System.out.println(n*m);

    }
}
