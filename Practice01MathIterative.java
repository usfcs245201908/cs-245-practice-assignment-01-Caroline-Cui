public class Practice01MathIterative implements Practice01Math
{
	public Practice01MathIterative()
	{

	}

	public int fib (int n)
	{
		int temp = 0;
		int temp1 = 1;
		int conclusion = 0;
		if (n>=0) 
		{
			if (n == 1) 
			{
				conclusion = 1;
			}
			else if (n == 0) 
			{
			 	conclusion = 0;
			} 
			else
			{
				for (int i = 2; i <= n; i++) 
				{
					conclusion = temp + temp1;
					temp = temp1;
					temp1 = conclusion;
				}
			}
		}

		else
		{
			throw new IllegalArgumentException("Your input is a negative number");
		}

		return conclusion;
	}	

	public int fact (int n)
	{
		int total = 1;
		
		if (n >= 0) 
		{
			int temp = n;
			for (int i = 1; i <= n; i++) 
			{
				total = total*temp;
				temp--;
			}
		}

		else
		{
			throw new IllegalArgumentException("Your input is a negative number");
		}

		return total;
	}
}