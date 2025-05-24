import java.util.Scanner;

public class NUMBER_PYRAMID
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        if(m%2 == 0)
        {
            System.out.println("INVLID INPUT");
        }
        else
        {            
            int a = 0;
            for(int i=1 ; i<=m ; i++)
            {
                int b = 1;
                for(int j=1 ; j<=m-i ; j++)
                {
                    System.out.print("  ");
                }            
                for(int j=1 ; j<=i+a ; j++)
                {
                    System.out.print(b+" ");
                    b++;
                }
                for(int j=1 ; j<=m-i ; j++)
                {
                    System.out.print("  ");
                }
                a++;
                System.out.println();
            }
        }
        
    }
}