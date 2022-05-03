# Programmazione 1
Una raccolta del codice scritto durante le esercitazioni di laboratorio del corso di Programmazione 1 (unimib).
```java
import unimib

public class RepositoryProgrammazione1{

  public static void main(String[] args){
    String corsoDiLaurea = "Informatica";
    String materia = "Programmazione 1";
    boolean testiPresenti = true;
    String[] argomenti = {"costrutti base", "identificatori", "tipi", "selezione",
                          "iterazione", "array", "metodi", "ricorsione"};
    
    System.out.println("Corso di laurea: " + corsoDiLaurea);
    
    System.out.println("Insegnamento: " + materia);
    
    for(int i = 0; i < argomenti.length; i++){
      System.out.print(argomenti[i] + " ");
    }
    
    if(testiPresenti){
      System.out.println("Nella repo è incluso il testo degli esercizi");
    }
    
  }
  
}
```
