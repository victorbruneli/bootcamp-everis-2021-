package aula.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AulaJava {

    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Romeu");
        nomes.add("Pedro");
        nomes.add("Juliete");
        nomes.add("Antonio");
        nomes.add("Wagner");
        System.out.println(nomes);
       
        // Inserir IGOR no role
        nomes.set(2, "Igor");
        System.out.println(nomes);
        
        // Colocar em orden alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);
        
        // Remover pela posicao
        nomes.remove(4);
        System.out.println(nomes);
        
        // Remover - Romeu
        nomes.remove("Romeu");
        System.out.println(nomes);
        
        //Trazer somente o IGOR posição 1
        String nome = nomes.get(1);
        System.out.println(nome);
        
        // Retorna index do elemento "Carlos" na lista
        // retorna -1 caso nao exista na lista.
        // se existir, retorna a posicao
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);
        
        // metodo saber quantos elementos tem na list
        int tamanho = nomes.size();
        System.out.println(tamanho);
        
        // Remover Antonio
        nomes.remove("Antonio");
        System.out.println(nomes);
        
        // Verificar quantos nomes na list
        tamanho = nomes.size();
        System.out.println(tamanho);
        
        // Retorna verdadeiro ou falso se estiver na list
       
        // True
        boolean temPedro = nomes.contains("Pedro");
        System.out.println(temPedro);

        // False
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        // Forma simples de interar dentro da list (for)
        for(String nomeDoItem: nomes){
            System.out.println("---->" + nomeDoItem);
        }
        
        // Interator com while
        Iterator <String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("->>-->>"+iterator.next());
        }
        
        // Limpa toda a lista
        nomes.clear();
        
        // Retorna um boolean - true se a lista estiver fazia, falso se nao estiver.
        // True
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
        
            
    }
}
