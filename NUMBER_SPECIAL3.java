import java.util.Scanner;

public class NUMBER_SPECIAL3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();  

        int min ;
        for(int i=1 ; i<=(m*2)-1 ; i++)     
        {       
            for(int j=1 ; j<=(m*2)-1 ; j++)
            {
                int a = i;
                if(i>m)     a = (m*2) - i;
                int b = j;
                if(j>m)     b = (m*2) - j;

                if(a<b)  min = a;
                else    min = b;
               System.out.print(m+1-min+" ");       //1. only min   2. m+1-min
            }
            System.out.println();
        }       
    }
}