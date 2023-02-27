package Calculation;
class Person
{
void walk()
{
System.out.println("Can Run....");
}
}
public class poly extends Person
{
void walk()
{
System.out.println("Running Fast...");
}
public static void main(String arg[])
{
Person p=new poly(); //upcasting
p.walk();
}
}