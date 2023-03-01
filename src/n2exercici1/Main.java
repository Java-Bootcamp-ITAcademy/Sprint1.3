/*** S1.3 Nivell 2 exercici 1 ***/
package n2exercici1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Restaurant> restaurants=new HashSet<>();

        restaurants.add(new Restaurant("Hisop",10));
        restaurants.add(new Restaurant("Lluerna",9));
        restaurants.add(new Restaurant("Ferreruela",10));
        restaurants.add(new Restaurant("Hisop",9));
        restaurants.add(new Restaurant("Hisop",10));

        for(Restaurant restaurant:restaurants) {
            System.out.println("El restaurant "+restaurant.getNom()+" té una puntuació de "+restaurant.getPuntuacio());
        }
    }
}
