
package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparadorExemplo {
    
    public static void main(String[] args) {
        
        List<Comparador> estudantes = new ArrayList<>();
        
        estudantes.add(new Comparador("Pedro ", 19));
        estudantes.add(new Comparador("Carlos ", 23));
        estudantes.add(new Comparador("Mariana ", 21));
        estudantes.add(new Comparador("Joao ", 18));
        estudantes.add(new Comparador("Thiago ", 20));
        estudantes.add(new Comparador("George ", 22));
        estudantes.add(new Comparador("Larissa ", 21));
        
        System.out.println("\n----------- ORDEM DE INSERÇÃO --------------");
        System.out.println(estudantes);
        
        
        estudantes.sort((first, secund) -> first.getIdade() - secund.getIdade());
        System.out.println("\n-> ORDEM DOS NUMEROS - *IDADE* - <-");
        System.out.println(estudantes);
        
        
        estudantes.sort((first, secund) -> secund.getIdade() - first.getIdade());
        System.out.println("\n-> ORDEM DOS NUMEROS - *IDADE - maior ao menor* - <-");
        System.out.println(estudantes);
        
        estudantes.sort(Comparator.comparingInt(Comparador::getIdade));
        System.out.println("\n--- ordem NATURAL dos numeros - idade (method reference) ---");
        System.out.println(estudantes);
        
        estudantes.sort(Comparator.comparingInt(Comparador::getIdade).reversed());
        System.out.println("\n--- ordem REVERSA dos numeros - idade (method reference) ---");
        System.out.println(estudantes);
        
        Collections.sort(estudantes);
        System.out.println(estudantes);
        
        System.out.println("\n--- ordem NATURAL dos numeros - idade (INTERFACE COMPARATOR) ---");
        System.out.println(estudantes);
        
        Collections.sort(estudantes, new ComparadorReverse());
        
        System.out.println("\n--- ordem REVERSA dos numeros - idade (INTERFACE COMPARATOR) ---");
        System.out.println(estudantes);
    }
}
