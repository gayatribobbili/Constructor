import java.io.*;
class Superclass
{
public void print() 
{
System.out.println("Hello Welcome To programming course");
}
}
class Subclass extends Superclass
{
public void print() throws ArithmeticException
{
System.out.println("This is Java Programming");
}
}
class Overriding
{
public static void main(String[] args)
{
Superclass sc=new Subclass();
sc.print();
Superclass s=new Superclass();
s.print();
}
}