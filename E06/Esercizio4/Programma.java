import java.util.Scanner;

public class Programma{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int righe = 0;
        int colonne = 0;
        boolean inputSbagliato = false;
        int[][] matrice;
        int[][] matriceTrasposta;

        do{
            System.out.print("Numero di righe: ");
            righe = tastiera.nextInt();
            if(righe < 1 || righe > 10){
                inputSbagliato = true;
            }

            System.out.print("Numero di colonne: ");
            colonne = tastiera.nextInt();
            if(colonne < 1 || colonne > 10){
                inputSbagliato = true;
            }

            if(inputSbagliato){
                System.out.println("L'input non risulta corretto.");
            }

        }
        while(inputSbagliato);

        System.out.println("Matrice generata:");
        matrice = Metodi.generaMatriceCasuale(righe, colonne);
        Metodi.stampaMatrice(matrice);
        System.out.println();

        System.out.println("Matrice trasposta:");
        matriceTrasposta = Metodi.trasponiMatrice(matrice);
        Metodi.stampaMatrice(matriceTrasposta);


    }
}
