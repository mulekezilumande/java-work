package pat;
import java.util.Scanner;
public class work {
	
public static void conversion()
{
	double x;
	try {
	   x = Double.parseDouble(str);
	   System.out.println( "The number is " + x );
	}
	catch ( NumberFormatException e ) {
	   System.out.println( "Not a legal number." );
	   x = Double.NaN;
	}

}
public static void main()
{
	work method=new work();
	method.conversion();

}
}
