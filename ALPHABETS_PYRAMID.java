import java.util.Scanner;

public class ALPHABETS_PYRAMID
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
                int b = 65;
                for(int j=1 ; j<=m-i ; j++)
                {
                    System.out.print("  ");
                }            
                for(int j=1 ; j<=i+a ; j++)
                {
                    char ch = (char) b;
                    System.out.print(ch+" ");
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