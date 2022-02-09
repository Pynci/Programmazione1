public class Programma{
    public static void main(String[] args) {
        int k = args.length;
        boolean valida = Metodi.controllaValiditaEspressione(args);

        if(!valida){
            System.out.println("L'espressione inserita non risulta valida, riprovare.");
        }
        else{
            Metodi.valutaEspressione(args);
        }
    }
}
