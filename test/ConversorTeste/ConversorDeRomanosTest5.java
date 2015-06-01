package ConversorTeste;

import convertepararomanos.ConversorDeRomanos5;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeRomanosTest5 {

    @Test
    public void converterOSimboloI() {
       ConversorDeRomanos5 conversor = new ConversorDeRomanos5();
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       ConversorDeRomanos5 conversor = new ConversorDeRomanos5();
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       ConversorDeRomanos5 conversor = new ConversorDeRomanos5();
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloII() {
       ConversorDeRomanos5 conversor = new ConversorDeRomanos5();
       int resultadoObtido = conversor.converte("II");
       
       assertEquals(2, resultadoObtido);
    }
}