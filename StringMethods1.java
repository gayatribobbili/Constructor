import java.utill.Scanner;
public class StringMethods1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string:");
String s1= sc.nextLine();
System.out.println("Enter another String:");
String s2= sc.nextLine();
System.out.println(s1.equals(s2));
Sytsem.out.println(s1.equalsIgnoreCase(s2));
}
}