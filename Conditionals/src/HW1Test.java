import static org.junit.Assert.*;

import org.junit.Test;

public class HW1Test
{
	//==================
	//MultOrAdd
	//==================
	@Test
	public void MultOrAdd_Even()
	{
		int res = HW1.MultOrAdd(2, 4);
		assertEquals(8, res);
	}
	@Test
	public void MultOrAdd_Odd()
	{
		int res = HW1.MultOrAdd(1, 4);
		assertEquals(5, res);
	}
	@Test
	public void MultOrAdd_0()
	{
		int res = HW1.MultOrAdd(0, 4);
		assertEquals(0, res);
	}
	@Test
	public void MultOrAdd_Negative()
	{
		int res = HW1.MultOrAdd(-1, 0);
		assertEquals(-1, res);
	}
	
	//===================
	//quater
	//===================
	@Test
	public void quaterTest_1()
	{
		int res=HW1.quater(1, 1);
		assertEquals(1, res);
	}
	@Test
	public void quaterTest_2()
	{
		int res=HW1.quater(-1, 1);
		assertEquals(2, res);
	}
	@Test
	public void quaterTest_3()
	{
		int res=HW1.quater(-1, -1);
		assertEquals(3, res);
	}
	@Test
	public void quaterTest_4()
	{
		int res=HW1.quater(1, -1);
		assertEquals(4, res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void quaterTest_0()
	{
		HW1.quater(0, 0);
	}	
	
	//=================
	//doSum
	//=================
	
	@Test
	public void testDoSum_AllPos() 
	{
		int res = HW1.doSum(1, 1, 1);
		assertEquals(3, res);
	}
	@Test
	public void testDoSum_APos() 
	{
		int res = HW1.doSum(-1, 1, 1);
		assertEquals(2, res);
	}
	@Test
	public void testDoSum_BPos() 
	{
		int res = HW1.doSum(1, -1, 1);
		assertEquals(2, res);
	}
	@Test
	public void testDoSum_CPos() 
	{
		int res = HW1.doSum(1, 1, -1);
		assertEquals(2, res);
	}
	@Test
	public void testDoSum_ABPos() 
	{
		int res = HW1.doSum(-1, -1, 1);
		assertEquals(1, res);
	}

	@Test
	public void testDoSumBCPos() 
	{
		int res = HW1.doSum(1, -1, -1);
		assertEquals(1, res);
	}
	@Test
	public void testDoSumACPos() 
	{
		int res = HW1.doSum(-1, 1, -1);
		assertEquals(1, res);
	}

	public void testDoSumAll0() 
	{
		int res = HW1.doSum(0, 0, 0);
		assertEquals(0, res);
	}
	@Test 
	public void testDoSumAllNeg() 
	{
		int res = HW1.doSum(-1, -1, -1);
		assertEquals(0,res);
	}
	
	//===================
	//calc
	//===================
	
	@Test
	public void testCalc_equals()
	{
		int res= HW1.Calc(1, 2, 3);
		assertEquals(9, res);
	}
	@Test
	public void testCalc_MultMore()
	{
		int res= HW1.Calc(1, 2, 4);
		assertEquals(11, res);
	}
	@Test
	public void testCalc_SumMore()
	{
		int res= HW1.Calc(-1, 2, 3);
		assertEquals(7, res);
	}
	@Test
	public void testCalc_All0()
	{
		int res= HW1.Calc(0, 0, 0);
		assertEquals(3, res);
	}
	
	//====================
	//calcEval
	//====================

	@Test (expected = IllegalArgumentException.class)
	public void testCalcEval_0()
	{	
		HW1.calcEval(0);	
	}
	@Test
	public void testCalcEval_1()
	{
		char res = HW1.calcEval(1);
		assertEquals('F',res);
	}
	@Test
	public void testCalcEval_4() 
	{
		char res = HW1.calcEval(4);
		assertEquals('F',res);
	}
	@Test
	public void testCalcEval_19() 
	{
		char res = HW1.calcEval(19);
		assertEquals('F',res);
	}
	@Test
	public void testCalcEval_20() 
	{
		char res = HW1.calcEval(20);
		assertEquals('E',res);
	}
	@Test
	public void testCalcEval_30() 
	{
		char res = HW1.calcEval(30);
		assertEquals('E',res);
	}
	@Test
	public void testCalcEval_39() 
	{
		char res = HW1.calcEval(39);
		assertEquals('E',res);
	}
	@Test
	public void testCalcEval_40() 
	{
		char res = HW1.calcEval(40);
		assertEquals('D',res);
	}
	@Test
	public void testCalcEval_50() 
	{
		char res = HW1.calcEval(50);
		assertEquals('D',res);
	}
	@Test
	public void testCalcEval_59() 
	{
		char res = HW1.calcEval(59);
		assertEquals('D',res);
	}
	@Test
	public void testCalcEval_60() 
	{
		char res = HW1.calcEval(60);
		assertEquals('C',res);
	}
	@Test
	public void testCalcEval_70() 
	{
		char res = HW1.calcEval(70);
		assertEquals('C',res);
	}
	@Test
	public void testCalcEval_74() 
	{
		char res = HW1.calcEval(74);
		assertEquals('C',res);
	}
	@Test
	public void testCalcEval_75() 
	{
		char res = HW1.calcEval(75);
		assertEquals('B',res);
	}
	@Test
	public void testCalcEval_80() 
	{
		char res = HW1.calcEval(80);
		assertEquals('B',res);
	}
	@Test
	public void testCalcEval_89() 
	{
		char res = HW1.calcEval(89);
		assertEquals('B',res);
	}
	@Test
	public void testCalcEval_90() 
	{
		char res = HW1.calcEval(90);
		assertEquals('A',res);
	}
	@Test
	public void testCalcEval_95() 
	{
		char res = HW1.calcEval(95);
		assertEquals('A',res);
	}
	@Test
	public void testCalcEval_100() 
	{
		char res = HW1.calcEval(100);
		assertEquals('A',res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalcEval_101() 
	{
		HW1.calcEval(101);		
	}
}
