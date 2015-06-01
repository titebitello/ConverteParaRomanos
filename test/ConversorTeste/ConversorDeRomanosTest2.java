package ConversorTeste;

import static org.junit.Assert.*;
import org.junit.Test;
import convertepararomanos.*;

public class ConversorDeRomanosTest2 {

    @Test
    public void converterOSimboloI() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos2 conversor = new ConversorDeRomanos2();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebendo como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos2 conversor = new ConversorDeRomanos2();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebemdo como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
}