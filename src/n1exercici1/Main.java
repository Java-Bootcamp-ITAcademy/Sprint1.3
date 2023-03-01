/*** S1.3 Nivell 1 exercici 1 ***/
package n1exercici1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Month> list = new ArrayList<>();    //Adding elements to list
        list.add(new Month(Mes.GENER));
        list.add(new Month(Mes.FEBRER));
        list.add(new Month(Mes.MARÇ));
        list.add(new Month(Mes.ABRIL));
        list.add(new Month(Mes.MAIG));
        list.add(new Month(Mes.JUNY));
        list.add(new Month(Mes.JULIOL));
        list.add(new Month(Mes.SETEMBRE));
        list.add(new Month(Mes.OCTUBRE));
        list.add(new Month(Mes.NOVEMBRE));
        list.add(new Month(Mes.DESEMBRE));

        list.add(7,new Month(Mes.AGOST));    //Adding element in a given position
        Set<Month> set=new HashSet<>(list);    //Copying list into set
        list.add(new Month(Mes.DESEMBRE));    //Adding duplicated elements
        set.add(new Month(Mes.DESEMBRE));
        set.add(new Month(Mes.DESEMBRE));

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