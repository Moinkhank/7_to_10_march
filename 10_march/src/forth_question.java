//java program to handle exception using through keyword


import java.util.Scanner;

public class forth_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try
        {
            method(a);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public  static void method(int a)
    {
        if(a< 5)
        {
          Throwable    Exception;
            System.out.println("range is below 5");
        }
         else if(a< 10)
        {
            Throwable  Exception;
            System.out.println("range is above 5");

        }
    }
}
