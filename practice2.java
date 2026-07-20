public class practice2 {
    public static void main(String[] args){
        VideoPlayer videoplayer = new VideoPlayer();
        videoplayer.play();
        videoplayer.pause();

        MusicPlayer musicplayer = new MusicPlayer();
        musicplayer.play();
        musicplayer.pause();



        Circle circle = new Circle(10);
        circle.calculateArea();
        circle.displayInfo();

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.calculateArea();
        rectangle.displayInfo();



        FullTimeEmployee  fulltimeemployee = new FullTimeEmployee(50000);
        fulltimeemployee.calculateSalary();
        fulltimeemployee.displaySalary();

        FreeLancer freelancer = new FreeLancer(2000, 8);
        freelancer.calculateSalary();
        freelancer.displaySalary();
    }
    

    
    
}

//media player

interface MediaPlayer{
    public void play();
    default void pause(){
        System.out.println("Pause audio");
    }
}
class VideoPlayer implements MediaPlayer{
    @Override
    public void play(){
        System.out.println("play video");

    }
    @Override
    public void pause(){
          System.out.println("pause video");
    }

}
class MusicPlayer implements MediaPlayer{
    @Override
    public void play(){
        System.out.println("play audio");
    }
   
}


//shape
interface Shape{
    public double calculateArea();
    default void displayInfo(){
        System.out.println("This shape has an area of: "+   calculateArea());
    }
}
class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
   }

   public double calculateArea(){
    return 3.14 * radius * radius; 
   }
}
class Rectangle implements Shape{
    private double length;
    private double breadth;
    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea(){
        return length*breadth;
    }
}

//employee
interface Employee {
    double calculateSalary();
     default void displaySalary(){
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee implements Employee{
   private double monthlySalary;
     FullTimeEmployee(double monthlySalary){
    this.monthlySalary = monthlySalary;
   }
   public double calculateSalary(){
    return monthlySalary*12;
   }
}
class FreeLancer implements Employee{
    private double hourlyRate;
    private double hoursWorked;
    FreeLancer(double hourlyRate, double hoursWorked){
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}


//functional interface
 @FunctionalInterface
interface Greetable{
   String greet();
}
class Greet  implements Greetable{
    @Override
   public String greet(){
        return "Hello";
    }
}


//marker interface
interface Trusted  {

}
class Go implements Trusted{

}