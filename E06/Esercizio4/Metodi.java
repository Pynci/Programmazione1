public class Metodi{
    public static int[][] generaMatriceCasuale(int righe, int colonne){
        int[][] matrice = new int[righe][colonne];
        for(int i = 0; i < righe; i++){
            for(int j = 0; j < colonne; j++){
                matrice[i][j] = (int)(Math.random()*100);
            }
        }

        return matrice;
    }

    public static int[][] trasponiMatrice(int[][] matrice){
        int[][] matriceTrasposta = new int[matrice[0].length][matrice.length];

        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[0].length; j++){
                matriceTrasposta[j][i] = matrice[i][j];
            }
        }

        return matriceTrasposta;
    }

    public static void stampaMatrice(int[][] matrice){
        int righe = matrice.length;
        int colonne = matrice[0].length;

        for(int i = 0; i < righe; i++){
            for(int j = 0; j < colonne; j++){
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
