import java.util.Scanner;

public class STAR_ADVANCE_RHOMBUS1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of star to print in each line of RHOMBUS : ");
        int m = sc.nextInt();

        for(int i=1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=m-i ; j++)
            {
                System.out.print("  ");
            }
            for(int j=1 ; j<=m ; j++)
            {
                System.out.print("* ");
            }
            for(int j=1 ; j<=i-1 ; j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}