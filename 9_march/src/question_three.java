//find the frequency of odd and even no in a given matrix


public class question_three {
    public static void main(String[] args) {
        int arr[][] = {{4,2,8},{1,5,7},{4,8,6}};
        int count1 = 0,count2 = 0;
        for(int i = 0;i< arr.length;i++)
        {
            for (int j = 0;j< arr.length;j++)
            {
                if(arr[i][j]%2 == 0)
                {
                    count1 ++ ;
                }
                else if(arr[i][j]%2 != 0)
                {
                    count2 ++ ;
                }
            }
        }
        System.out.println("the even numbers are : "+count1+ "  times");
        System.out.println("the odd numbers are : "+count2+ "  times");
    }
}
