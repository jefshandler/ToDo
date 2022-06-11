package unitTests;

import devecalc.Calc;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.TestRunner.PriorityWeight.priority;

public class TestCalc {

    @Test(priority = 2)

    public void TestarSomarDoisNumeros() {
        // 1 prepara - conrigura - Given
        int num1 = 10;
        int num2 = 5;
        int resultadoEsperado = 15;

        // 2 executa - When
        int resultatoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3  validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n O resultado autal foi " + resultatoAtual);
        assertEquals(resultadoEsperado, resultatoAtual);
    }

    @Test(priority = 1)
    public void subtrairDoisNumeros() {
        // 1 prepara - conrigura - Given
        int num1 = 56;
        int num2 = 10;
        int resultadoEsperado = 46;

        // 2 executa - When
        int resultatoAtual = Calc.subtrairDoisNumeros(num1, num2);

        // 3  validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n O resultado autal foi " + resultatoAtual);
        assertEquals(resultadoEsperado, resultatoAtual);
    }

}