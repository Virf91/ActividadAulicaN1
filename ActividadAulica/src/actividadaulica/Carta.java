
package actividadaulica;

public class Carta {
    private int num;
    private String palo;

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Carta() {
    }
    
    @Override
    public String toString() {
        return "Carta{" +  num + " de " + palo + '}';
    }
    
    
}
