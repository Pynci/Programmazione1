import java.util.Scanner;

public class PrimoEsercizio{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		int n = 0;
		int esponente = 0;
		
		System.out.println("Inserire un numero intero:");
		n = tastiera.nextInt();
		
		if(n < 0){
			System.out.println("Input non valido.");
			System.exit(0);
		}
		else{
			while(Math.pow(2,esponente) < n){
				esponente++;
			}
			
			System.out.println("La piu' piccola potenza di 2 minore del valore inserito risulta: " + (int)Math.pow(2,esponente));
		}
	}
}
