//java program to implemented the  nested try statement


import java.util.Scanner;

public class third_question {
    public static void main(String[] args) {
        int a ,b ;

        int []arr = {1,2,0,4,5};
        Scanner sc = new Scanner(System.in);

        divideInAarray(arr,11,2);
        System.out.println("hello world ");

    }
    public static void  divideInAarray( int []arr ,int index1 ,int index2)
    {
              try
              {
                  try
                  {
                      System.out.println(arr[index1 ]);
                  }
                  catch (ArrayIndexOutOfBoundsException e)
                  {
                      System.out.println("index out of bound my exception");
                  }
                  try
                  {
                      System.out.println(arr[index1 ]/arr[index2]);
                  }
                  catch (ArithmeticException e)
                  {
                      System.out.println("my arithmetic exception");
                  }

              }
              catch (NullPointerException C)
              {
                  System.out.println("my arithmetic exception");
              }
              catch (ArrayIndexOutOfBoundsException ec)
              {
                  System.out.println("out of bound ");
                  System.out.println(ec.toString());
              }
              catch (Exception a)
              {
                  System.out.println(" exception");
                  System.out.println(a.toString());
              }
    }

}
