import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Calculadora;

public class CalculadoraTest {
    @Test
    public void testSomar() {
       Calculadora c = new Calculadora();

       int resultado = c.somar(4, 8);

         assertEquals(resultado, 12);
    }
    @Test
    public void testClassificacaoAluno() {
      Calculadora c = new Calculadora();
        String resultado = c.classificaoAluno(3.0);
        assertEquals(resultado, "Reprovado");
        resultado = c.classificaoAluno(6.0);
        assertEquals(resultado, "Recuperação");
        resultado = c.classificaoAluno(8.0);
        assertEquals(resultado, "Aprovado");
    }

    @Test
    public void testCalcularTriangulo() {
        Calculadora c = new Calculadora();
        double resultado = c.calcularTriangulo(4, 8);
        assertEquals(resultado, 16.0);
    }

    @Test
    public void testCalcularQuadrado() {
        Calculadora c = new Calculadora();
       assertEquals(c.calcularQuadrado(4), 16.0);
    }
    
}
