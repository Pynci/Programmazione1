import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String scelta = "";
        int a = 0;
        int b = 0;
        double c = 0;
        double d = 0;

        do{
            System.out.println("Fa la tua scelta:");
            System.out.println("a) somma di due numeri interi");
            System.out.println("b) divisione intera e resto tra due numeri interi");
            System.out.println("c) media tra due numeri double");
            System.out.println("d) valore assoluto di un numero intero");
            System.out.println("e) lunghezza della stringa che rappresenta un numero intero");
            System.out.println("t) termina il programma");
            scelta = tastiera.next();
            
            switch(scelta){
                case "a":
                case "A":
                    System.out.print("Inserisci il primo numero:");
                    a = tastiera.nextInt();

                    System.out.print("Inserisci il secondo numero:");
                    b = tastiera.nextInt();

                    System.out.println("Risultato = " + Metodi.sommaDueInteri(a,b) + ";\n");
                    break;

                case "b":
                case "B":
                    System.out.print("Inserisci il primo numero:");
                    a = tastiera.nextInt();

                    System.out.print("Inserisci il secondo numero:");
                    b = tastiera.nextInt();

                    if(b != 0){
                        System.out.print("Risultato = " + Metodi.divisioneIntera(a,b) + "; ");
                        System.out.println("Resto = " + Metodi.restoDivisioneIntera(a, b) + ";\n");
                    }
                    else{
                        System.out.println("Col cazzo che divido per zero, ti do un libro di matematica nelle gengive!\n");
                    }
                    break;

                case "c":
                case "C":
                    System.out.print("Inserisci il primo numero:");
                    c = tastiera.nextDouble();

                    System.out.print("Inserisci il secondo numero:");
                    d = tastiera.nextDouble();

                    System.out.println("Risultato = " + Metodi.mediaTraDueDouble(c,d) + ";\n");
                    break;

                case "d":
                case "D":
                    System.out.print("Inserisci il numero:");
                    a = tastiera.nextInt();

                    System.out.println("Risultato = " + Metodi.valoreAssolutoIntero(a) + ";\n");
                    break;

                case "e":
                case "E":
                    System.out.print("Inserisci il numero:");
                    a = tastiera.nextInt();

                    System.out.println("Risultato = " + Metodi.lunghezzaStringaIntero(a) + ";\n");
                    break;

                case "t":
                case "T":
                    break;

                default:
                    System.out.println("Errore: input non valido.\n");
            }
        }
        while(!scelta.equalsIgnoreCase("t"));
    }
}
