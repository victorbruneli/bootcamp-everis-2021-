
package treinee;

import java.util.Iterator;
import java.util.TreeSet;


public class ExTreeSet {
    public static void main(String[] args) {
        
        TreeSet<String> treeCapitais = new TreeSet();
        
        // Montar a arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
         
        System.out.println(treeCapitais);
                
        // Retorna a primeira capital no topo da Arvore
        System.out.println(treeCapitais.first());
        
        // 
        System.out.println(treeCapitais.last());
        
        //  abaixo de florianopolis : que vem antes
        System.out.println(treeCapitais.lower("Florianopolis"));
        
        // acima da cidade Florianopolis : que vem depois
        System.out.println(treeCapitais.higher("Florianopolis"));
        
        // EXIBE DNVO TODOS
        System.out.println(treeCapitais);
        
        // Retorna a primeira capital: removendo o set
        System.out.println(treeCapitais.pollFirst());
        
        // Retorna a ultima capital: removendo o set
        System.out.println(treeCapitais.pollLast());
        
        // EXIBE DNVO TODOS
        System.out.println(treeCapitais);
        
        // Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
