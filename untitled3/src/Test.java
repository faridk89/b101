import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = -1;

        while(choice!=0) {
             System.out.println("Enter the Choice");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("0 - Exit");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                System.out.println("Enter the number1");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the number2");
                int num2 = Integer.parseInt(sc.nextLine());
                System.out.println("Sum is " + Calculator.sum(num1, num2));

            }
            if (choice == 2) {
                System.out.println("Enter the number1");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the number2");
                int num2 = Integer.parseInt(sc.nextLine());
                System.out.println("Subtraction is:" + Calculator.sub(num1, num2));
            }
            if (choice == 3) {
                System.out.println("Enter the number1");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the number2");
                int num2 = Integer.parseInt(sc.nextLine());
                System.out.println("Multiplication is:" + Calculator.mul(num1, num2));
            }

        }
    }
}