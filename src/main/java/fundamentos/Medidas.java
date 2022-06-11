// 1 pacote
package fundamentos;
// 2 blibliotecas


import java.util.Scanner;

// 3 classes
public class Medidas {
    // 3.1 Atributos
    static Scanner entrada;

    // 3.2 Metodos e funç?es

    public static void main(String[] args) {
        String opcao;
        int area = 0;
        entrada = new Scanner(System.in); //instaniar objeto de uma leitura do console

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - area do Quadrado");
        System.out.println("(2) - area do Retangulo");
        System.out.println("(3) - area do Triangulo");
        System.out.println("(4) - area do Circulo");

        opcao = entrada.nextLine(); //leitura da opç?o
        switch (opcao){
            case "1":
             area =    calcularAreaDoQuadrado();
                break;
            case "2":
                //ToDo Calcular retangulo
                break;
            case "3":
                //ToDo Calcular triangulo
                break;
            case "4":
                //ToDo calcular circulo
                break;
            case "5":
               //ToDo calcular o calculado
                break;
            default:
                System.out.println("Opcao Invalida: " + opcao);
        }
        if (area >0){
        System.out.println(" A area é de ..:" + area + "m?");
    }
    }
    public static int calcularAreaDoQuadrado() {
        int lado;
         // criando o objeto para ler uma entrada no console
        System.out.println("Digite o tamanho di Lado..: ");
        lado = entrada.nextInt();// leirura do tamanho do lado
        return lado * lado; //retorna area ao quadrado


    }
}
