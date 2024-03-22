
package actividadaulica;


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
        
    }
    
}
