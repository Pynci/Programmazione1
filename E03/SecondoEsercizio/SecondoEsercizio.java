import java.util.Scanner;
import java.util.function.IntPredicate;

public class SecondoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String inputUtente = "";
        int contaSpazi = 0;
        String primaParola = "";
        String ultimaParola = "";
        boolean ciSonoSpazi = false;

        System.out.println("Inserire una frase:");
        inputUtente = tastiera.nextLine();

        if(inputUtente.equals("")){
            System.out.println("La frase inserita non contiene nessuna parola.");
        }
        else{
            System.out.println("Frase inserita: " + inputUtente);
            for(int i = 0; i < inputUtente.length(); i++){
                if(inputUtente.charAt(i) == ' '){
                    ciSonoSpazi = true;
                    if(contaSpazi == 0){
                        primaParola = inputUtente.substring(0, i);
                    }
                    ultimaParola = inputUtente.substring(i+1);
                    contaSpazi++;
                }
            }
            if(!ciSonoSpazi){
                System.out.println("Parola: " + inputUtente + ", lunghezza: " + inputUtente.length());
            }
            else{
                System.out.println("Prima parola: " + primaParola + ", lunghezza: " + primaParola.length() + "; Ultima parola: " + ultimaParola + ", lunghezza: " + ultimaParola.length());
            }
        }
    }
}
