/*INSTANCE DATA MENBER AND INSTANCE MENBER FUNCTION*/
class Employ1
{
	String name;
	int age;
	double salary;
	void GetData(String n,int a,double s)
	{
		name=n;
		age=a;
		salary=s;
	}
	void ShowData()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		
	}
	public static void main(String []arg)
	{
		Employ1 e1=new Employ1();
		e1.GetData("Jay Kumar",24,17.5);
		e1.ShowData();
	}
}