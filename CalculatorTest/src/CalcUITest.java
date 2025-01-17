import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalcUITest
{
	static WebDriver drv = new FirefoxDriver();
	@BeforeClass
	public static void testBeforeClass()
	{
		drv.get("file:///E:/Workspace2/Calculator/Calculator.html");
	}
	@Before
	public void testBefore()
	{
		drv.navigate().refresh();
	}
	//========================
	//Availability
	//========================
	@Test
	public void testAvail_res()
	{	
		boolean b = drv.findElement(By.id("res")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_1()
	{	
		boolean b = drv.findElement(By.id("btn1")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_2()
	{	
		boolean b = drv.findElement(By.id("btn2")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_3()
	{	
		boolean b = drv.findElement(By.id("btn3")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_4()
	{	
		boolean b = drv.findElement(By.id("btn4")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_5()
	{	
		boolean b = drv.findElement(By.id("btn5")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_6()
	{	
		boolean b = drv.findElement(By.id("btn6")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_7()
	{	
		boolean b = drv.findElement(By.id("btn7")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_8()
	{	
		boolean b = drv.findElement(By.id("btn8")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_9()
	{	
		boolean b = drv.findElement(By.id("btn9")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_0()
	{	
		boolean b = drv.findElement(By.id("btn0")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_plus()
	{	
		boolean b = drv.findElement(By.id("btnPlus")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_min()
	{	
		boolean b = drv.findElement(By.id("btnMin")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_mult()
	{	
		boolean b = drv.findElement(By.id("btnMult")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_div()
	{	
		boolean b = drv.findElement(By.id("btnDiv")).isEnabled();
		assertEquals(true,b);
	}
	@Test
	public void testAvail_eq()
	{	
		boolean b = drv.findElement(By.id("btnEq")).isEnabled();
		assertEquals(true,b);
	}
	//========================
	//Simple job
	//========================
	@Test
	public void testSimple_1()
	{
		drv.findElement( By.id("btn1")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("1",act);
	}
	@Test
	public void testSimple_2()
	{
		drv.findElement( By.id("btn2")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("2",act);
	}
	@Test
	public void testSimple_3()
	{
		drv.findElement( By.id("btn3")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("3",act);
	}
	@Test
	public void testSimple_4()
	{
		drv.findElement( By.id("btn4")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("4",act);
	}
	@Test
	public void testSimple_5()
	{
		drv.findElement( By.id("btn5")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("5",act);
	}
	@Test
	public void testSimple_6()
	{
		drv.findElement( By.id("btn6")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("6",act);
	}
	@Test
	public void testSimple_7()
	{
		drv.findElement( By.id("btn7")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("7",act);
	}
	@Test
	public void testSimple_8()
	{
		drv.findElement( By.id("btn8")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("8",act);
	}
	@Test
	public void testSimple_9()
	{
		drv.findElement( By.id("btn9")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("9",act);
	}
	@Test
	public void testSimple_0()
	{
		drv.findElement( By.id("btn0")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("0",act);
	}
	@Test
	public void testSimple_clear()
	{
		drv.findElement( By.id("btnclear")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testSimple_plus()
	{
		drv.findElement( By.id("btnPlus")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testSimple_min()
	{
		drv.findElement( By.id("btnMin")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testSimple_mult()
	{
		drv.findElement( By.id("btnMult")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testSimple_div()
	{
		drv.findElement( By.id("btnDiv")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testSimple_eq()
	{
		drv.findElement( By.id("btnEq")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);

	}

	//===================
	//Complex Job
	//===================
	@Test
	public void testComplex_123()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn3")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("123",act);
	}
	@Test
	public void testComplex_12345Eq()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnEq")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("12345",act);
	}
	@Test
	public void testComplex_12345Plus()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnPlus")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testComplex_12345Min()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnMin")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testComplex_12345Mult()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnMult")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testComplex_12345Div()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnDiv")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("",act);
	}
	@Test
	public void testComplex_12Eq345()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("12345",act);
	}
	@Test
	public void testComplex_12Plus345()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("345",act);
	}
	@Test
	public void testComplex_12Min345()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnMin")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("345",act);
	}
	@Test
	public void testComplex_12Mult345()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnMult")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("345",act);
	}
	@Test
	public void testComplex_12Div345()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn5")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("345",act);
	}

	//=======================
	//Real Job
	//=======================
	@Test
	public void testReal_plus()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("3",act);
	}
	@Test
	public void testReal_min()
	{
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btnMin")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("1",act);
	}
	@Test
	public void testReal_mult()
	{
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btnMult")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("6",act);
	}
	@Test
	public void testReal_div()
	{
		drv.findElement(By.id("btn6")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("3",act);
	}

	@AfterClass
	public static void testAfterClass()
	{
		drv.close();
	}

}
