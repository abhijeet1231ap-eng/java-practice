import java.util.*;
public class Practice7 {
    public static void main(String [] args){

       PriorityQueue <Integer> pq = new PriorityQueue<>();


        //min heap
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);


        //max heap
        PriorityQueue <Integer> rq = new PriorityQueue<>(Collections.reverseOrder());


        rq.add(30);
        rq.add(10);
        rq.add(50);
        rq.add(20);
        rq.add(40);


        while(!rq.isEmpty()){
            System.out.println(rq.poll());
        }

        PriorityQueue <Student> sq = new PriorityQueue<>(new StudentComparator());
        sq.add(new Student("Rahul", 90));
        sq.add(new Student("aman", 30));
        sq.add(new Student("mohit", 40));
        sq.add(new Student("ajay", 100));
        while(!pq.isEmpty()){
            System.out.println(sq.poll());
        }
    }
    
}
class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
     @Override
    public String toString(){
        return name + ":"+ marks;
    }

}

class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
       return Integer.compare(s2.marks, s1.marks);
        
    }

}
