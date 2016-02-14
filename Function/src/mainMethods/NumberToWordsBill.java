package mainMethods;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumberToWordsBill
{
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
	private static long inputNum()
	{	
		long num = -1;
		try(Scanner in =new Scanner(JOptionPane.showInputDialog("Input number 0-999,999,999")))
		{
			num = in.nextLong();
		}
		return num;
	}
	public static void main(String[] args)
	{
		long in = -1;
		String res;
		try
		{
			in = inputNum();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		if(in!=-1) 
		{
			res = numberConvert(in);
			System.out.println(res);
		}
	}
}
