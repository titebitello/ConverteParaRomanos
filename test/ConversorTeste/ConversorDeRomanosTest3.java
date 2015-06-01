package ConversorTeste;

import convertepararomanos.ConversorDeRomanos3;
import static org.junit.Assert.*;

import org.junit.Test;


public class ConversorDeRomanosTest3 {

    @Test
    public void converterOSimboloI() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos3 conversor = new ConversorDeRomanos3();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebemdo como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    
    @Test
    public void converterOSimboloV() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos3 conversor = new ConversorDeRomanos3();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebemdo como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos3 conversor = new ConversorDeRomanos3();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebemdo como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
}