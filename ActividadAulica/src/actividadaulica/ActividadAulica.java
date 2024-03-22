
package actividadaulica;

import java.util.ArrayList;


public class ActividadAulica {

    public static void main(String[] args) {
        // TODO code application logic here
        Baraja baraja1 = new Baraja();
        
        baraja1.barajar();
        baraja1.mostrarBaraja();
        
        //Crea un carta y pide la carta a baraja para mostrarla
        Carta cartaEnMano = new Carta();
        cartaEnMano = baraja1.siguienteCarta();
        System.out.println("La carta en mano es: "+cartaEnMano.toString());
        
        //Muestra las cartas que quedan disponible en la baraja
        System.out.println("Cartas disponible: "+baraja1.cartasDisponibles());
        
        //Crea un carta y pide la carta a baraja para mostrarla
        ArrayList<Carta> cartasEnMano = new ArrayList();
        cartasEnMano = baraja1.darCartas(5);
        if(cartasEnMano.size()!=0){
            System.out.println("Las cartas recibidas son: ");
            for(Carta aux:cartasEnMano){
                System.out.println(aux.toString());
            }
        }
        System.out.println("Cartas disponible: "+baraja1.cartasDisponibles());
    }
    
}
