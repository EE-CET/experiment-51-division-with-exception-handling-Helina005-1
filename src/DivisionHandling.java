


import java.util.Scanner;

public class DivisionHandling {    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the two integers
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            try {
                // Attempt to perform the division
                int result = a / b;
                // If successful, print the result
                System.out.println(result);
                
            } catch (ArithmeticException e) {
                // If b is 0, this block catches the ArithmeticException
                System.out.println("Divide by zero error");
            }
        }

        sc.close();
    }
}