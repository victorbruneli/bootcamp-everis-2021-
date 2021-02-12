
package treinee;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class TreinoEx {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
             
/*4. Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/
           

            sc.close();
        }
}
/* COisas Basicas

1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.

  System.out.println("Digite a primeira media - 8");
            float media1 = sc.nextFloat();
            
            System.out.println("Digite a segunda media - 9");
            float media2 = sc.nextFloat();
            
            System.out.println("Digite a terceira media - 7");
            float media3 = sc.nextFloat();
             
            float nm1 = 4;
            float nm2 = 5;
            float nm3 = 6;
            
            float soma1 = (media1+media2+media3)/3;
            System.out.println("Media dos 3 primeiros = " + soma1);
            float soma2 = (nm1+nm2+nm3)/3;
            System.out.println("MEdia dos 3 ultimos = " + soma2);
            
            float somaFinal = (soma1+soma2)/2;
            
            System.out.println("A soma de todos os numeros = " + somaFinal + " Media das Medias  ");


3. Informar um saldo e imprimir o saldo com reajuste de 1%.

 System.out.println("Informe o saldo : ");
        float saldo = sc.nextFloat();
        
        System.out.println("Informa o valor reajuste : ");
        float reajuste = sc.nextFloat();
        
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(2.00023); 
         System.out.println(formatted);
            
        float soma = (float) (saldo * reajuste)-saldo;
        
            System.out.println("VALor saldo >>>>>>" +soma );
            sc.close();


4. Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)

6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
*/