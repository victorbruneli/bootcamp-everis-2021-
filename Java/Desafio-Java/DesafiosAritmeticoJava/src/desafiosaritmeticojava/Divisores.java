
package desafiosaritmeticojava;

import java.util.Scanner;

public class Divisores {

    static int A, B, C, D; 
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);  
    
    A = input.nextInt();
    B = input.nextInt();
    C = input.nextInt();
    D = input.nextInt();
        
    int n = -1;
    int sqrtC = (int) Math.sqrt(C); 
    
    for (int i = 1; i <= sqrtC; ++i) {
      if (C % i == 0) {
        if (checkConditionsABD(i)) {
          n = i;
          break;
        } else if (checkConditionsABD(C / i)) {
          n = C / i;
        }
      }
    }
    System.out.println(n);
    input.close();
  }

  static boolean checkConditionsABD(int i) {
    if ((i % A == 0) && (i % B != 0) && (D % i != 0)) {
      return true;
    }
    return false;
  }
}

