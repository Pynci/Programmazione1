import java.util.Scanner;

public class Programma{
    public static void main(String[] args){
        //manca solo da inserire il programma in un do while di controllo per verificare che effettivamente venga eseguito correttamente.
        char[][] matrice = Metodi.creaMatrice();
        String parolaChiave = "";
        String messaggioCifrato = "";
        String messaggioInChiaro = "";
        Scanner tastiera = new Scanner(System.in);
        int menu;

        while(true){
            menu = Metodi.sceltaMenu();
            switch(menu){
                case 1:
                    parolaChiave = Metodi.cambiaParolaChiave();
                    break;
    
                case 2:
                    boolean check = true;
                    do{
                        System.out.println();
                        System.out.print("Inserisci un messaggio da cifrare: ");
                        messaggioInChiaro = tastiera.next();
    
                        for(int i = 0; i < messaggioInChiaro.length(); i++){
                            if(messaggioInChiaro.charAt(i) < 'a' || messaggioInChiaro.charAt(i) > 'z'){
                                check = false;
                                System.out.println("Input non valido.");
                            }
                        }
                    }
                    while(!check);
    
                    messaggioCifrato = Metodi.cifraMessaggio(messaggioInChiaro, parolaChiave, matrice);
                    if(messaggioCifrato != null){
                        System.out.println("Il messaggio cifrato è: " + messaggioCifrato);
                    }
                    break;
                
                case 3:
                    boolean inputOk = true;
                    do{
                        System.out.println();
                        System.out.print("Inserisci un messaggio cifrato: ");
                        messaggioCifrato = tastiera.next();
    
                        for(int i = 0; i < messaggioCifrato.length(); i++){
                            if(messaggioCifrato.charAt(i) < 'a' || messaggioCifrato.charAt(i) > 'z'){
                                check = false;
                                System.out.println("Input non valido.");
                            }
                        }
                    }
                    while(!inputOk);
    
                    messaggioInChiaro = Metodi.decifraMessaggio(messaggioCifrato, parolaChiave, matrice);
                    if(messaggioInChiaro != null){
                        System.out.println("Il messaggio cifrato è: " + messaggioInChiaro);
                    }
                    break;
                
                case 4:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Si è verificato un errore grave!");
            }
        }
        
    }
}
