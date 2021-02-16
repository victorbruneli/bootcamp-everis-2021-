
package treinee;



public class ForIf {
    public static void main(String[] args) {
        
// Criando programa de 1000 interações, fale quais ao impar e quais sao par;

        int n = 0;
        for (n = 0; n <= 1000; ++n){
        int total   =   n/2;
        
        if (n % 2 == 0){
            System.out.println("par = "+n);
        }else{
            System.out.println("impar = "+n);
        }   
    }
}
}