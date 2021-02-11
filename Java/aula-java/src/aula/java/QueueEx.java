
package aula.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
     public static void main(String[] args) {
         
         Queue<String> filaBanco = new LinkedList<>();
         
         filaBanco.add("Pamela");
         filaBanco.add("Patricia");
         filaBanco.add("Roberto");
         filaBanco.add("Flavio");
         filaBanco.add("Pamela");
         filaBanco.add("Anderson");
         
         System.out.println(filaBanco);
              
         String clienteASerAtendido = filaBanco.poll();
         
         System.out.println(clienteASerAtendido);
         System.out.println(filaBanco);
         
         String primeiroCliente = filaBanco.peek();
         System.out.println(primeiroCliente);
         
         System.out.println(filaBanco);
         
         // filaBanco.clear();
         
         // retorna 
         String primeiroClienteQuErro = filaBanco.element();
         
         System.out.println(primeiroClienteQuErro);
         
         System.out.println(filaBanco);
         
         for (String client: filaBanco){
             System.out.println(client);
         }
         
         Iterator<String> iteratorFilaBanco = filaBanco.iterator();
         
         while (iteratorFilaBanco.hasNext()){
             System.out.println("->>>>"+iteratorFilaBanco.next());
         }
         
         System.out.println(filaBanco.size());
         
     }
}
