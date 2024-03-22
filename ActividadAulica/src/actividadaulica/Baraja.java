
package actividadaulica;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
   
    private ArrayList<Carta> cartas;

    public Baraja() {
       cartas = new ArrayList();
       
       String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    public void mostrarBaraja(){
        if(cartas.size()==0){
            System.out.println("La baraja está vacía.");
        }else{
            System.out.println("La baraja es:");
            for(Carta aux:cartas){
                System.out.println(aux.toString());
            }
        }
    }
    
    public Carta siguienteCarta(){
        Carta cartaARepartir = new Carta(); 
        if(cartas.size()==0){
            System.out.println("La baraja está vacía.");
            return null;
        }else{
            cartaARepartir=cartas.get(0);
            cartas.remove(0);
            return cartaARepartir;
        }
        
    }
}
    
    

