import java.util.*;  
class TestJavaCollection2
{  
public static void main(String args[])
{  
LinkedList<String> list=new LinkedList<String>();//Creating Linkedlist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Srikanth");  
list.add("Chandu");  


//Traversing list through Iterator 
 
Iterator itr=list.iterator(); 
 
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  
