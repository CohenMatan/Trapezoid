/**
 * Calculate the area and extent of trapezoid
 * @author Matan Cohen
 * 23/03/2020
 */
import java.util.Scanner;
public class trapezoid
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the left point coordinates of the base followed by its length:");
        //getting data from user              
        int base1X = scan.nextInt();
        int base1Y = scan.nextInt();
        int base1L = scan.nextInt();
                    
        System.out.println("Please enter the left point coordinates of the other base followed by its length:");
        
        int base2X = scan.nextInt();
        int base2Y = scan.nextInt();
        int base2L = scan.nextInt();
        
        //area calculation
        int height = Math.abs(base1Y - base2Y);
        double area = height * (base1L + base2L) / 2.0 ;
        
        //calculation section for length side AD
        double ad = Math.sqrt( (base1X - base2X) * (base1X - base2X) + ( (base1Y - base2Y) *  (base1Y - base2Y) ));
        
        //calculation section for length side BC
        double bc = Math.sqrt( ( (base1X + base1L) - (base2X + base2L) ) * ( (base1X + base1L) - (base2X + base2L) ) + (base1Y - base2Y) * (base1Y - base2Y) );
        
        //perimeter calculation
        double perimeter = ad + bc + base2L + base1L;
        
        System.out.println("the area of the trapezoid is " + area);
        System.out.println("the perimeter of the trapezoid is " + perimeter );
    }
}    
