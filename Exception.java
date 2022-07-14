import java.util.Scanner;
class Exception
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
try
{ 
int a,b;
float d;
{
System.out.println("enter a value:");
 a =s.nextInt();
System.out.println("enter b value:");
 b = s.nextInt();
 d= a/b;
System.out.println("the division is:"+d);
}
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
System.out.print("end of the program");
}
}
}

