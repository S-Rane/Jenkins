class Parent
{
	public void add(int x , int y)
	{
		int s=0;
		s = x+y;
	}
}
class Child extends Parent
{
	public void add(int x , int y)
	{
		int s=0;
		s = x-y;
		System.out.println("Ans: " + s);
	}
}
public class Example
{
	public static void main(String[] args)
	{
		Child c1 = new Child();
		c1.add(78,89);
	}
}
		
		
		
		
		
	
	
	