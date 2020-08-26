package generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Don't mix Generic and Raw types
public class RawTest1 {
    public static void main(String[] args) {
        List list = new LinkedList(); //Raw List
        list.add("First");
        list.add("Second");
        List<String> strList = list; //Generic List
        //strList.add(10); // Compiler time exception
        for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();) {
            System.out.println("Item: " + itemItr.next());
        }

        System.out.println();

        List<String> strList2 = new LinkedList<>(); //Generic List
        strList2.add("First");
        strList2.add("Second");
        List list2 = strList2; //Raw List
        //list2.add(10); // Runtime exception
        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();) {
            System.out.println("Item: " + itemItr.next());
        }
    }
}
