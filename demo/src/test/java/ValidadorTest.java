import org.junit.jupiter.api.Test;

import com.example.Validador;

public class ValidadorTest {
    
    @Test
    public void testValidator1(){
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

    @Test
    public void testValidator4(){
    Validador v = new Validador();
    Boolean resultado = v.validaCPF("302785930701");
    System.out.println(resultado);
    }

    @Test
    public void testValidator5(){
    Validador v = new Validador();
    Boolean resultado = v.validaCPF("");
    System.out.println(resultado);
    }

    @Test
    public void testValidator6(){
    Validador v = new Validador();
    Boolean resultado = v.validaCPF("11111111111");
    System.out.println(resultado);
    resultado = v.validaCPF("22222222222");
    System.out.println(resultado);
    resultado = v.validaCPF("33333333333");
    System.out.println(resultado);
    resultado = v.validaCPF("44444444444");
    System.out.println(resultado);
    resultado = v.validaCPF("55555555555");
    System.out.println(resultado);
    resultado = v.validaCPF("66666666666");
    System.out.println(resultado);
    resultado = v.validaCPF("77777777777");
    System.out.println(resultado);
    resultado = v.validaCPF("88888888888");
    System.out.println(resultado);
    resultado = v.validaCPF("99999999999");
    System.out.println(resultado);
    }




    
}
