/*STATIC DATA MEMBER AND STATIC MEMBER FUNCTION*/
class Employ2
{
	static String CompName="HCL";
	String name;
	int age;
	double salary;
	void setData(String n,int a,double s)
	{
		name=n;
		age=a;
		salary=s;
	}
	void showData()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		
	}
	static double AddSalary(double x,double y)
	{
		return(x+y);
	}
	public static void main(String []arg)
	{
		Employ2 e1=new Employ2();
		Employ2 e2=new Employ2();
		e1.setData("Jay Kumar",24,17.5);
		e2.setData("Krishn Kumar",22,15.5);
		System.out.println("******************Employ Deatial*********************");
		System.out.println("******************"+Employ2.CompName+"*********************");
		e1.showData();
		e2.showData();
		System.out.println("Total Salary= "+Employ2.AddSalary(e1.salary,e2.salary));
	}
}
class DemoAdd
{
	public static void main(String []srg)
	{
		double z=Employ2.AddSalary(17.5,10.5);
		System.out.println(Employ2.CompName);
		System.out.println("Total Sal: "+z);
	}
}