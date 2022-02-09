import java.util.Scanner;

public class SecondoEsercizio{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		String a = "";
		String b = "";
		int lunghezza = 0;
		
		System.out.println("Inserire la prima parola:");
		a = tastiera.next();
		a = a.toLowerCase();
		
		System.out.println("Inserire la seconda parola:");
		b = tastiera.next();
		b = b.toLowerCase();
		
		//calcolare la lunghezza del massimo prefisso comune
		if(a.length() >= b.length()){
			for(int i = 0; i < b.length(); i++){
				if(a.charAt(i) == b.charAt(i)){
					lunghezza++;
				}
				else{
					break;
				}
			}
		}
		else{
			for(int i = 0; i < a.length(); i++){
				if(a.charAt(i) == b.charAt(i)){
					lunghezza++;
				}
			}
		}
		
		System.out.println("La lunghezza del prefisso comune risulta: " + lunghezza);
	}
}