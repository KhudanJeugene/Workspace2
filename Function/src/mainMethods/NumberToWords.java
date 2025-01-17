package mainMethods;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
//������ ����� (0-999), �������� ������ � �������� �����.
public class NumberToWords
{	
	private static int inputNum()
	{	
		int num = -1;
		try(Scanner in =new Scanner(JOptionPane.showInputDialog("Input number 0-999")))
		{
			num = in.nextInt();
		}
		return num;
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
	public static String numberToWords(int n)
	{	
		String word="";	
		if (n>999) 
		{
			throw new IllegalArgumentException();
		}
		if (n<0) 
		{
			word ="����� ";
			n/=-1;
		}
		
		if (n>=100 && n<1000) 
		{
			word +=hundreds(n);
		}
		if (n >= 20 && n <= 99)
		{
			word += decade(n);
		}
		if (n >= 0 && n <= 19)
		{
			word += one(n);
		}

		return word;
	}
	public static void main(String[] args) throws IOException
	{	
		int num =-1;
		String word;
		num = inputNum();
		try
		{
			word = numberToWords(num);
			System.out.println(word);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
