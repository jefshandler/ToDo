package unitTests;

import devecalc.Calc;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {

    @Test

    public void TestarSomarDoisNumeros() {
        // 1 prepara - conrigura - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        // 2 executa - When
        int resultatoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3  validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n O resultado autal foi " + resultatoAtual);
        assertEquals(resultadoEsperado, resultatoAtual);
    }

}