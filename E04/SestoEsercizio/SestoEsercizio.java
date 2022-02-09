import java.util.Scanner;

public class SestoEsercizio {
    public static void main(String[] args){

        Scanner tastiera  = new Scanner(System.in);
        String genoma = "";
        String proteina = "";
        int contatore = 0;

        System.out.println("Inserire il genoma:");
        genoma = tastiera.next();

        System.out.println("Inserire la proteina:");
        proteina = tastiera.next();

        System.out.print("La sequenza " + proteina + " compare in " + genoma + " nelle seguenti posizioni: ");

        //scorro i caratteri di genoma
        for(int indiceGenoma = 0; indiceGenoma < genoma.length(); indiceGenoma++){

            //se il carattere di genoma è uguale al primo carattere di proteina
            if(genoma.charAt(indiceGenoma) == proteina.charAt(0)){
                //scorro proteina
                for(int indiceProteina = 0; indiceProteina < proteina.length(); indiceProteina++){
                    //se proteina può ancora starci senza sforare genoma
                    if((genoma.length() - 1) >= (indiceGenoma + proteina.length()-1)){
                        //se il carattere corrente di proteina è uguale al corrispondente carattere del genoma
                        if(proteina.charAt(indiceProteina) == genoma.charAt(indiceGenoma + indiceProteina)){
                            contatore++;
                        }
                        //se il numero dei caratteri in comune tra proteina e genoma è pari a tutto proteina
                        if(contatore == proteina.length()){
                            System.out.print(indiceGenoma+1 + " "); //le posizioni partono da 1
                        }
                    }
                }
                //finito di scorrere proteina resetto il contatore dei caratteri uguali a zero
                contatore = 0;
            }

        }

    }
}
