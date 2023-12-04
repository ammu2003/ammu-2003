import java.util.*;
class Student implements Comparator<Student>{
int num;
String name;
int pack;

Student(int n, String na, int p){
num=n;
name=na;
pack=p;
}

public int compare(Student st1, Student st2){
if(st1.pack== st2.pack)
   return 0;
else if(st1.pack>st2.pack)
      return 1;
  else 
      return -1;
  }
}

class CompDemo2{
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

System.out.println(s1.compare(s1,s4));
System.out.println(s1.compare(s1,s3));
System.out.println(s1.compare(s2,s4));

Student s;
Iterator itr=al.iterator();
while(itr.hasNext()){
s=(Student) itr.next();
System.out.println(s.num +" "+s.name+" "+s.pack);
}

for( Student ss: al){
System.out.println(ss.num +" "+ss.name+" "+ss.pack);
   }
 }
}