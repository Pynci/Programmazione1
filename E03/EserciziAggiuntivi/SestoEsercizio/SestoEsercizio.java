import java.util.Scanner;

public class SestoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        boolean inputOK = true;
        String primoInsieme = "";
        String secondoInsieme = "";
        String unione = "";
        String intersezione = "";

        //validazione input primoInsieme
        do{
            System.out.println("Inserisci una stringa composta unicamente da 0 e 1:");
            primoInsieme = tastiera.next();
            for(int i = 0; i < primoInsieme.length(); i++){
                //System.out.println(primoInsieme.charAt(i));
                if(primoInsieme.charAt(i) != 48 && primoInsieme.charAt(i) != 49){
                    //System.out.println("arriva qui");
                    inputOK = false;
                }
            }
        }
        while(!inputOK);

        //validazione input secondoInsieme
        do{
            System.out.println("Inserisci una stringa composta unicamente da 0 e 1 (lunga come la prima inserita):");
            secondoInsieme = tastiera.next();
            for(int i = 0; i < secondoInsieme.length(); i++){
                if((secondoInsieme.charAt(i) != '0' && secondoInsieme.charAt(i) != '1') || primoInsieme.length() != secondoInsieme.length()){
                    inputOK = false;
                }
            }
        }
        while(!inputOK);

        //unione e intersezione dei due insiemi
        for(int i = 0; i < primoInsieme.length(); i++){
            if(primoInsieme.charAt(i) == secondoInsieme.charAt(i)){
                unione += primoInsieme.charAt(i);
                intersezione += primoInsieme.charAt(i);
            }
            else{
                unione += "1";
                intersezione += "0";
            }
        }

        System.out.println("Unione = " + unione + "; Intersezione = " + intersezione);
    }
}
