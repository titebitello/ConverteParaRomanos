package ConversorTeste;

import convertepararomanos.ConversorDeRomanos4;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeRomanosTest4 {

    @Test
    public void converterOSimboloI() {
       ConversorDeRomanos4 conversor = new ConversorDeRomanos4();
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       ConversorDeRomanos4 conversor = new ConversorDeRomanos4();
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       ConversorDeRomanos4 conversor = new ConversorDeRomanos4();
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloII() {
       ConversorDeRomanos4 conversor = new ConversorDeRomanos4();
       int resultadoObtido = conversor.converte("II");
       
       assertEquals(2, resultadoObtido);
    }
}