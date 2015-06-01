package ConversorTeste;

import convertepararomanos.ConversorDeRomanos7;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeRomanosTest7 {

    @Test
    public void converterOSimboloI() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloII() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("II");
       
       assertEquals(2, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloVI() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("VI");
       
       assertEquals(6, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloIX() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("IX");
       
       assertEquals(9, resultadoObtido);
    }

    @Test
    public void converterOSimboloXXIV() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("XXIV");
       
       assertEquals(24, resultadoObtido);
    }
}