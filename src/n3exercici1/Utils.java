/*** S1.3 Nivell 3 exercici 1 ***/
package n3exercici1;

import java.io.IOException;
import java.util.*;

public class Utils {
    public static final String path="Llista.csv";
    private static Scanner sc = new Scanner(System.in);
    public static void menu() throws Exception {  //Sets up the menu and calls the different methods

        EditarCsv editarCsv = new EditarCsv(path);
        int opcio;
        boolean continuar=true;
        while(continuar) {
            System.out.println("Seleccioneu una opció:");
            System.out.println("1-Introduir persona");
            System.out.println("2-Mostrar les persones ordenades per nom (A-Z)");
            System.out.println("3-Mostrar les persones ordenades per nom (Z-A)");
            System.out.println("4-Mostrar les persones ordenades per cognom (A-Z)");
            System.out.println("5-Mostrar les persones ordenades per cognom (Z-A)");
            System.out.println("6-Mostrar les persones ordenades per DNI (1-9)");
            System.out.println("7-Mostrar les persones ordenades per DNI (9-1)");
            System.out.println("0-Sortir");
            opcio=Integer.parseInt(sc.nextLine());
            switch(opcio) {
                case 1: {
                    Persona persona=llegirPersona();
                    editarCsv.afegirPersonaACsv(persona);
                    break;
                }
                case 2: {
                    List<Persona> persones = editarCsv.csvAList();
                    Utils.ordenaList(Persona.personaComparatorNom(), persones);
                    EditarCsv.imprimeixCapçalera();
                    imprimirPersona(persones);
                    break;
                }
                case 3: {
                    List<Persona> persones = editarCsv.csvAList();
                    Utils.ordenaList(Persona.personaComparatorNom().reversed(), persones);
                    EditarCsv.imprimeixCapçalera();
                    imprimirPersona(persones);
                    break;
                }
                case 4: {
                    List<Persona> persones = editarCsv.csvAList();
                    Utils.ordenaList(Persona.personaComparatorCognom(), persones);
                    EditarCsv.imprimeixCapçalera();
                    imprimirPersona(persones);
                    break;
                }
                case 5: {
                    List<Persona> persones = editarCsv.csvAList();
                    Utils.ordenaList(Persona.personaComparatorCognom().reversed(), persones);
                    EditarCsv.imprimeixCapçalera();
                    imprimirPersona(persones);
                    break;
                }
                case 6: {
                    List<Persona> persones = editarCsv.csvAList();
                    Utils.ordenaList(Persona.personaComparatorDNI(), persones);
                    EditarCsv.imprimeixCapçalera();
                    imprimirPersona(persones);
                    break;
                }
                case 7: {
                    List<Persona> persones = editarCsv.csvAList();
                    Utils.ordenaList(Persona.personaComparatorDNI().reversed(), persones);
                    EditarCsv.imprimeixCapçalera();
                    imprimirPersona(persones);
                    break;
                }
                case 0: {
                    continuar=false;
                    sc.close();
                }
            }
        }
    }

    public static void ordenaList(Comparator<Persona> comparador, List<Persona> list) {  //Sorts a list given a comparator
        Collections.sort(list,comparador);
    }

    public static Persona llegirPersona() throws IOException {
        System.out.println("Introdueix nom:");
        String nom = sc.nextLine();
        System.out.println("Introdueix cognom:");
        String cognom = sc.nextLine();
        System.out.println("Introdueix DNI:");
        String DNI = sc.nextLine();
        Persona persona = new Persona(nom, cognom, DNI);
        return persona;
    }

    public static void imprimirPersona(List<Persona> persones) {
        for(Persona persona:persones) {
            System.out.println(persona);
        }
    }

}
