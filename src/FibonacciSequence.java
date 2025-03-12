import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

            else {
                System.out.println("Welcome to the Fibonacci Sequence!");
                System.out.println("Please enter the number of the term you would like to see: ");
                System.out.println("For example, entering 3 would give you a result of 2 because it is the 3rd term");

                System.out.println("Enter a number:");
                 n = scanner.nextInt();
                 scanner.close();

            }

        System.out.println("Here is the Fibonacci number: ");
        System.out.println(Fibonacci(n));

    }

    public static int Fibonacci(int n) {
        if (n<=1) {
            return n;
        }

        else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
        
        
    }
}
