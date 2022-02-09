public class Programma {
    public static void main(String[] args) {
        int[] fintaMatrice = Metodi.creaMatrice(7, 7);
        Metodi.scriviElemento(fintaMatrice, 7, 7, 4, 2, 5);
        int valore = Metodi.leggiElemento(fintaMatrice, 7, 7, 4, 2);

        Metodi.stampaMatrice(fintaMatrice, 7, 7);
        System.out.println("valore: " + valore);
    }
}
