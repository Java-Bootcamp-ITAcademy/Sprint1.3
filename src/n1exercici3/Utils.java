package n1exercici3;

import java.io.*;
import java.util.*;

public class Utils {
    public static final String countries="countries.txt";
    public static final String puntuacio="puntuacio.txt";
    public static final String properties="user.dir";
    private static  Map<String, Integer> puntuacions = new HashMap<>();

    public static Map<String,String> fileAMap(String path) throws FileNotFoundException {
        File file=new File(path);
        Scanner sc = new Scanner(file);
        Map<String, String> map = new HashMap<>();
        while (sc.hasNextLine()) {    //Splitting file and mapping
            String line = sc.nextLine();
            String[] key_value = line.split(" ");
            String key = key_value[0];
            String value = key_value[1];
            map.put(key, value);
        }
        sc.close();
        return map;
    }

    public static void jugar() throws FileNotFoundException {
        boolean jugar=true;
        int puntuacio=0;
        Map<String, String> map = fileAMap(countries);
        Scanner sc1 = new Scanner(System.in);
        List<String> list = new ArrayList<>(map.keySet());    //Putting keys in a list
        do {
            System.out.println("Quin nom tens?");
            String nom = sc1.next();
            for (int i = 0; i < 10; i++) {
                int random = (int) (Math.random() * 100) % list.size();    //Getting random access to key list
                var endevinar = list.get(random);
                System.out.println("Introdueix el nom de la capital de " + endevinar);
                var capital = sc1.next();
                if (map.get(endevinar).equals(capital)) {    //Capital is matched
                    puntuacio++;
                }
            }
            puntuacions.put(nom, puntuacio);    //Mapping player's name - score
            puntuacio=0;
            System.out.println("Vols seguir jugant? S/N");
            if(sc1.next().equals("N")) {    //None player wants to play
                jugar=false;
            }
        } while(jugar);
        sc1.close();
    }

    public static void resultatsAArxiu() {
        File fileOutput = new File(puntuacio);
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(fileOutput));

        for (Map.Entry<String, Integer> jugador :
                puntuacions.entrySet()) {
            bf.write(jugador.getKey()+": "+jugador.getValue());
            bf.newLine();
        }
        bf.close();
        System.out.println(puntuacions.toString());    //Printing map: name-score
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
    }
}
