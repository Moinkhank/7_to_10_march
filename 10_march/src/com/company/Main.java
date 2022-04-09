//java program to use finally block for catching exceptions


package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    try{
        System.out.println(a/b);
    }
    finally {
        System.out.println("in finally block");
        try{
            System.out.println(a/b);
        }
        catch(Exception ex){
            System.out.println("exception occured");
            System.out.println(ex.getMessage());

        }
    }
        System.out.println("hello world");
    }
}
