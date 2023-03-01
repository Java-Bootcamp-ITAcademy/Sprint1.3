/*** S1.3 Nivell 2 exercici 2 ***/
package n2exercici2;
import n2exercici1.Restaurant;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Restaurant> restaurants=new TreeSet<>();    //Tree set in to sort items

        restaurants.add(new RestaurantComparable("Hisop",10));
        restaurants.add(new RestaurantComparable("Lluerna",9));
        restaurants.add(new RestaurantComparable("Ferreruela",10));
        restaurants.add(new RestaurantComparable("Hisop",9));
        restaurants.add(new RestaurantComparable("Hisop",10));

        for(Restaurant restaurant:restaurants) {
            System.out.println("El restaurant "+restaurant.getNom()+" té una puntuació de "+restaurant.getPuntuacio());
        }
    }
}
