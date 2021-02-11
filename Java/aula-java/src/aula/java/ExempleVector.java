package aula.java;
 
import java.util.List;
import java.util.Vector;


public class ExempleVector {
    public static void main(String[] args) {
        List <String> esportes = new Vector<>();
        
        // ADD 4 esportes
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Rugby");
        esportes.add("Volei");
        esportes.add("Natação");
        esportes.add("Motocroos");
        
        System.out.println(esportes);
        
        // Alterar valor da posicao 2 para "Ping Pong"
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);
        
        // Remove o esporte posicao 2
        esportes.remove(2);
        System.out.println(esportes);
        
        // remove Volei
        esportes.remove("Volei");
        System.out.println(esportes);
        
        // Retornar o primeiro valor do Vector
        System.out.println(esportes.get(0));
        
        // Navega nos esportes
        for (String esporte: esportes){
            System.out.println("-->>"+esporte);
        }
    }
}
