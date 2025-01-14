import static org.junit.Assert.*;

import org.junit.Test;

public class AList0Test 
{
	//======================
	//Size
	//======================

	@Test
	public void testSize_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int exp = 6;
		int act = rr.size();	
		assertEquals(exp, act);
	}
	@Test
	public void testSize_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int exp = 2;
		int act = rr.size();		
		assertEquals(exp, act);
	}
	@Test
	public void testSize_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int exp = 1;
		int act = rr.size();
		assertEquals(exp, act);
	}
	@Test 
	public void testSize_0()
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int exp = 0;
		int act = rr.size();
		assertEquals(exp,act);
	}
	@Test 
	public void testSize_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		int exp = 0;
		int act = rr.size();
		assertEquals(exp,act);
	}

	//==================
	//Clear
	//===================
	@Test 
	public void testClear_many()
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		rr.clear();
		int[] exp = {};
		int[] act = rr.toArray();	
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_2()
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		rr.clear();
		int[] exp = {};
		int[] act = rr.toArray();	
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_1()
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		rr.clear();
		int[] exp = {};
		int[] act = rr.toArray();	
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_0()
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.clear();
		int[] exp = {};
		int[] act = rr.toArray();	
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.clear();
		int[] exp = {};
		int[] act = rr.toArray();	
		assertArrayEquals(exp, act);
	}

	//======================
	//toArray
	//=====================

	@Test
	public void testToArray_many()
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int[] exp = {10,20,30,88,41,65};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testToArray_2()
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int[] exp = {10,20};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testToArray_1()
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test 
	public void testToArray_0()
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test 
	public void testToArray_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.toArray();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);

	}

	//======================
	//toString
	//======================

	@Test
	public void testToString_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		String exp = "{10, 20, 30, 88, 41, 65}";
		String act = rr.toString();
		assertEquals(exp,act);
	}
	@Test
	public void testToString_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		String exp = "{10, 20}";
		String act = rr.toString();
		assertEquals(exp,act);
	}
	@Test
	public void testToString_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		String exp = "{10}";
		String act = rr.toString();
		assertEquals(exp,act);
	}
	@Test
	public void testToString_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		String exp = "{}";
		String act = rr.toString();
		assertEquals(exp,act);
	}
	@Test
	public void testToString_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		String exp = "{}";
		String act = rr.toString();
		assertEquals(exp,act);
	}

	//=====================
	//addStart
	//=====================

	@Test
	public void testAddStart_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int add = 55;		
		rr.addStart(add);
		int s = rr.size();
		assertEquals(7,s);
		int[] exp = {55,10,20,30,88,41,65};
		int[] act = rr.toArray();		
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddStart_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addStart(add);
		int s = rr.size();
		assertEquals(3,s);
		int[] exp = {55,10,20};
		int[] act = rr.toArray();	
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddStart_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addStart(add);
		int s = rr.size();
		assertEquals(2,s);
		int[] exp = {55,10};
		int[] act = rr.toArray();		
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddStart_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addStart(add);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {55};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddStart_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		int add = 55;
		rr.addStart(add);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {55};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);

	}

	//======================
	//addEnd
	//======================

	@Test
	public void testAddEnd_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int s = rr.size();
		assertEquals(7,s);
		int[] exp = {10,20,30,88,41,65,55};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddEnd_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int s = rr.size();
		assertEquals(3,s);
		int[] exp = {10,20,55};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddEnd_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int s = rr.size();
		assertEquals(2,s);
		int[] exp = {10,55};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {55};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {55};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	//======================
	//addPos
	//======================

	@Test
	public void testAddPos_many()
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;		
		rr.addPos(pos, val);
		int s = rr.size();
		assertEquals(7,s);
		int[] exp= {10,20,55,30,88,41,65};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddPos_2()
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;		
		rr.addPos(pos, val);
		int s = rr.size();
		assertEquals(3,s);
		int[] exp = {10,20,55};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testAddPos_1()
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int val = 55;		
		rr.addPos(pos, val);
		int s = rr.size();
		assertEquals(2,s);
		int[] exp = {10,55};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testAddPos_1exc()
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;		
		rr.addPos(pos, val);
	}
	@Test 
	public void testAddPos_0()
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int val = 55;		
		rr.addPos(pos, val);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {55};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testAddPos_0exc()
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int pos = -2;
		int val = 55;		
		rr.addPos(pos, val);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testAddPos_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;
		rr.addPos(pos,val);
	}

	//======================
	//delStart
	//======================


	@Test
	public void testDelStart_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int resVal = rr.delStart();
		assertEquals(10,resVal);
		int s = rr.size();
		assertEquals(5,s);
		int[] exp = {20,30,88,41,65};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testDelStart_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int resVal = rr.delStart();
		assertEquals(10,resVal);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {20};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testDelStart_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int resVal = rr.delStart();
		assertEquals(10,resVal);
		int s = rr.size();
		assertEquals(0,s);
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelStart_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.delStart();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelStart_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.delStart();
	}

	//======================
	//delEnd
	//======================

	@Test
	public void testDelEnd_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int resVal = rr.delEnd();
		assertEquals(65,resVal);
		int s = rr.size();
		assertEquals(5,s);
		int[] exp = {10,20,30,88,41};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);;
	}
	@Test
	public void testDelEnd_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int resVal = rr.delEnd();
		assertEquals(20,resVal);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testDelEnd_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int resVal = rr.delEnd();
		assertEquals(10,resVal);
		int s = rr.size();
		assertEquals(0,s);
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelEnd_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.delEnd();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelEnd_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.delEnd();
	}

	//======================
	//delPos
	//======================

	@Test
	public void testDelPos_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int resVal = rr.delPos(pos);
		assertEquals(30,resVal);
		int s = rr.size();
		assertEquals(5,s);
		int[] exp = {10,20,88,41,65};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);

	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testDelPos_manyExc()
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = -7;
		rr.delPos(pos);
	}
	@Test
	public void testDelPos_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int resVal = rr.delPos(pos);
		assertEquals(20,resVal);
		int s = rr.size();
		assertEquals(1,s);
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testDelPos_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int resVal = rr.delPos(pos);
		assertEquals(10,resVal);
		int s = rr.size();
		assertEquals(0,s);
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelPos_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.delPos(pos);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelPos_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.delPos(pos);
	}

	//======================
	//set
	//======================

	@Test
	public void testSet_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 3;
		rr.set(pos, val);
		int[] exp = {10,20,3,88,41,65};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_manyExc() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 7;
		int val = 3;
		rr.set(pos, val);
	}
	@Test
	public void testSet_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int val = 3;
		rr.set(pos, val);
		int[] exp = {10,3};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testSet_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int val = 3;
		rr.set(pos, val);
		int[] exp = {3};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int val = 3;		
		rr.set(pos, val);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		int pos = 3;
		int val = 3;
		rr.set(pos, val);
	}

	//======================
	//get
	//======================

	@Test
	public void testGet_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 3;
		int act = rr.get(pos);
		assertEquals(88,act);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_manyExc() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 7;
		rr.get(pos);;
	}
	@Test
	public void testGet_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int act = rr.get(pos);
		assertEquals(20,act);
	}
	@Test
	public void testGet_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int res = rr.get(pos);
		assertEquals(10,res);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.get(pos);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.get(pos);
	}

	//======================
	//minElem
	//======================

	@Test
	public void testMinElem_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int min = rr.minElem();
		assertEquals(10,min);
	}
	@Test
	public void testMinElem_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int min = rr.minElem();
		assertEquals(10,min);
	}
	@Test
	public void testMinElem_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int min = rr.minElem();
		assertEquals(10,min);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.minElem();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.minElem();
	}

	//======================
	//maxElem
	//======================

	@Test
	public void testMaxElem_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int max = rr.maxElem();
		assertEquals(88,max);
	}
	@Test
	public void testMaxElem_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int max = rr.maxElem();
		assertEquals(20,max);
	}
	@Test
	public void testMaxElem_1() 
	{
		int[] ar = {20};
		AList0 rr = new AList0(ar);
		int max = rr.maxElem();
		assertEquals(20,max);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.maxElem();	
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.maxElem();	
	}
	//======================
	//minInd
	//======================

	@Test
	public void testMinInd_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int min = rr.minInd();
		assertEquals(0,min);
	}
	@Test
	public void testMinInd_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int min = rr.minInd();
		assertEquals(0,min);
	}
	@Test
	public void testMinInd_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int min = rr.minInd();
		assertEquals(0,min);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.minInd();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.minInd();
	}

	//======================
	//maxInd
	//======================

	@Test
	public void testMaxInd_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int max = rr.maxInd();
		assertEquals(3,max);
	}
	@Test
	public void testMaxInd_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		int max = rr.maxInd();
		assertEquals(1,max);
	}
	@Test
	public void testMaxInd_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		int max = rr.maxInd();
		assertEquals(0,max);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.maxInd();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.maxInd();
	}

	//======================
	//reverse
	//======================

	@Test
	public void testReverse_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		rr.reverse();
		int[] exp = {65,41,88,30,20,10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverse_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		rr.reverse();
		int[] exp = {20,10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverse_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		rr.reverse();
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverse_0()
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.reverse();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverse_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.reverse();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}

	//======================
	//reverseHalf
	//======================

	@Test
	public void testReverseHalf_many() 
	{
		int[] ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int[] exp = {88,41,65,10,20,30};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverseHalf_manyOdd() 
	{
		int[] ar = {10,20,30,88,41,65,71};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int[] exp = {41,65,71,88,10,20,30};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverseHalf_2() 
	{
		int[] ar = {10,20};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int[] exp = {20,10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverseHalf_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverseHalf_0()
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testReverseHalf_null()
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}

	//======================
	//sortSelect
	//======================

	@Test
	public void testSort_many() 
	{
		int[] ar = {10,20,30,88,41,65,71};
		AList0 rr = new AList0(ar);
		rr.sort();
		int[] exp = {10,20,30,41,65,71,88};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testSort_2() 
	{
		int[] ar = {20,10};
		AList0 rr = new AList0(ar);
		rr.sort();
		int[] exp = {10,20};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testSort_1() 
	{
		int[] ar = {10};
		AList0 rr = new AList0(ar);
		rr.sort();
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testSort_0() 
	{
		int[] ar = {};
		AList0 rr = new AList0(ar);
		rr.sort();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testSort_null() 
	{
		int[] ar = null;
		AList0 rr = new AList0(ar);
		rr.sort();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp,act);
	}
}
