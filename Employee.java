class Employee {
private String name, address;
private int year, salary;
public Employee(String n, int y, int sal, String add) 
{
  name=n;
  year=y;
  salary=sal;
  address=add;
}
public String getName()
{
  return name;
}
public int getYear()
{
   return year;
}
public int getSalary()
{
   return salary;
}
public String getAddress()
{
   return address;
} }
class Emp{
 public static void main(String[] args)
 {
   Employee e1=new Employee("Deepa", 2004, 500000, "no.102-basavanagudi");
   Employee e2=new Employee("Anu", 2000, 700000, "no.57-srinagar");
   Employee e3=new Employee("Abhinav", 2001, 800000, "no.63-jayanagar");
   System.out.println("Name\t Year of joining\t Salary\t Address");
   System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());
   System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());
   System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());
 }
}

