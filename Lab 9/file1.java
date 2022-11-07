import java.util.Scanner;
public class SeriesSum {
	
	public int sum()	{
		int sum=0;
		for(int i=40;i<251;i++)	{
			if(i%5==0)
				sum+=i;
		return sum;
}

}

	public void display()	{

		System.out.println("Sum of the series:"+sum());

	}
}
public class Program_4	{

	public static void main(String args[])	{

		SeriesSum ss=new SeriesSum();
		ss.display();

}

}

