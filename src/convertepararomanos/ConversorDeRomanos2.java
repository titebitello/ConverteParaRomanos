package convertepararomanos;

public class ConversorDeRomanos2 {

    public int converte(String numeroRomano) {
        if (numeroRomano.equals("I")) {
            return 1;
        } else if (numeroRomano.equals("V")) {
            return 5;
        }
        return 0;
    }
}