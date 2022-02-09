public class Metodi{

    public static boolean controllaValiditaEspressione(String[] input){
        boolean valida =  true;
        char simbolo;

        for(int i = 0; i < input.length; i++){
            simbolo = input[i].charAt(0);
            //System.out.println("simbolo: " + simbolo);
            if(input[i].length() != 1){
                valida = false;
            }
            else{
                if((simbolo < '0' || simbolo > '9') && (simbolo != '-' && simbolo != '+')){
                    valida = false;
                }
                else{
                    if(i == 0 && (simbolo == '+' || simbolo == '-')){
                        valida = false;
                    }

                    if(i < input.length-1){
                        if((simbolo == '+' || simbolo == '-') && (input[i+1].charAt(0) == '+' || input[i+1].charAt(0) == '-')){
                            valida = false;
                        }
                    }
                    else{
                        if(i == input.length - 1){
                            if(simbolo == '+' || simbolo == '-'){
                                valida = false;
                            }
                        }
                    }
                }
            }
        }

        return valida;
    }

    public static int valutaOperando(String stringa){
        int valore = -2;

        if(stringa.length() != 1){
            valore = -1;
        }
        else{
            if(stringa.charAt(0) < '0' || stringa.charAt(0) > '9'){
                valore = -1;
            }
            else{
                valore = stringa.charAt(0) - '0';
            }
        }

        return valore;
    }

    public static void valutaEspressione(String[] input){

        if(input.length == 0){
            System.out.println("Non risulta inserita alcuna espressione.");
            System.exit(0);
        }

        int risultato = input[0].charAt(0) - '0';
        char operatore;
        //da chiamare solo se controllaValiditaEspressione() ha restituito true

        //calcola il valore dell'espressione inserita in fase di lancio
        //utilizzando valutaOperando() per convertire i numeri da stringa ad intero

        for(int i = 2; i < input.length; i++){
            if(i % 2 == 0){
                operatore = input[i-1].charAt(0);
                switch(operatore){
                    case '+':
                        risultato += valutaOperando(input[i]);
                        break;
                    case '-':
                        risultato -= valutaOperando(input[i]);
                        break;
                    default:
                        System.out.println("Si è verificato un errore inaspettato.");
                        System.exit(0);
                }
            }
        }

        System.out.println(risultato);
    }
}
