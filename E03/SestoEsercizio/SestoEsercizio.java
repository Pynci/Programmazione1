import java.util.Scanner;

public class SestoEsercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String operatore = "";
        int primoOperando = 0;
        int secondoOperando = 0;
        int risultato = 0;
        boolean esciProgramma = false;

        do{

            System.out.println("");
            System.out.println("");
            System.out.println("Benvenuto nella calcolatrice Pinci!");
            System.out.println("Selezionare l'operatore desiderato:");
            System.out.println("\t+ somma");
            System.out.println("\t- differenza");
            System.out.println("\t* prodotto");
            System.out.println("\t/ divisione");
            System.out.println("\tu uscita dal programma");
            System.out.println("");
            operatore = tastiera.next();

            switch(operatore){
                case "+":
                    System.out.println("Inserire il primo operando: ");
                    primoOperando = tastiera.nextInt();

                    System.out.println("Inserire il secondo operando: ");
                    secondoOperando = tastiera.nextInt();

                    risultato = primoOperando + secondoOperando;

                    System.out.println("Il risultato dell'operazione e': " + risultato);

                    break;

                case "-":
                    System.out.println("Inserire il primo operando: ");
                    primoOperando = tastiera.nextInt();

                    System.out.println("Inserire il secondo operando: ");
                    secondoOperando = tastiera.nextInt();

                    risultato = primoOperando - secondoOperando;

                    System.out.println("Il risultato dell'operazione e': " + risultato);

                    break;

                case "*":
                    System.out.println("Inserire il primo operando: ");
                    primoOperando = tastiera.nextInt();

                    System.out.println("Inserire il secondo operando: ");
                    secondoOperando = tastiera.nextInt();

                    risultato = primoOperando * secondoOperando;

                    System.out.println("Il risultato dell'operazione e': " + risultato);

                    break;

                case "/":
                    System.out.println("Inserire il primo operando: ");
                    primoOperando = tastiera.nextInt();

                    System.out.println("Inserire il secondo operando: ");
                    secondoOperando = tastiera.nextInt();

                    if(secondoOperando != 0){
                        risultato = primoOperando / secondoOperando;
                        System.out.println("Il risultato dell'operazione e': " + risultato);
                    }
                    else{
                        System.out.println("Non e' possibile dividere per 0!");
                    }

                    break;

                case "u":
                    esciProgramma = true;
                    break;
                default:
                    System.out.println("Input non valido.");
            }
        }
        while(!esciProgramma);
    }
}
