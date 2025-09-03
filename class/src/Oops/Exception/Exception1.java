package Oops.Exception;

public class Exception1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
        finally {
            System.out.println("Execution finished.");
        }
    }
}
