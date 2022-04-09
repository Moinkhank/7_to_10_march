//how to use try and catch for exception handling


import java.util.Scanner;

public class second_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            System.out.println("in arithmetic exception");
        }
        catch(NullPointerException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }

    }
}
