import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.example.Pratica;

public class PraticaTest {
    @Test
    public void caso1(){
        assertEquals(Pratica.calcularAumento(400), 60 );
        assertEquals(Pratica.calcularAumento(1800), 216 );
        assertEquals(Pratica.calcularAumento(4000), 280);
    }

    @Test
    public void caso2(){
        assertFalse(Pratica.verificarPrimo(1));
        assertFalse(Pratica.verificarPrimo(15));
        assertTrue(Pratica.verificarPrimo(13));
    }

    @Test
    public void caso3(){
        assertEquals(Pratica.calcularMDC(2, 2), 2);
    }

    @Test
    public void caso4(){
        assertEquals(Pratica.classificarAluno(4), "Reprovado");
        assertEquals(Pratica.classificarAluno(6), "Recuperação");
        assertEquals(Pratica.classificarAluno(8), "Aprovado");
    }

    @Test
    public void caso5(){
        Pratica p = new Pratica();
        assertTrue(p.calculaMediaFinal(7, 8, 6));
        assertFalse(p.calculaMediaFinal(4, 5, 2));
        assertTrue(p.calculaMediaFinal(4, 5, 10));
    }

    @Test
    public void caso6(){
        assertEquals(Pratica.calcularSoma(2), 3);
    }
    
    @Test
    public void caso7(){
        assertEquals(Pratica.calcularFatorial(5), 120);
    }

    @Test
    public void caso8(){
        assertEquals(Pratica.calcularDesconto(20), 0);
        assertEquals(Pratica.calcularDesconto(50), 2.50);
        assertEquals(Pratica.calcularDesconto(100), 10);
    }

    @Test
    public void caso9(){
        assertEquals(Pratica.calcularDesconto2(1), 0);
        assertEquals(Pratica.calcularDesconto2(10), 1);
        assertEquals(Pratica.calcularDesconto2(20), 2);
        assertEquals(Pratica.calcularDesconto2(30), 4);
        assertEquals(Pratica.calcularDesconto2(40), 5);
        assertEquals(Pratica.calcularDesconto2(50), 6);
        assertEquals(Pratica.calcularDesconto2(60), 8);
        assertEquals(Pratica.calcularDesconto2(70), 9);
        assertEquals(Pratica.calcularDesconto2(80), 9);
        assertEquals(Pratica.calcularDesconto2(90), 4.5);
        assertEquals(Pratica.calcularDesconto2(100), 10);
    }

    @Test
    public void casoDate(){
        assertNull(Pratica.validarData("2023-14-01 20:00:00"));
        assertNull(Pratica.validarData("2023-01-32 20:00:00"));
        assertNull(Pratica.validarData("2023-01-01 25:00:00"));
        assertNull(Pratica.validarData("2023-01-01 20:60:00"));
        assertNull(Pratica.validarData("2023-01-01 20:00:60"));
        assertNull(Pratica.validarData("2023-01-01 20:00:00.000"));
        assertNotNull(Pratica.validarData("2054-01-01 20:00:00"));
        assertNull(Pratica.validarData("02-05-1524 20:00:00"));
        assertNotNull(Pratica.validarData("2023-01-01 20:00:00"));
        assertEquals(Pratica.validarData("2023-01-01 20:00:00"),LocalDateTime.of(2023, 1, 1, 20, 0, 0));
    }

   

}
