
package aula.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercicio {
    public static void main(String[] args) {
    
        List <String> names = new ArrayList<>();
        
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("Joao");
        
        System.out.println(names);
        
        names.set(2,"Roberto");
        System.out.println(names);
        
        System.out.println(names.get(1));
        
        names.remove(3);
        System.out.println(names);
        
        names.remove("Joao");
        System.out.println(names);
        
        int tamanho = names.size();
        System.out.println(tamanho);

        boolean temJuliano = names.contains("Juliano");
        System.out.println(temJuliano);
        
         
        
        List <String> names2 = new ArrayList<>();
         
        names2.add("Ismael");
        names2.add("Rodrigo");
         
        // somar 2 arrays. Incompleto
        List <String> listanova = new ArrayList<>();
      
        
        Collections.sort(listanova);
        System.out.println(listanova);
        
        boolean listaEstaVazia = listanova.isEmpty();
        System.out.println(listaEstaVazia);
    }
}
