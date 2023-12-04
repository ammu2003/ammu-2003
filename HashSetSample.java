import java.util.*;
  class HashSetSample 
{
      public static void main(String[] args)
    {
           Set<String> h = new HashSet<String>();
           h.add("India");
       	 h.add("Australia");
       	 h.add("South Africa");

   	 	// Adding the duplicate element
     	   h.add("India");

       	 // Displaying the HashSet
      	  System.out.println(h);

            h.remove("Australia");

             System.out.println("Set after removing " + "Australia:" + h);

                System.out.println("Iterating over set:");
                Iterator<String> i = h.iterator();
                 while (i.hasNext()) 
				System.out.println(i.next());
   	 }
}
