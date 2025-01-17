public class HW9_3
{
	public static int findShort(String s)
	{
		if (s==null)
			throw new IllegalArgumentException();

		String [] arrs = s.split("[\\s.,?!�]+");
		int minword = arrs[0].length();
		for (String word: arrs)
		{
			if(minword>word.length())
				minword = word.length();
		}
		return minword;
	}

	public static void changeSymb(String[] s, int l)
	{
		if (s==null)
			throw new IllegalArgumentException();

		for (int i=0; i<s.length; i++)
		{			
			if (s[i].length()==l)
			{
				s[i] = s[i].substring(0, s[i].length()-3)+"$";
			}
		}
	}

	public static String addSpaces(String str)
	{
		if (str==null)
			throw new IllegalArgumentException();

		String mark = ".,?!:;";
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (mark.indexOf(ch)!=-1)
			{
				flag = true;
			}
			else 
			{
				if(ch!=' ' && flag)
				{
					result.append(' ');			
				}
				flag = false;
			}
			result.append(ch);
		}
		return str = result.toString();
	}

	public static String oneInstance(String str)
	{
		if(str==null)
			throw new IllegalArgumentException();

		StringBuilder result = new StringBuilder();
		while(!str.isEmpty())
		{
			char ch = str.charAt(0);
			result.append(ch);
			str = str.replaceAll(ch + "+", "");
		}
		return str = result.toString();
	}

	public static int countOfWord(String str)
	{
		int count = 0;
		if (str==null)
			throw new IllegalArgumentException();

		if (str.length()>0)
		{
			String[] arrStr;
			arrStr = str.split("\\s|\\,\\s|\\,");
			count = arrStr.length;
		}
		return count;
	}

	public static String deleteSymbol(int n1, int n2, String str)
	{
		if(str==null || n1>=str.length() || n1+n2>=str.length())
			throw new IllegalArgumentException();

		StringBuilder result = new StringBuilder(str);
		result.delete(n1, n1+n2);
		return result.toString();
	}

	public static String reverseString(String str)
	{
		if (str==null)
			throw new IllegalArgumentException();

		StringBuilder result = new StringBuilder(str);
		result.reverse();
		return str = result.toString();
	}

	public static String deleteLastWord(String str)
	{
		if(str==null)
			throw new IllegalArgumentException();

		str = str.trim().replaceAll("\\s\\S*$", "");
		return str;
	}
}

