/*** S1.3 Nivell 2 exercici 2 ***/
package n2exercici2;
import n2exercici1.Restaurant;
public class RestaurantComparable extends Restaurant implements Comparable {    //Extending Restaurant and implementing Comparable

    public RestaurantComparable(String nom, int puntuacio) {
        super(nom, puntuacio);
    }

    /* Overriding compareTo */
    @Override
    public int compareTo(Object o) {
        RestaurantComparable restaurant=(RestaurantComparable) o;
        if(this.getNom().compareTo(restaurant.getNom())<0) {
            return -1;
        }
        else if(this.getNom().compareTo(restaurant.getNom())>0) {
            return 1;
        }
        else {
            if(this.getPuntuacio()>restaurant.getPuntuacio()) {
                return -1;
            }
            else if(this.getPuntuacio()<restaurant.getPuntuacio()) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
