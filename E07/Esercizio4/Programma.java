public class Programma {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int risultato = somma(a,b);
        System.out.println(risultato);
    }

    public static int somma(int a, int b){
        if(b <= 0){
            return a;
        }
        else{
            return somma(a+1,b-1);
        }
    }
}
