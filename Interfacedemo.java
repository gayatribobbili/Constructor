class Marks
{
int m1,m2,m3;
public void getMarks(int m1 , int m2, int m3)
{
this.m1=m1;
this.m2=m2;
this.m3=m3;
}
public void display()
{
System.out.println("marks of m1="+m1);
System.out.println("marks of m2="+m2);
System.out.println("marks of m3="+m3);
}
}
interface Student
{
String name="gayu";
void getName();
}
class Result extends Marks implements Student
{
public  void getName()
{
System.out.println("name of the student:"+name);
}
public void display1()
{
int total = m1+m2+m3;
float avg = total/3;
System.out.println("total marks:"+total);
System.out.println("average marks:"+avg);
}
}
class Interfacedemo
{
public static void main(String[] args)
{
Result r = new Result();
r.getMarks(90,98,88);
//r.getMarks(98,78,88);
r.display();
r.getName();
r.display1();
}
}