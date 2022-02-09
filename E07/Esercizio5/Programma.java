public class Programma {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int risultato = mcd(230,140);
        System.out.println(risultato);
    }

    public static int mcd(int a, int b){
        
        if(a > 0 && b > 0){
            if(a == b){
                return a;
            }
            else{
                if(a > b){
                    return mcd(a-b,b);
                }
                if(b > a){
                    return mcd(b-a,a);
                }
            }
        }
        return -1;
        
    }
}
