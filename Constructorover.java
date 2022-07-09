class Employee
{
int id;
String name;
float salary;
Employee()
{
System.out.println("EMPLOYEE DETAILS");
}
Employee (int id ,String name)
{
this.id=id;
this.name=name;
System.out.println("Employee id :"+id);
System.out.println("Employee name :"+name);
}
Employee (float salary)
{
this.salary=salary;
System.out.println("Employee salary:"+salary);
}
}
class Constructorover
{
public static void main(String[] args)
{
Employee e1= new Employee();
Employee e2= new Employee(234,"katrina");
Employee e3= new Employee(235,"rubii");
Employee e4 = new Employee(236,"gunnu");
Employee e5 = new Employee(30000);
Employee e6= new Employee(40000);
Employee e7= new Employee(50000);
Employee e8= new Employee(40000);

}
}



