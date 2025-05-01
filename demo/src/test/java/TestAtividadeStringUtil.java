import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.AtividadeStringUtil;

public class TestAtividadeStringUtil {

    @Test
    public void testInverterString() {
        AtividadeStringUtil util = new AtividadeStringUtil();
        assertEquals(util.inverterString("null"), "llun");
    }

    @Test
    public void testContarVogais() {
    AtividadeStringUtil util = new AtividadeStringUtil();
       assertEquals(util.contarVogais("papibaquigrafo"), 7);
       assertEquals(util.contarVogais("ovo"), 2);
    }

    @Test
    public void testPalindromo(){
        AtividadeStringUtil util = new AtividadeStringUtil();
        assertEquals(util.isPalindromo("arara"), true);
        
    }

}
