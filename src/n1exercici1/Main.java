/*** S1.3 Nivell 1 exercici 1 ***/
package n1exercici1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Month> list = new ArrayList<>();    //Adding elements to list
        list.add(new Month("Gener"));
        list.add(new Month("Febrer"));
        list.add(new Month("Març"));
        list.add(new Month("Abril"));
        list.add(new Month("Maig"));
        list.add(new Month("Juny"));
        list.add(new Month("Juliol"));
        list.add(new Month("Setembre"));
        list.add(new Month("Octubre"));
        list.add(new Month("Novembre"));
        list.add(new Month("Desembre"));

        list.add(7,new Month("Agost"));    //Adding element in a given position
        Set<Month> set=new HashSet<>(list);    //Copying list into set
        list.add(new Month("Desembre"));    //Adding duplicated elements
        set.add(new Month("Desembre"));
        set.add(new Month("Desembre"));

        for(Month mes:list) {    //Printing list
            System.out.println(mes.getName());
        }
        System.out.println("");

        for(Month mes:set) {    //Iterating through set with for. Should exclude duplicated elements
            System.out.println(mes.getName());
        }
        System.out.println("");


        Iterator<Month> i= set.iterator();
        while(i.hasNext()) {    //Iterating through set with iterator. Should exclude duplicated elements
            System.out.println(i.next().getName());
        }
    }
}