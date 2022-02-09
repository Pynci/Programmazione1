public class Metodi {
    public static int sommaDueInteri(int a, int b){
        return a + b;
    }

    public static int divisioneIntera(int a, int b){
        return a / b;
    }

    public static int restoDivisioneIntera(int a, int b){
        return a % b;
    }

    public static double mediaTraDueDouble(double a, double b){
        return (a + b)/2.0;
    }

    public static int valoreAssolutoIntero(int a){
        int valoreAssoluto = 0;

        if(a >= 0){
            valoreAssoluto = a;
        }
        else{
            valoreAssoluto = -a;
        }

        return valoreAssoluto;
    }

    public static int lunghezzaStringaIntero(int a){
        String stringa = "" + a;
        return stringa.length();
    }
}
