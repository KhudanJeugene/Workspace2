public class HW2
{	
	public static int calcSum()
	{	
		return 2450;
	}

	public static int calcCount()
	{		
		return 49;
	}

	public static boolean findSimple(int n)
	{	
		boolean flag=true;
		if (n<=0)
			throw new IllegalArgumentException();

		for (int i = 2; i < n; i++)
		{
			if (n%i==0)	
			{	
				flag = false;
				break;
			}		
		}
		return flag;
	}

	public static int findRoot(int n)
	{
		int i=0;
		if (n<0)
			throw new IllegalArgumentException();

		while(i*i<=n)
		{
			i++;
		}
		if (i*i>n)
			i--;			

		return i;
	}

	public static int findRootBin(int n)
	{	
		if (n<0)
			throw new IllegalArgumentException();

		int root = 0;		
		int left = 0;
		int right = n;
		while (root*root<=n)
		{
			int mid = left+(right -left)/2;
			if (mid*mid==n)
			{
				root = mid;
				break;
			}
			else if (mid*mid >n) 
			{
				right = mid;
			}
			else 
			{
				left = mid;
			}
			if (right - left ==1)
			{
				root = left;
				break;
			}
		}

		return root;
	}

	public static int factorial(int n)
	{
		int fact = 1;
		if (n<=0)
			throw new IllegalArgumentException();

		for (int i=n; i>1; i--)
		{
			fact *= i;
		}

		return fact;
	}

	public static int sumDig(int i)
	{	
		if (i<0)
		{
			i *= -1;
		}
		int sum = 0;
		if (i==0) 
		{
			sum = i;
		}
		while(i!=0)
		{
			sum += i%10;
			i /= 10;
		}
		return sum;
	}

	public static int mirror(int n)
	{	
		int res = 0;
		while (n!=0)
		{
			res += n%10;
			n /= 10;
			if (n!=0) 
			{
				res*=10;
			}
		}	
		return res;	
	}	
}
