public class LList implements EList
{
	class Node
	{
		int val;
		Node next;
		public Node(int val)
		{
			this.val = val;
		}
	}
	Node root = null;
	@Override
	public void init(int[] a)
	{
		if(a == null)
		{
			a = new int[0];
		}

		for(int i = a.length-1; i >= 0; i--)
		{
			addStart(a[i]);
		}
	}

	@Override
	public int size()
	{
		int ret = 0;
		Node p = root;
		while(p != null)
		{
			ret++;
			p = p.next;
		}
		return ret;
	}

	@Override
	public void clear()
	{
		root = null;

	}

	@Override
	public int[] toArray()
	{
		int[] ret = new int[size()];
		Node p = root;
		int i = 0;
		while(p != null)
		{
			ret[i++] = p.val;
			p = p.next;
		}
		return ret;
	}
	@Override
	public String toString()
	{
		String str = "{";
		Node p = root;
		while(p != null)
		{
			str += (p.next != null) ? p.val + ", " : p.val;
			p = p.next;
		}
		str += "}";
		return str;
	}

	@Override
	public void addStart(int val)
	{
		Node p = new Node(val);
		p.next = root;
		root = p;

	}

	@Override
	public void addEnd(int val)
	{
		Node p = root;
		if (p == null)	
			addStart(val);

		else 
		{
			while(p.next != null)
			{
				p = p.next;
			}
			p.next = new Node(val);
		}	
	}

	@Override
	public void addPos(int pos, int val)
	{
		if (pos < 0 || pos > size())
			throw new ArrayIndexOutOfBoundsException();


		if (pos == 0)
			addStart(val);

		else
		{	
			Node p = root;
			Node tempP = new Node(val);
			for (int i = 1; i < pos; i++)
			{
				p = p.next;
			}
			tempP.next = p.next;
			p.next = tempP;	
		}
	}

	@Override
	public int delStart()
	{
		if(size() == 0)
			throw new IllegalArgumentException();

		int delVal = root.val;
		root = root.next;
		return delVal;
	}

	@Override
	public int delEnd()
	{
		if (size() == 0)
			throw new IllegalArgumentException();

		int delVal = root.val;
		if (size() == 1)	
			root = null;
		
		else
		{
			Node p = root;
			while(p.next!= null)
			{
				Node tempP = p;
				p = p.next;	
				if (p.next == null)
				{
					delVal = p.val;
					tempP.next = null;
				}
			}
		}
		return delVal;
	}

	@Override
	public int delPos(int pos)
	{
		if (size() == 0)
			throw new IllegalArgumentException();

		if (pos < 0 || pos >= size())
			throw new ArrayIndexOutOfBoundsException();
		
		int delVal = root.val;
		if (size() == 1)
			root = null;
		
		Node p = root;
		for (int i = 0; i < pos; i++)
		{
			Node tempP = p;
			p = p.next;
			if(i == pos - 1)
			{
				delVal = p.val;
				tempP.next = p.next;
			}
		}		
		
		return delVal;
	}

	@Override
	public void set(int pos, int val)
	{
		if (pos < 0 || pos >= size())
			throw new ArrayIndexOutOfBoundsException();

		Node p = root;
		for (int i = 0; i < pos; i++)
		{
			p = p.next;
		}
		p.val = val;
	}

	@Override
	public int get(int pos)
	{
		if (pos < 0 || pos >= size())
			throw new ArrayIndexOutOfBoundsException();

		Node p = root;
		for (int i = 0; i < pos; i++)
		{
			p = p.next;
		}
		int getVal = p.val;
		return getVal;
	}

	@Override
	public int minElem()
	{
		if (size() == 0)
			throw new IllegalArgumentException();

		int min = root.val;
		Node p = root;
		while (p.next != null)
		{
			p = p.next;

			if (min > p.val)
				min = p.val;	
		}
		return min;
	}

	@Override
	public int maxElem()
	{
		if (size() == 0)
			throw new IllegalArgumentException();

		int max = root.val;
		Node p = root;
		while (p.next != null)
		{
			p = p.next;

			if (max < p.val)
				max = p.val;

		}
		return max;
	}

	@Override
	public int minInd()
	{
		if (size() == 0)
			throw new IllegalArgumentException();

		int minInd = 0;
		int min = root.val;
		Node p = root;
		for (int i = 1; p.next != null; i++)
		{
			p = p.next;

			if (min > p.val)
			{
				min = p.val;
				minInd = i;
			}
		}
		return minInd;
	}

	@Override
	public int maxInd()
	{
		if (size() == 0)
			throw new IllegalArgumentException();

		int maxInd = 0;
		int max = root.val;
		Node p = root;
		for (int i = 1; p.next != null; i++)
		{
			p = p.next;

			if (max < p.val)
			{
				max = p.val;
				maxInd = i;
			}
		}
		return maxInd;
	}

	@Override
	public void reverse()
	{
		if (size() <= 1)
			return;

		Node p = root;
		root = null;
		while (p!=null)
		{
			addStart(p.val);
			p = p.next;
		}
	}

	@Override
	public void reverseHalf()
	{
		if (size() <= 1)
			return;

		int d = (size() % 2 == 0) ? 0 : 1;

		for(int i=0; i< size() /2; i++)
		{
			int temp = get(i);
			set(i,get(size()/2 + d + i)); 
			set(size()/2+d+i,temp);
		}
	}

	@Override
	public void sort()
	{
		if (size() <= 1)
			return;

		for (int i=0; i < size()-1; i++)
		{
			int min = i;
			for (int j = i + 1; j < size(); j++)
			{
				if (get(min)>get(j)) min=j;
			}
			int temp = get(i);
			set(i,get(min));
			set(min,temp);
		}
	}
}


