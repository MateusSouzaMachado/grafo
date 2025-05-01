import org.junit.jupiter.api.Test;

import com.example.Validador;

public class ValidadorTest {
    
    @Test
    public void testValidator(){
        Validador v = new Validador();
        Boolean resultado = v.validaCPF("78755548841");
        System.out.println(resultado);
    }

    @Test
    public void testValidator2(){
    Validador v = new Validador();
    Boolean resultado = v.validaCPF("12345678910");
    System.out.println(resultado);
    }

    @Test
    public void testValidator3(){
    Validador v = new Validador();
    Boolean resultado = v.validaCPF("30278593070");
    System.out.println(resultado);
    }
    
}
