import java.util.Scanner;

public class NUMBER_HARD__HARD_CORE
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        int n = m-1;
        int nsp=1 , nst=n;

        
        for(int j=1 ; j<=(n*2)+1 ; j++)     
        {       
            System.out.print(j+" ");
        }
        System.out.println();


        for(int i=1 ; i<=n ; i++)
        {
            int a = 1;
            for(int j=1 ; j<=nst ; j++)
            {
                System.out.print(a+" ");
                a++;
            }
            for(int k=1 ; k<=nsp ; k++)
            {
                System.out.print("  ");
            }
            a--;
            for(int j=1 ; j<=nst ; j++)
            {
                System.out.print(a+" ");
                a--;
            }               
            nsp+=2;
            nst--;            
            System.out.print("\n");
        }
    }
}