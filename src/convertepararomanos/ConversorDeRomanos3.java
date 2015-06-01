package convertepararomanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeRomanos3 {

    @SuppressWarnings("serial")
    private static Map<String, Integer> tabela = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public int converte(String numeroRomano) {
        return tabela.get(numeroRomano);
    }
}
