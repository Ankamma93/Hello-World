import java.util.Scanner;
class Result
{

	void Marks(int m)
	{
        //for (int i=0;i<m;i++ )
		
		//{
		
		if (100>=70)
		{
			System.out.println(" the result of student is:-Distinction");
		}
		else if(70>=60 && 60<=70)
		{
			System.out.println("the result of student is:-FirstClass");
		}
		else if(60>=50 && 50<=60)
		{
			System.out.println("the result of student is:-SecondClass");
		}
		else if(50>=35 && 35<50)
		{
			System.out.println("the result of student is:-ThirdClass");
		}
		else
                {
			System.out.println("the result of student is:-fail..");
		}
			
			

		//}
	}
}
		
class demoMethods13
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("****6-subjects marks****");
		int i=1;
		int totM=0;
		while(i<=6)
		{
             
			System.out.println("Enter the marks of subject"+i);
			int sub = s.nextInt();
			if(sub<0 || sub >100)
			{
				System.out.println("Invalid marks...");
				continue;
			}
			totM = totM+sub;
			i++;
		}
		System.out.println("TotalMarks:"+totM);
		float per = (float)totM/6;
		System.out.println("percentage:"+per);
		System.out.println("Enter the marks:");
		int m = s.nextInt();
		
		Result res = new Result();
		 res.Marks(m);
		

		
	}
}
