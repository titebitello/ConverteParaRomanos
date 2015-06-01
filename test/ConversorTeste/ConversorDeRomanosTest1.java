package ConversorTeste;

import static org.junit.Assert.*;
import org.junit.Test;
import convertepararomanos.*;

public class ConversorDeRomanosTest1 {

    @Test
    public void converterOSimboloI() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos1 conversor = new ConversorDeRomanos1();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebemdo como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

}
