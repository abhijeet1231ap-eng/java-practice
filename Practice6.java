
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Practice6 {
    public static void main(String[] args){

        ArrayList <Employee> Employees = new ArrayList<>();

        Employees.add(new Employee("ABHIJEET", 120000));
        Employees.add(new Employee("CHINU", 1000));
        Employees.add(new Employee("VINAY", 1500));
         Employees.add(new Employee("ajay", 500));


         //for comparable

         System.out.println("BEFORE SORTING");
          System.out.println(Employees);

          Collections.sort(Employees);

           System.out.println("AFTER SORTING");
            System.out.println(Employees);

            //for comparator


            Collections.sort(Employees , new SalaryComparator());
            System.out.println(Employees);

            Collections.sort(Employees , new nameComparator());
            System.out.println(Employees);



    }
    
}
////comparable

class Employee implements Comparable<Employee>{

    String name;
    int salary;

public Employee(String name , int salary){
    this.name = name;
    this.salary = salary;
}

@Override
public int compareTo(Employee other){
    return Integer.compare(this.salary, other.salary);
}


@Override
public String toString(){
    return name + ": "+salary;
}

}


//  salary comparator

class SalaryComparator implements Comparator <Employee>{
    @Override
    public int compare(Employee e1 ,Employee e2){
        return Integer.compare(e1.salary, e2.salary);
    }
}

//name comparator

class nameComparator implements Comparator<Employee>{
    @Override

    public int compare(Employee e1 , Employee e2){
        return e1.name.compareTo(e2.name);

    }
}
