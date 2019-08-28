public class Practice01MathRecursive implements Practice01Math
{
	public Practice01MathRecursive()
	{

	}
	public int fact (int n)
	{
		int temp = 0;
		if (n == 1) 
		{
			temp = n;
		}
		else if (n<0) 
		{
			throw new IllegalArgumentException("Your input is a negative number");
		}
		else
		{
			temp = n*fact(n - 1);
		}
		return temp;
	}

	public int fib (int n)
	{
		int temp = 0;
		if (n == 1 || n == 0) 
		{
			return n;
		}
		else if (n<0) 
		{
			throw new IllegalArgumentException("Your input is a negative number");
		}
		else 
		{
			temp = fib(n-1) + fib(n-2);
		}
		return temp;
	}	
}