package ConversorTeste;

import convertepararomanos.ConversorDeRomanos6;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeRomanosTest6 {

    @Test
    public void converterOSimboloI() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloII() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("II");
       
       assertEquals(2, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloIV() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("IV");
       
       assertEquals(6, resultadoObtido);
    }
}