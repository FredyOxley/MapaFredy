
/**
 *
 * @author fredy
 */
public class Principal {
    public static void main(String[] args) {

        ExameGlicemia eg = new ExameGlicemia();
        eg.cadastrarExame();
        eg.mostrarResultado();

        ExameTriglicerideos et = new ExameTriglicerideos();
        et.cadastrarExame();
        et.mostrarResultado();

        ExameColesterol ec = new ExameColesterol();
        ec.cadastrarExame();
        ec.mostrarResultado();

    }
}
