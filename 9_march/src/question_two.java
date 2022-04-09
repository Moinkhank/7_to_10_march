//Determine if a given matrix is sparse matrix or not


public class question_two {
    public static void main(String[] args) {
        int c[][] = {{1,0,0,0},{2,1,0,0},{0,0,0,0},{1,4,0,7}};
        int element = c.length*c.length ,count = 0;
        for(int i = 0;i<c.length;i++)
        {
            for(int j = 0;j<c.length;j++)
            {
                if(c[i][j] == 0)
                {
                    count ++ ;
                }
            }
        }
        if(count > element/2)
        {
            System.out.println("it is sparse matrix");
        }
        else {
            System.out.println("not sparse matrix");
        }
    }
}
