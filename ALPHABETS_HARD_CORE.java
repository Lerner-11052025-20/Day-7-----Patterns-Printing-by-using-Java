import java.util.Scanner;

public class ALPHABETS_HARD_CORE
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        int n = m-1;
        int nsp=1 , nst=n;
        int b = 65;
        

        for(int j=1 ; j<=(n*2)+1 ; j++)     
        {
            char ch = (char) b;
            System.out.print(ch+" ");
            b++;
        }
        System.out.println();


        for(int i=1 ; i<=n ; i++)
        {
            int a = 65;
            for(int j=1 ; j<=nst ; j++)
            {
                char ch = (char) a;
                System.out.print(ch+" ");
                a++;
            }
            for(int k=1 ; k<=nsp ; k++)
            {
                System.out.print("  ");
                a++;
            }
            
            for(int j=1 ; j<=nst ; j++)
            {
                char ch = (char) a;
                System.out.print(ch+" ");
                a++;
            }               
            nsp+=2;
            nst--;            
            System.out.println();
        }
    }
}