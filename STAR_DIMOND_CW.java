import java.util.Scanner;

public class STAR_DIMOND_CW
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        int nsp = m/2;
        int nst = 1;
        int ml = (m/2)+1;
        for(int i=1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=nsp ; j++)
            {
                System.out.print("  ");
            }            
            for(int j=1 ; j<=nst ; j++)
            {
                System.out.print("* ");
            }
            for(int j=1 ; j<=nsp ; j++)
            {
                System.out.print("  ");
            }
            if(i<ml)
            {
                nsp-- ;
                nst+=2 ;
            }
            else               // middle line per and i>ml ma and i==ml ma else vali condition run thase ohk
            {
                nsp++ ;
                nst-=2 ;
            }
            
            System.out.println();
        }
    }
}