
package aula.java;

import java.util.HashMap;
import java.util.Map;


public class MapC {
    public static void main(String[] args) {
        
        Map<String, Integer> campeosMundialFifa = new HashMap<>();
        
        // adicionar os campeos mundias fifa no mapa
        campeosMundialFifa.put("Brasil", 5);
        campeosMundialFifa.put("Alemanha", 4);
        campeosMundialFifa.put("Italia", 4);
        campeosMundialFifa.put("Uruguai", 2);
        campeosMundialFifa.put("Argentina", 2);
        campeosMundialFifa.put("Franca", 2);
        campeosMundialFifa.put("Inglaterra", 1);
        campeosMundialFifa.put("Espanha", 1);
        
        System.out.println(campeosMundialFifa);
        
        // Retorna a Argentina
        System.out.println(campeosMundialFifa.get("Argentina"));
        
        // Retorna se existe ou nao um campeao Franca
        System.out.println(campeosMundialFifa.containsKey("Franca"));
        
        //remove campeao franca
        campeosMundialFifa.remove("Franca");
        
        
    }
}
