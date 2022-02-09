public class Metodi {
    public static int[] creaArray(){
        int array[] = new int[100];
        
        return array;
    }

    public static boolean aggiungiElemento(int[] array, int numeroElementi, int elemento){
        boolean esito = true;

        if(numeroElementi == array.length){
            esito = false;
        }
        else{
            for(int i = 0; i < numeroElementi; i++){
                if(array[i] == elemento){
                    esito = false;
                }
            }

            if(esito){
                array[numeroElementi] = elemento;
            }
        }

        return esito;
    }

    public static boolean rimuoviElemento(int[] array, int numeroElementi, int elemento){
        boolean esito = false;
        int indice = -1;
        int temp;

        if(numeroElementi == 0){
            esito = false;
        }
        else{
            for(int i = 0; i < numeroElementi; i++){
                if(array[i] == elemento){
                    esito = true;
                    indice = i;
                }
            }

            if(esito){
                array[indice] = 0;

                for(int i = indice; i < numeroElementi-1; i++){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        return esito;
    }
}
