// java program to find the longest repeated sequence in string


package com.company;
public class Main {

    public static void main(String[] args) {

        String str = "aaaaaaaccd";
        char[] str1 = str.toCharArray();
        int n = str.length() - 1,current = 1,prev = 0,count = 0,longest_sequence = 0;
        char value = '.';
        for(int i = 0;i<n;i++)
        {
            if(str1[current] == str1[prev])
            {
                        current ++;
                        prev ++;
                        count ++;
            }
            else
            {
               if(longest_sequence < count)
               {
                   longest_sequence = count ;
                   value = str1[prev];
                   count = 0;
               }
               current ++ ;
               prev ++ ;
               count = 0;
            }
        }
        System.out.println("longest repeating sequence is  "+ value +" repeating "+( longest_sequence +1) +" times");

    }
}
