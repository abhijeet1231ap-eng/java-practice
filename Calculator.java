import java.util.Scanner;

class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1 number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter your 2 number: ");
        int number2 = sc.nextInt();

       
        
        System.out.print("Enter your choice: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = sc.nextInt(); 
        int result;


         if(choice == 1){
             result = number1 + number2;
            System.out.println("Result " + result);
            
         }else if (choice == 2) {
            result = number1 - number2;
             System.out.println("Result " + result);
         }else if(choice==3){
            result = number1*number2;
            System.out.println("Result " + result);
         }else if(choice == 4){
            result = number1/number2;
            System.out.println("Result " + result);
         }else{
             System.out.println("Invalid choice");
         }
    }
}
