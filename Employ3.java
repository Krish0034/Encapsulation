/*Print reference id.*/
class Employ3
{
	String name;
	int age;
	void setData(String n,int a)
	{
		name=n;
		age=a;
		
	}
	void showData()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		
	}
	static double Addsalary(double x,double y)
	{
		return (x+y);
		
	}
	public static void main(String []arg)
	{
		Employ3 e1=new Employ3();
		System.out.println("Reference ID: "+e1.hashCode());
		System.out.println("Reference ID: "+e1);
		e1.name="Jay";
		System.out.println("Name: "+e1.name);
		Employ3 e2=e1;
		System.out.println("Reference ID: "+e2.hashCode());
		System.out.println("Reference ID: "+e2);
		e2.name="Krishna";
		System.out.println("By e1: "+e1.name);
		System.out.println("By e2: "+e2.name);
		
		if(e1==e2)
			System.out.println("Same");
	}
}
