
package desafiosaritmeticojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AnaliseNumeros {
     public static void main(String[] args) throws IOException {
        String linha;
        int Po, Ne, P, I, num;
        
        Po = Ne = P = I = 0;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            linha = bfr.readLine();
            num = Integer.parseInt(linha);
            
            if (num % 2 == 0) {
                P++;
            } else {
                I++;
            }
            
            if (num > 0) Po++;
            if (num < 0) Ne++;
        }
        
        System.out.println( P + " valor(es) par(es)");
        System.out.println( I + " valor(es) impar(es)");
        System.out.println( Po + " valor(es) positivo(s)");
        System.out.println( Ne + " valor(es) negativo(s)");
    }
}
