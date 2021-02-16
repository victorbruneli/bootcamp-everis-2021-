
package treinee;

import java.util.HashMap;
import java.util.Map;


public class UtilizandoMap {
     public static void main(String[] args) {
         Map<String, Integer> CampeosMundialFifa = new HashMap<>();
         
        // Comportamento semelhante ADD- PUT
        CampeosMundialFifa.put("Brasil", 5);
        CampeosMundialFifa.put("Alemanha", 4);
        CampeosMundialFifa.put("Italia", 4);
        CampeosMundialFifa.put("Uruguai", 2);
        CampeosMundialFifa.put("Argentina", 2);
        CampeosMundialFifa.put("Fraca", 2);
        CampeosMundialFifa.put("Inglaterra", 1);
        CampeosMundialFifa.put("Espanha", 1);
        
        System.out.println(CampeosMundialFifa);
        
        // Atualiza a chave BRASIL para = 6
        CampeosMundialFifa.put("Brasil", 6);
        
        // Retorna a ARGENTINA - Retorna o valor 2 da argentina
        System.out.println(CampeosMundialFifa.get("Argentina"));
        
        // Retorna se existe ou nao um Cmapeao Franca
         System.out.println(CampeosMundialFifa.containsKey("Franca"));
         
           
         
                
     }        
}
