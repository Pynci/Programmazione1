public class Metodi {
    public static String estraiStringaCasuale(){
        String[] poolStringhe = {
            "algoritmo",
            "programma",
            "elaboratore",
            "linguaggio",
            "astrazione",
            "automa",
            "inizializzazione",
            "processore",
            "architettura",
            "calcolatore",
            "dichiarazione",
            "istanza",
            "costruttore",
            "classe"
        };  //14 stringhe

    int indiceEstratto = (int)(Math.random() * 15);

    return poolStringhe[indiceEstratto];
    }

    public static void stampaLettereIndovinate(char[] caratteriIndovinati){
        for(int i = 0; i < caratteriIndovinati.length; i++){
            System.out.print(caratteriIndovinati[i]);
        }
        System.out.println("");
    }

    public static int scopriLettera(char carattereInserito, char[] caratteriIndovinati, char[] caratteriStringa, int contatore){
        boolean trovata = false;
        boolean scopertaPrima = false;

        for(int i = 0; i < caratteriStringa.length; i++){

            if(carattereInserito == caratteriStringa[i]){

                if(caratteriIndovinati[i] != carattereInserito){
                    caratteriIndovinati[i] = carattereInserito;
                    contatore++;
                }
                else{
                    scopertaPrima = true;
                }

                trovata = true;

            }

        }

        if(!trovata){
            System.out.println("La lettera cercata non c'è!");
        }
        else{
            trovata = false;
        }

        if(scopertaPrima){
            System.out.println("La lettera cercata era già stata scoperta!");
        }

        return contatore;
    }
}
