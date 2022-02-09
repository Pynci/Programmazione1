public class Metodi {
    public static int[] creaMatrice(int righe, int colonne){
        int[] matrice = new int[righe*colonne];

        for(int i = 0; i < matrice.length; i++){
            matrice[i] = 0;
        }

        return matrice;
    }

    public static void scriviElemento(int[] array, int righe, int colonne, int indiceRiga, int indiceColonna, int elemento){
        boolean fatto = false;
        
        for(int i = 0; i < righe * colonne; i = i + colonne){
            for(int j = 0; j < colonne; j++){
                if(i/colonne == indiceRiga && j == indiceColonna){
                    array[i+j] = elemento;
                    fatto = true;
                }
            }
        }

        if(!fatto){
            System.out.println("Gli indici specificati non sono corretti.");
            System.exit(0);
        }
    }

    public static int leggiElemento(int[] array, int righe, int colonne, int indiceRiga, int indiceColonna){
        int indice = indiceRiga * colonne + indiceColonna;

        return array[indice];
    }

    public static void stampaMatrice(int[] array, int righe, int colonne){
        for(int i = 0; i < righe * colonne; i= i + colonne){
            for(int j = 0; j < colonne; j++){
                System.out.print(array[i + j] + " ");
            }
            System.out.println();
        }
    }
}
