
package Comparator;

import java.util.Comparator;

// COMPARAR 2 com o 1
public class ComparadorReverse  implements Comparator<Comparador>{
    
    @Override
    public int compare(Comparador o1, Comparador o2){
        return o2.getIdade() - o1.getIdade();
    }
    
}
