/*** S1.3 Nivell 2 exercici 1 ***/

package n2exercici1;

import n1exercici1.Month;

public class Restaurant {
    private String nom;    //Declaring attributes
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {    //Constructor
        this.nom=nom;
        this.puntuacio=puntuacio;
    }

    public String getNom() {    //Getters and setters
        return nom;
    }    //Getters and setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public int hashCode() {     //Overriding hashcode
        return nom.hashCode()+puntuacio;
    }

    @Override
    public boolean equals(Object obj) {    //Overriding equals
        if(this==obj) {
            return true;
        }
        if(!(obj instanceof Restaurant)) {
            return false;
        }
        Restaurant restaurant=(Restaurant) obj;
        return this.getNom().equals(restaurant.getNom()) && this.getPuntuacio()==restaurant.getPuntuacio();
    }

}
