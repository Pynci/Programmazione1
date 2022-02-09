public class Programma {
    public static void main(String[] args) {
        int[] array = Metodi.creaArray();
        int numeroElementi = 20;
        
        for(int i = 0; i < numeroElementi; i++){
            array[i] = i;
        }

        if(Metodi.rimuoviElemento(array, numeroElementi, 12)){
            for(int i = 0; i < numeroElementi; i++){
                System.out.print(array[i] + " ");
            }
        }
        
    }
}
