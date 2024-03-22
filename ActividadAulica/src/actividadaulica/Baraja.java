
package actividadaulica;

import java.util.ArrayList;

public class Baraja {
   
    private ArrayList<Carta> cartas;

    public Baraja() {
      
      String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                    
                }
            }
        }
    
    
    }
}
    
    

