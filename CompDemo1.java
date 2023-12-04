

import java.util.*;


class Student implements Comparable<Student>{
int num;
String name;
int pack;

Student(int n, String na, int p){
num=n;
name=na;
pack=p;
}

public int compareTo(Student s){
if(pack== s.pack)
   return 0;
else if(pack>s.pack)
      return 1;
  else 
      return -1;
  }
}

class CompDemo1{
public static void main(String[] args){

Student s1=new Student(100, "Raj", 30);
Student s2=new Student(101, "Manoj", 25);
Student s3=new Student(102, "Radha", 29);
Student s4=new Student(104, "Sasi",30);

ArrayList<Student> al= new ArrayList<Student>();

al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);

System.out.println(s1.compareTo(s4));
System.out.println(s4.compareTo(s3));
System.out.println(s2.compareTo(s3));

Student s;
Iterator itr=al.iterator();
while(itr.hasNext()){
s=(Student) itr.next();
System.out.println(s.num +" "+s.name+" "+s.pack);
   }
 }
}