import java.util.Scanner;

import static java.lang.System.exit;

public class Calculate {
    static void calculator(int n, float a, float b) {
        Scanner val = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Addition of the entered numbers is " + (a + b) + "\n");
                System.out.println("Choose another operation to perform?  \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exit");
                int p = val.nextInt();
                calculator(p,a,b);
                break;
            case 2:
                System.out.println("Subtraction of the entered numbers is " + (a - b) + "\n");
                System.out.println("Choose another operation to perform?  \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exit");
                p = val.nextInt();
                calculator(p,a,b);
                break;
            case 3:
                System.out.println("Product of the entered numbers is " + (a * b) + "\n");
                System.out.println("Choose another operation to perform?  \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exit");
                p = val.nextInt();
                calculator(p,a,b);
                break;
            case 4:
                System.out.println("Division of the entered numbers is " + (a / b) + "\n");
                System.out.println("Choose another operation to perform?  \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exit");
                p = val.nextInt();
                calculator(p,a,b);
                break;
            case 5:
                System.out.println("Thank-you for using Calculator App! GoodBye :)");
                exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }

        public static void main (String[]args){
            System.out.println("Enter first number");
            Scanner value = new Scanner(System.in);
            float a = value.nextInt();

            System.out.println("Enter second number");
            float b = value.nextInt();

            System.out.println("Calculator App || Enter a number to perform any operation on given numbers: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exit");
            int n = value.nextInt();
            calculator(n,a,b);
        }
    }
