public class Metodi {
    public static int estraiNumeroCasuale(){
        return (int)(Math.random() * 99 + 1);
    }    

    public static int confrontaNumeri(int numeroInserito, int numeroDaIndovinare){
        int ritorno;

        if(numeroInserito == numeroDaIndovinare){
            ritorno = 0;
        }
        else{
            if(numeroInserito < numeroDaIndovinare){
                ritorno = -1;
            }
            else{
                ritorno = 1;
            }
        }

        return ritorno;
    }

    public static void aggiornaInformazioniPartite(int numeroDaIndovinare, boolean indovinato, int numeroTentativi,
    int[] numeriDaIndovinare, boolean[] indovinati, int[] numeriTentativi){
        
        //l'array contiene le info delle 5 partite a partire da 0 (la più vecchia) a 4 (la più recente)
        numeriDaIndovinare[0] = 0;
        indovinati[0] = false;
        numeriTentativi[0] = 0;

        for(int i = 0; i < 4; i++){
            numeriDaIndovinare[i] = numeriDaIndovinare[i+1];
            indovinati[i] = indovinati[i+1];
            numeriTentativi[i] = numeriTentativi[i+1];
        }
        numeriDaIndovinare[4] = numeroDaIndovinare;
        indovinati[4] = indovinato;
        numeriTentativi[4] = numeroTentativi;

    }
}
