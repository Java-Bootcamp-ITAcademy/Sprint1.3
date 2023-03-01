/*** S1.3 Nivell 3 exercici 1 ***/
package n3exercici1;

import java.util.Comparator;

public class Persona {
    private String nom;
    private String cognom;
    private String DNI;

    /* Constructor*/
    public Persona(String nom, String cognom, String DNI) {
        setNom(nom);
        setCognom(cognom);
        setDNI(DNI);
    }

    /* Getters and setters */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /* Overriding methods */
    @Override
    public String toString() {
        return getNom()+"      "+getCognom()+"       "+getDNI();
    }

    /* Implementing comprators */
    public static Comparator<Persona> personaComparatorNom() {  //This method returns a comparator based on nom
        return new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNom().compareTo(p2.getNom());
            }
        };
    }

    public static Comparator<Persona> personaComparatorCognom() { //This method returns a comparator based on cognom
        return new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getCognom().compareTo(p2.getCognom());
            }
        };
    }

    public static Comparator<Persona> personaComparatorDNI() {  //This method returns a comparator based on DNI
        return new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getDNI().compareTo(p2.getDNI());
            }
        };
    }


}
