import static org.junit.Assert.*;

import org.junit.Test;

public class HW9_3Test
{
	//====================
	//findShort
	//====================

	@Test (expected = IllegalArgumentException.class)
	public void testFindShort_null()
	{
		String str = null;
		HW9_3.findShort(str);
	}
	@Test
	public void testFindShor_0()
	{
		String str = "";
		int res =HW9_3.findShort(str);
		assertEquals(res,0);
	}
	@Test
	public void testFindShor_1()
	{
		String str = "i";
		int res =HW9_3.findShort(str);
		assertEquals(res,1);
	}
	@Test
	public void testFindShor_2()
	{
		String str = "You look";
		int res =HW9_3.findShort(str);
		assertEquals(res,3);
	}
	@Test
	public void testFindShor_many()
	{
		String str = "Something like this";
		int res =HW9_3.findShort(str);
		assertEquals(res,4);
	}

	//=====================
	//changeSymb
	//=====================

	@Test (expected = IllegalArgumentException.class)
	public void testChangeSymb_null()
	{
		String []str = null;
		int l = 4;
		HW9_3.changeSymb(str,l);
	}
	@Test
	public void testChangeSymb_0()
	{
		String []str = {};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {};
		assertArrayEquals(res,str);
	}
	@Test
	public void testChangeSymb_1()
	{
		String []str = {"Many"};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {"M$"};
		assertArrayEquals(res,str);
	}
	@Test
	public void testChangeSymb_2()
	{
		String []str = {"Many", "symb"};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {"M$", "s$"};
		assertArrayEquals(res,str);
	}
	@Test
	public void testChangeSymb_many()
	{
		String []str = {"Many", "symb", "and"};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {"M$", "s$", "and"};
		assertArrayEquals(res,str);
	}

	//=====================
	//addSpaces
	//=====================

	@Test (expected = IllegalArgumentException.class)
	public void testAddSpaces_null()
	{
		String str = null;
		HW9_3.addSpaces(str);
	}
	@Test
	public void testAddSpaces_0()
	{
		String str = "";		
		String res = HW9_3.addSpaces(str);	
		assertEquals(res,str);
	}
	@Test
	public void testAddSpaces_1()
	{
		String str = "Many.";		
		String res = HW9_3.addSpaces(str);
		assertEquals(res,str);
	}
	@Test
	public void testAddSpaces_2()
	{
		String str = "Many,, symb";		
		String res = HW9_3.addSpaces(str);	
		assertEquals(res,str);
	}
	@Test
	public void testAddSpaces_many()
	{
		String str = "Many, symb,and";		
		String res = HW9_3.addSpaces(str);
		assertEquals(res,"Many, symb, and");
	}

	//=====================
	//oneInstance
	//=====================
	
	@Test (expected = IllegalArgumentException.class)
	public void testOneInstance_null()
	{
		String str = null;
		HW9_3.oneInstance(str);
	}
	@Test
	public void testOneInstance_0()
	{
		String str = "";		
		String res = HW9_3.oneInstance(str);	
		assertEquals(res,str);
	}
	@Test
	public void testOneInstance_1()
	{
		String str = "Many.";		
		String res = HW9_3.oneInstance(str);
		assertEquals(res,str);
	}
	@Test
	public void testOneInstance_2()
	{
		String str = "Many,, symb";		
		String res = HW9_3.oneInstance(str);	
		assertEquals(res,"Many, smb");
	}
	@Test
	public void testOneInstance_many()
	{
		String str = "Many, symb,and";		
		String res = HW9_3.oneInstance(str);
		assertEquals(res,"Many, smbd");
	}
	
	//=====================
	//countOfWord
	//=====================
	
	@Test (expected = IllegalArgumentException.class)
	public void testCountOfWord_null()
	{
		String str = null;
		HW9_3.countOfWord(str);
	}
	@Test
	public void testCountOfWord_0()
	{
		String str = "";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,0);
	}
	@Test
	public void testCountOfWord_1()
	{
		String str = "One";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,1);
	}
	@Test
	public void testCountOfWord_2()
	{
		String str = "One two";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,2);
	}
	@Test
	public void testCountOfWord_many()
	{
		String str = "One two three";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,3);
	}
	
	//=====================
	//deleteSymbol
	//=====================
	
	@Test (expected = IllegalArgumentException.class)
	public void testDeleteSymbol_null()
	{
		String str = null;
		HW9_3.deleteSymbol(1, 1, str);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDeleteSymbol_0()
	{
		String str = "";
		HW9_3.deleteSymbol(0, 0, str);
	}
	@Test
	public void testDeleteSymbol_1()
	{
		String str = "many";
		String res = HW9_3.deleteSymbol(1, 2, str);
		assertEquals(res,"my");
	}
	@Test
	public void testDeleteSymbol_2()
	{
		String str = "many symb";
		String res = HW9_3.deleteSymbol(1, 4, str);
		assertEquals(res,"msymb");
	}
	@Test
	public void testDeleteSymbol_many()
	{
		String str = "many symb very";
		String res = HW9_3.deleteSymbol(1, 4, str);
		assertEquals(res,"msymb very");
	}
	
	//======================
	//reverseString
	//======================
	
	@Test (expected = IllegalArgumentException.class)
	public void testReverseString_null()
	{
		String str = null;
		HW9_3.reverseString(str);
	}
	@Test 
	public void testReverseString_0()
	{
		String str = "";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"");
	}
	@Test
	public void testReverseString_1()
	{
		String str = "many";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"ynam");
	}
	@Test
	public void testReverseString_2()
	{
		String str = "many symb";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"bmys ynam");
	}
	@Test
	public void testReverseString_many()
	{
		String str = "many symb very";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"yrev bmys ynam");
	}
	
	//=====================
	//deleteLastWord
	//=====================
	
	@Test (expected = IllegalArgumentException.class)
	public void testDeleteLastWord_null()
	{
		String str = null;
		HW9_3.deleteLastWord(str);
	}
	@Test 
	public void testDeleteLastWord_0()
	{
		String str = "";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"");
	}
	@Test
	public void testDeleteLastWord_1()
	{
		String str = "many";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"many");
	}
	@Test
	public void testDeleteLastWord_2()
	{
		String str = "many symb";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"many");
	}
	@Test
	public void testDeleteLastWord_many()
	{
		String str = "many symb very";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"many symb");
	}
}
