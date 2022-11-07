public class Sum {

	public void display()	{
		for(int i=1;i<11;i++) {
			System.out.println("Series:"+i);
			System.out.println("Sum of the series:"+summation());
		}
	}
	
	public int summation()	{
		int sum=0;
		for(int i=1;i<11;i++) 
			sum+=i*i;
		return sum;
		
		
	}
}
	

public class Program_2 {
	public static void main(String args[])	{
		Sum s1=new Sum();
		s1.display();
	}
}