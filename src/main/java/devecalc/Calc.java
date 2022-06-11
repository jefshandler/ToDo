// partes da classe
// 1 pacotes
package devecalc;
// 2 bibliotecas

import java.util.Scanner;

// 3 classe
public class Calc {
    // 3.1 atributos pertencente a classe
    static Scanner entrada = new Scanner(System.in); // entrada = input


    // 3.2 Metodos e funções => o que a classe faz e da um retorno é função
    public static void main(String[] args){
        System.out.println("Passando pelo metodo Main");
        System.out.println("(1) SOMAR <<<");
        System.out.println("(2) SUBTRAIR <<<");
        System.out.println("(3) MULTIPLICAR <<<");
        System.out.println("(4) DIVIDIR <<<");
        System.out.println(">>> Escolha o calculo Desejado <<<");
        //variaveis
        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;

        if (opcao >=1 && opcao <= 4) {
            System.out.print("Entre com o 1º numero: ");
            num1 = entrada.nextInt();
            System.out.print("Entre com o 2º numero: ");
            num2 = entrada.nextInt();
            System.out.print("O resultado é ..: ");

        }
        switch(opcao){
            case 1:
                System.out.print(somarDoisNumeros(num1, num2));
                break;
            case 2:
                System.out.print(subtrairDoisNumeros(num1, num2));
                break;
            case 3:
                System.out.print(multiplicarDoisNumeros(num1, num2));
                break;
            case 5:
                System.out.print(dividirDoisNumeros(num1, num2));
                break;

            default:
                System.out.println("Opção invalida");
        }


    }

    public static int somarDoisNumeros(int num1, int num2){

//        System.out.println("Passou pelo metodo SomarDoisNumeros");
        return num1 + num2;
    }

    public static int subtrairDoisNumeros(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplicarDoisNumeros(int num1, int num2) {
        return num1 * num2;
    }
    public static int dividirDoisNumeros(int num1, int num2) {
        return num1 - num2;
    }
}
