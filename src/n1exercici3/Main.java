/*** S1.3 Nivell 1 exercici 3 ***/
package n1exercici3;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        var puntuació = 0;
        String nom = null;
        var jugar=true;
        Map<String, String> map = new HashMap<>();    //Declaring variables
        Map<String, Integer> puntuacions = new HashMap<>();
        System.out.println(System.getProperty("user.dir"));

        try {
            File file = new File("countries.txt.txt");   //Reading file
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {    //Splitting file and mapping
                String line = sc.nextLine();
                String[] key_value = line.split(" ");
                String key = key_value[0];
                String value = key_value[1];
                map.put(key, value);
            }
            sc.close();
            Scanner sc1 = new Scanner(System.in);
            List<String> list = new ArrayList<>(map.keySet());    //Putting keys in a list

            do {
                System.out.println("Quin nom tens?");
                nom = sc1.next();
                for (int i = 0; i < 10; i++) {
                    int random = (int) (Math.random() * 100) % list.size();    //Getting random access to key list
                    var endevinar = list.get(random);
                    System.out.println("Introdueix el nom de la capital de " + endevinar);
                    var capital = sc1.next();
                    if (map.get(endevinar).equals(capital)) {    //Capital is matched
                        puntuació++;
                    }
                }
                puntuacions.put(nom, puntuació);    //Mapping player's name - score
                puntuació=0;
                System.out.println("Vols seguir jugant? S/N");
                if(sc1.next().equals("N")) {    //None player wants to play
                    jugar=false;
                }
            } while(jugar);
            sc1.close();
            System.out.println(puntuacions.toString());    //Printing map: name-score
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
