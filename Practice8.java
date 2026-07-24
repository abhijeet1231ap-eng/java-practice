import java.util.*;
public class Practice8 {

    public static void main(String[] args){

        PriorityQueue <Student> pq = new PriorityQueue<> (new StudentComparator());

        pq.add(new Student("rahul", 20));
        pq.add(new Student("aman", 20));
        pq.add(new Student("mohit", 40));
        pq.add(new Student("ajay", 100));
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
    
}



class Student{
String name;
int marks;
Student (String name, int marks){
    this.name = name;
    this.marks = marks;
}
@Override
public String toString(){
    return name + ": "+ marks;
}
}


class StudentComparator implements Comparator<Student>{
    public int compare( Student s1, Student s2){
        if(s1.marks != s2.marks){
            return Integer.compare(s2.marks, s1.marks);
        }
            return s1.name.compareTo(s2.name);
    }
}