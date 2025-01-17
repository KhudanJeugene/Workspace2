public class HW4
{
	public static String dayOfWeek(int day)
	{	
		if (day<1 || day>7)
		{
			throw new IllegalArgumentException();
		}

		String []week = {"","Mondey","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

		return week[day];
	}

	public static String numberToWords(int n)
	{	
		String word="";
		if (n<0 || n>999) 
		{
			throw new IllegalArgumentException();
		}	
		if (n>=100 && n<1000) 
		{
			word =hundreds(n);
		}
		if (n>=20 &&n<=99)
		{
			word=decade(n);
		}
		if (n>=0 && n<=19)
		{
			word = one(n);
		}
		return word;
	}
	public static String hundreds(int n)
	{
		String word = "";
		String []num = new String[10];
		num[1]="���";
		num[2]="������";
		num[3]="������";
		num[4]="���������";
		num[5]="�������";
		num[6]="��������";
		num[7]="�������";
		num[8] = "���������";
		num[9]= "���������";
		word = num[n/100];
		if (n%100<20 && n%100!=0)
		{
			word +=" " + one(n%100);
		}
		else if (n%100!=0)
		{
			word +=" " + decade(n%100);
		} 
		return word;
	}
	public static String decade(int n)
	{	
		String word="";
		String []num = new String[10];
		num[2] = "��������";
		num[3]= "��������";
		num[4]= "�����";
		num[5]="���������";
		num[6]="����������";
		num[7]="���������";
		num[8]="�����������";
		num[9]="���������";
		word = num[n/10];
		if (n%10!=0)
		{
			word+=" " +one(n%10);
		}
		return word;
	}
	public static String one(int n)
	{	
		String word="";
		String [] num = new String[20];
		num[0] ="����";
		num[1] ="����";
		num[2] ="���";
		num[3] ="���";
		num[4] ="������";
		num[5]="����";
		num[6]="�����";
		num[7]="����";
		num[8]="������";
		num[9]="������";
		num[10]="������";
		num[11]="�����������";
		num[12]="����������";
		num[13]="����������";
		num[14]="������������";
		num[15]="����������";
		num[16]="�����������";
		num[17]="����������";
		num[18]="������������";
		num[19]="������������";
		word = num[n];
		return word;
	}

	public static int findInt(String number)
	{	
		int num=0;
		boolean flag = false; 
		if (number==null || number=="")
		{
			throw new IllegalArgumentException();
		}

		String [] masNumber = number.trim().split("\\s+");
		int temp = 0;
		String []numHandr = new String[10];
		numHandr[1]="���";
		numHandr[2]="������";
		numHandr[3]="������";
		numHandr[4]="���������";
		numHandr[5]="�������";
		numHandr[6]="��������";
		numHandr[7]="�������";
		numHandr[8] = "���������";
		numHandr[9]= "���������";
		String []numDec = new String[100];
		numDec[2] = "��������";
		numDec[3]= "��������";
		numDec[4]= "�����";
		numDec[5]="���������";
		numDec[6]="����������";
		numDec[7]="���������";
		numDec[8]="�����������";
		numDec[9]="���������";
		String [] numOne = new String[20];
		numOne[0] ="����";
		numOne[1] ="����";
		numOne[2] ="���";
		numOne[3] ="���";
		numOne[4] ="������";
		numOne[5]="����";
		numOne[6]="�����";
		numOne[7]="����";
		numOne[8]="������";
		numOne[9]="������";
		numOne[10]="������";
		numOne[11]="�����������";
		numOne[12]="����������";
		numOne[13]="����������";
		numOne[14]="������������";
		numOne[15]="����������";
		numOne[16]="�����������";
		numOne[17]="����������";
		numOne[18]="������������";
		numOne[19]="������������";
		for (String a:masNumber){
			for (int i=0;i<numHandr.length;i++)
			{
				if (a.equalsIgnoreCase(numHandr[i]))
				{
					temp = i*100;
					flag = true;
					break;
				}
			}
		}
		if (true) 
		{
			num +=temp;	
			temp =0;
			flag = false;
		}
		for(String a:masNumber)
		{
			for (int i=0;i<numDec.length;i++)
			{
				if (a.equalsIgnoreCase(numDec[i]))
				{
					temp = i*10;
					flag = true;
					break;
				}
			}
		}
		if (true)
		{
			num += temp;
			temp = 0;
			flag = false;
		}

		for(String a:masNumber)
		{
			for (int i=0;i<numOne.length;i++)
			{
				if (a.equalsIgnoreCase(numOne[i]))
				{
					temp = i;
					flag = true;
				}
			}
		}
		if (flag) 
		{
			num += temp;	
		}

		return num;
	}

	public static double dist(int ax, int ay, int bx, int by)
	{
		double res = 0;
		res = Math.sqrt(Math.pow((bx-ax),2)+Math.pow((by-ay),2));
		return res;
	}
	//===================================
	//����� �� 999 ���������� � ������
	//===================================
	public static String numberConvert(long num)
	{
		String res = "";
		boolean sex = false;
		int temp = 0;
		if (num<0)
		{
			res = "����� ";
			num*=-1;
		}
		if (num == 0)
			res = "����";
			
		if(num >= 1000000000)
		{
			sex = true;
			temp = (int)(num/1000000000);
			res += hundred(temp,sex);
			if(temp%10 > 4 || temp%100 >= 11 && temp%100 <= 14 || temp%10==0)
				res += "���������� ";
			else if(temp%10 > 1)
				res += "��������� ";
			else
				res += "�������� ";
				
			num %= 1000000000;
		}
		if(num>=1000000)
		{
			sex = true;
			temp = (int)(num/1000000);
			res += hundred(temp,sex);
			if(temp%10 > 4 || temp%100 >= 11 && temp%100 <= 14 || temp%10==0)
				res += "��������� ";
			else if(temp%10 > 1)
				res += "�������� ";
			else
				res += "������� ";
			
			num %= 1000000;
		}
		if(num>=1000)
		{
			sex = false;
			temp = (int)(num/1000);
			res += hundred(temp,sex);
			if(temp%10 > 4 || temp%100 >= 11 && temp%100 <= 14 || temp%10==0)
				res += "����� ";
			else if(temp%10 > 1)
				res += "������ ";
			else
				res += "������ ";
			
			num %= 1000;
		}
		if(num>0 && num<=999)
		{
			sex = true;		
			res +=hundred((int)num,sex);
		}
		return res.trim();
	}
	public static String hundred(int num, boolean sex)
	{
		String word = "";
		if(num >= 100 && num <=999)
		{
			String[] hundr = new String [10];
			hundr[1] = "���";
			hundr[2] = "������";
			hundr[3] = "������";
			hundr[4] = "���������";
			hundr[5] = "�������";
			hundr[6] = "��������";
			hundr[7] = "�������";
			hundr[8] = "���������";
			hundr[9] = "���������";
			word +=hundr[num/100] + " ";
			num %=100;
		}

		if (num>=20)
			word +=decade(num,sex);
		
		if (num%100 < 20 && num!=0)
			word +=one(num,sex);	

		return word;
	}
	public static String decade(int num,boolean sex)
	{
		String word = "";
		String[] dec = new String[10];
		dec[2] = "��������";
		dec[3]= "��������";
		dec[4]= "�����";
		dec[5]="���������";
		dec[6]="����������";
		dec[7]="���������";
		dec[8]="�����������";
		dec[9]="���������";
		word = dec[num/10] + " ";
		if (num%10!=0)
		{
			word+=one(num%10,sex);
		}
		return word;
	}
	public static String one(int num, boolean sex)
	{
		String word = "";
		String[] male = new String[20];
		male[1]="����";
		male[2]="���";
		male[3]="���";
		male[4]="������";
		male[5]="����";
		male[6]="�����";
		male[7]="����";
		male[8]="������";
		male[9]="������";
		male[10]="������";
		male[11]="�����������";
		male[12]="����������";
		male[13]="����������";
		male[14]="������������";
		male[15]="����������";
		male[16]="�����������";
		male[17]="����������";
		male[18]="������������";
		male[19]="������������";

		String[] female = new String[20];
		female[1]="����";
		female[2]="���";
		female[3]="���";
		female[4]="������";
		female[5]="����";
		female[6]="�����";
		female[7]="����";
		female[8]="������";
		female[9]="������";
		female[10]="������";
		female[11]="�����������";
		female[12]="����������";
		female[13]="����������";
		female[14]="������������";
		female[15]="����������";
		female[16]="�����������";
		female[17]="����������";
		female[18]="������������";
		female[19]="������������";

		if(sex)
			word = male[num] + " ";

		else 
			word = female[num] + " ";

		return word;
	}
}
