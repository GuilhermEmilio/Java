package APRE;

import java.util.*;

public class DizimaFracao  {

    public static void main (String[] args) {
        
         // Criando um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner (System.in);
        
        // Solicitando ao usuário que digite o numerador
        System.out.println("Digite o numerador: ");
        
        // Lendo o valor do denominador digitado pelo usuário
        int numerator = sc.nextInt();
        
        // Solicitando ao usuário que digite o denominador
        System.out.println("Digite o denominador: ");
        
        // Lendo o valor do denominador digitado pelo usuário
        int denominator = sc.nextInt();
        
        // Verificando se o denominador é igual a zero
        if (denominator == 0) {
            System.out.println("Não é possível dividir por zero");
        }
        
        // Caso contrário, calcule a fração e a armazene em uma variável de ponto flutuante
        else {
            double fraction = (double)numerator / denominator;
            
            // Imprima a fração resultante
            System.out.println(fraction);
            
            // Fechando o objeto Scanner para liberar os recursos do sistema
        sc.close();
        }
    }
}