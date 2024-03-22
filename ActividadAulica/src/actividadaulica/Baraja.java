
package actividadaulica;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
   
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasDadas;

    public Baraja() {
       cartas = new ArrayList();
       cartasDadas = new ArrayList();
       
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
            cartasDadas.add(cartaARepartir);
            cartas.remove(0);
            return cartaARepartir;
        }
    }
    
    public ArrayList<Carta> darCartas(int cant){
        ArrayList<Carta> cartasARepartir = new ArrayList(); 
        if(cartas.size()<cant){
            System.out.println("No hay cartas suficientes");
            return null;
        }else{
            for(int i=0; i<cant;i++){
                cartasARepartir.add(siguienteCarta());
            }
            return cartasARepartir;
        }
    }
    
    public int cartasDisponibles(){
        return cartas.size();
    }
    
    public ArrayList<Carta> cartasMonton(){
        if(cartasDadas.size()==0){
            System.out.println("No se han dado cartas.");
            return null;
        }else{
            return cartasDadas;
        }
    }
    
}
    
    

