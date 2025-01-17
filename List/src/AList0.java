public class AList0 implements EList
{
	private int[] ar = {};
	public AList0()
	{
	}

	public AList0(int[] ini)
	{
		init(ini);
	}
	
	@Override
	public void init(int[] a)
	{
		if (a == null)
		{
			ar = new int[0];
			return;
		}
		int[] temp = new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			temp[i] = a[i];
		}
		ar = temp;
	}
	
	@Override
	public int size()
	{
		return ar.length;
	}
	
	@Override
	public void clear()
	{
		ar = new int[0];
	}
	
	@Override
	public int [] toArray()
	{
		int[] temp = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
			temp[i] = ar[i];

		return temp;
	}
	
	@Override
	public String toString()
	{
		String str = "{";
		for (int i = 0; i < ar.length; i++)
		{
			str += i < ar.length-1? ar[i] + ", " : ar[i];
		}
		str += "}";
		return str;
	}
	
	@Override
	public void addStart(int val)
	{
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++)
		{
			temp[i+1] = ar[i];
		}
		temp[0] = val;
		ar = temp;
	}
	
	@Override
	public void addEnd(int val)
	{
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++)
		{
			temp[i] = ar[i];
		}
		temp[temp.length - 1] = val;
		ar = temp;
	}
	
	@Override
	public void addPos(int pos, int val)
	{
		if (pos < 0 || pos > ar.length)
			throw new ArrayIndexOutOfBoundsException();
		
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < pos; i++)
		{
			temp[i] = ar[i];
		}
		temp[pos] = val;
		for (int i = pos + 1; i < temp.length; i++)
		{
			temp[i] = ar[i - 1];
		}
		ar = temp;
	}
	
	@Override
	public int delStart()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		
		int delVal = ar[0];
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i + 1];
		}
		ar = temp;

		return delVal;
	}
	
	@Override
	public int delEnd()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();

		int delVal = ar[ar.length-1];
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i];
		}
		ar = temp;

		return delVal;
	}
	
	@Override
	public int delPos(int pos)
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		
		if (pos < 0 || pos >= ar.length)
			throw new ArrayIndexOutOfBoundsException();
			

		int delVal = ar[pos];
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = i<pos? ar[i] : ar[i+1];
		}
		ar = temp;
		return delVal;
	}
	
	@Override
	public void set(int pos, int val)
	{
		ar[pos] = val;
	}
	
	@Override
	public int get(int pos)
	{
		return ar[pos];
	}
	
	@Override
	public int minElem()
	{		
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int min=ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (min>ar[i])
			{
				min = ar[i];
			}
		}
		return min;
	}
	
	@Override
	public int maxElem()
	{
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int max=ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (max<ar[i])
			{
				max = ar[i];
			}
		}
		return max;	
	}
	
	@Override
	public int minInd()
	{
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind=0;
		for (int i = 1; i < ar.length; i++)
		{
			if (ar[ind]>ar[i])
			{
				ind = i;
			}
		}
		return ind;
	}
	
	@Override
	public int maxInd()
	{
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind = 0;
		for (int i=0; i<ar.length; i++)
		{
			if (ar[ind]<ar[i])
			{
				ind = i;
			}
		}
		return ind;
	}
	
	@Override
	public void reverse()
	{	
		for (int i=0; i<ar.length/2; i++)
		{
			int temp = 0;
			temp = ar[i];
			ar[i] = ar[ar.length-i-1];
			ar[ar.length-i-1] = temp;
		}
	}
	
	@Override
	public  void reverseHalf()
	{
		int d = (ar.length%2 == 0) ? 0 : 1;

		for(int i=0; i<ar.length/2; i++)
		{
			int temp = ar[i];
			ar[i] = ar[ar.length/2+d+i];
			ar[ar.length/2+d+i] = temp;
		}
	}
	
	@Override
	public void sort()
	{
		for (int i=0;i<ar.length-1;i++)
		{
			int min =i;
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[j]<ar[min]) min=j;
			}
			int temp = ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
	}
}
