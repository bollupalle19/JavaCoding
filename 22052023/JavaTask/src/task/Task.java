package task;

public class Task {

	int a,b;
	public void Add(int c)
	{
		System.out.println("I am Add Call"+ c);
		a = c;
	}
	
	public void Sub(int c)
	{
		System.out.println("I am Sub Call"+ c);
		b= c;
	}
	
	public static void  main(String[] arge)
	{
		Task t = new Task();
		Task t1= new Task();
		t.Add(1);
		t.Sub(2);
		t1.Add(3);
		t1.Sub(4);
		System.out.println("Calling from t object-->"+ t.a+","+t.b);
		System.out.println("Calling from t1 object-->"+ t1.a+","+t1.b);
	}
}
