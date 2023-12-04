import java.util.*;
class TreeSetExample 
{      public static void main(String[] args)
    {
        Set<String> ts = new TreeSet<String>();
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

          // Adding the duplicate element
        ts.add("India");

          // Displaying the TreeSet
        System.out.println(ts);

          // Removing items from TreeSet 
        ts.remove("Australia");
        System.out.println("Set after removing "+ "Australia:" + ts);

          // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
