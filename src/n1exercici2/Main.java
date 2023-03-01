/*** S1.3 Nivell 1 exercici 2 ***/
package n1exercici2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1=new ArrayList<>();    //Declaring array lists
        List<Integer> list2=new ArrayList<>();
        System.out.println("Introdueix 10 nombres enters");

        for(var j=0;j<10;j++) {    //Filling list 1
            list1.add(sc.nextInt());
        }
        sc.close();
        ListIterator<Integer> i= list1.listIterator();    //Instantiating iterator

        while (i.hasNext()) {    //Moving forward through list 1
            i.next();
        }
        while(i.hasPrevious()) {    //Moving backwards list 1 - Filling list 2
            list2.add((Integer)i.previous());
        }

        System.out.println(list1.toString());    //Printing lists
        System.out.println(list2.toString());
    }
}
