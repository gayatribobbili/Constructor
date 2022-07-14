import java.lang.Math.*;
abstract class Shape
{
abstract void area();
double  area;
}
class Rectangle extends Shape
{
int b=543, h=687;
void area()
{
area=b*h;
System.out.println("area of the rectangle :"+area);
}
}
class Triangle extends Shape
{
float  b=90 , h =897;
void area()
{
area=(b*h)/2;
System.out.println("area of the triangle:"+area);
}
}
class Square extends Shape
{
float s=45;
void area()
{
area = s*s;
System.out.println("area of the square:"+area);
}
}
class Circle extends Shape
{
float r =5;
void area()
{
area=Math.PI*r*r;
System.out.println("area of the circle:"+area);
}
}
class Abstractdemo
{
public static void main(String[] args)
{
Rectangle r= new Rectangle();
Triangle t = new Triangle();
Square s = new Square();
Circle c = new Circle();
r.area();
t.area();
s.area();
c.area();
}
}
