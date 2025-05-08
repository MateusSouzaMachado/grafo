import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}
