import java.util.Scanner;

public class ALPHABETS_MAST_PYRAMID
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
            //int a = 0;
            for(int i=1 ; i<=m ; i++)
            {
                int b = 64,c = 0 ;
                for(int j=1 ; j<=m-i ; j++)
                {
                    System.out.print("  ");
                }            
                for(int j=1 ; j<=i ; j++)
                {
                    b++;
                    char ch = (char) b;
                    System.out.print(ch+" ");
                    c = b;
                }
                for(int j=1 ; j<i ; j++)
                {
                    c--;
                    char ch = (char) c;
                    System.out.print(ch+" ");
                }
                for(int j=1 ; j<=m-i ; j++)
                {
                    System.out.print("  ");
                }
                //a++;
                System.out.println();
            }
        }
        
    }
}