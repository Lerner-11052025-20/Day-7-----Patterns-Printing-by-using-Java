import java.util.Scanner;

public class NUMBER_SPECIAL2
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
               if(i<j)  min = i;
               else    min = j;
               System.out.print(min+" "); 
            }
            System.out.println();
        }


        
    }
}