import java.util.Scanner;

public class TerzoEsercizio{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		int numUtente;
		boolean continuaEsecuzione = true;
		int fattore = 2;
		int contatoreDivisori = 0;
		int contaVolte = 0;
		
		System.out.println("Inserire un numero intero:");
		numUtente = tastiera.nextInt();
		
		if(numUtente < 0){
			System.out.println("Input non valido.");
			System.exit(0);
		}
		else{
			while(continuaEsecuzione){
				
				do{
					for(int i = 1; i <= fattore; i++){
						if(fattore % i == 0){
							contatoreDivisori++;
						}
					}
					if(contatoreDivisori > 2){
						fattore++;
						contatoreDivisori = 0;
					}
				}
				while(contatoreDivisori == 0);
				
				while(numUtente % fattore == 0){
					numUtente = numUtente / fattore;
					contaVolte++;
				}
				if(contaVolte > 0){
					System.out.println("Fattore: " + fattore + " (" + contaVolte + " volte);");
					fattore++;
					contaVolte = 0;
					contatoreDivisori = 0;
				}

				if(numUtente == 1){
					continuaEsecuzione = false;
				}
				
			}
		}
	}
}