import java.util.Scanner;

public class TerzoEsercizio {
    public static void main(String[] args) {
        
        int votoTeoria = 0;     //da -8 a 8
        int votoPratica = 0;    //da 0 a 24
        int votoFinale = 0;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire i voti di teoria e pratica separati da uno spazio: ");
        votoTeoria = tastiera.nextInt();
        votoPratica = tastiera.nextInt();
        votoFinale = votoTeoria + votoPratica;
        
        if(votoTeoria < -8 || votoTeoria > 8 || votoPratica < 0 || votoPratica > 24){
            System.out.println("Input non valido.");
            System.exit(0);
        }

        if(votoTeoria <= 0 && votoPratica <= 18){
            System.out.println("Bocciato, devi studiare ed esercitarti di più.");
        }
        else{
            if(votoTeoria <= 0 && votoFinale >= 18){
                System.out.println("Bocciato, devi studiare più teoria.");
            }
            else{
                if(votoTeoria >= 0 && votoFinale <= 18){
                    System.out.println("Bocciato, devi esercitarti di più.");
                }
                else{
                    if(votoFinale == 31 || votoFinale == 32){
                        System.out.println("Congratulazioni, 30 e lode!");
                    }
                    else{
                        System.out.println("Il tuo voto e': " + votoFinale);
                    }
                }
            }
        }
        
        
        
    }
}
