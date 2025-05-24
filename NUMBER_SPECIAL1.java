import java.util.Scanner;

public class NUMBER_SPECIAL1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();  

        
        for(int i=1 ; i<=(m*2)-1 ; i++)     
        {       
            for(int j=1 ; j<=(m*2)-1 ; j++)
            {
                if(i==1 || j==1 || j==(m*2)-1 || i==(m*2)-1)
                {
                    System.out.print("4 ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        
    }
}