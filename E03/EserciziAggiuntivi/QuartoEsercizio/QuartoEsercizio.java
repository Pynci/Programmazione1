import java.util.Scanner;

public class QuartoEsercizio{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        int capacitaZaino = 0;
        double sommaPesi = 0.0;
        int pesoOggetto = 1;
        int numeroOggetti = 0;
        int maxPesoOggetto = 0;
        int minPesoOggetto = 0;
        double pesoMedioOggetti = 0.0;

        do{
            System.out.println("Inserire la capacita' dello zaino:");
            capacitaZaino = tastiera.nextInt();
            minPesoOggetto = capacitaZaino;
        }
        while(capacitaZaino < 0);

        while(sommaPesi < capacitaZaino && pesoOggetto != 0){
            System.out.println("Inserire il peso dell'oggetto da mettere nello zaino:");
            pesoOggetto = tastiera.nextInt();

            if(sommaPesi + pesoOggetto <= capacitaZaino){
                sommaPesi += pesoOggetto;
                if(pesoOggetto != 0){
                        numeroOggetti++;
                }

                if(pesoOggetto > maxPesoOggetto){
                    maxPesoOggetto = pesoOggetto;
                }
                if(pesoOggetto < minPesoOggetto && pesoOggetto != 0){
                    minPesoOggetto = pesoOggetto;
                }
            }
            else{
                System.out.println("Questo non ci sta, riprova con un oggetto piu' leggero!");
            }
        }
        pesoMedioOggetti = sommaPesi/numeroOggetti;

        System.out.println("-------------------");
        System.out.println("Capacita' dello zaino = " + capacitaZaino);
        System.out.println("Peso totale degli oggetti = " + sommaPesi);
        System.out.println("Numero di oggetti = " + numeroOggetti);
        System.out.println("L'oggetto piu' pesante pesa " + maxPesoOggetto);
        System.out.println("L'oggetto meno pesante pesa " + minPesoOggetto);
        System.out.println("Il peso medio degli oggetti risulta " + pesoMedioOggetti);

    }
}
