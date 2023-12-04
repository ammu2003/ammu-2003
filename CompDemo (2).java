//Look at the above program for both interfaces and their methods


import java.util.*; 

class Student implements Comparable<Student>,Comparator{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Student st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  

public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  


}  
 
 
public class CompDemo{  
public static void main(String args[]){  
ArrayList<Student> al=new ArrayList<Student>();  
Student s1=new Student(101,"Vijay",22);
Student s2=new Student(105,"Ajay",23);
Student s3=new Student(106,"ram",24);
al.add(s1);  
al.add(s2);  
al.add(s3); 
 
 System.out.println(s1.compareTo(s1));
 System.out.println(s2.compareTo(s1));
 System.out.println(s2.compareTo(s3));
//Collections.sort(al);  
for(Student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
} 

 al.set(0,s3);
 al.set(1,s2);
 al.set(2,s1);
 System.out.println(s1.compare(s1,s1));
 System.out.println(s1.compare(s2,s1));
 System.out.println(s1.compare(s2,s3));
 
Student sz;
Iterator itr=al.iterator();
while(itr.hasNext()){
sz=(Student)itr.next();
System.out.println(sz.rollno+" "+sz.name+" "+sz.age);
}
}  
}  

