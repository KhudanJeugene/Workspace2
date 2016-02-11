import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCalculatorIDE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "file:///E:/Workspace2/SimpleCalculator/src/main/resources/Calculator.html";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCalculatorIDE() throws Exception {
    driver.get(baseUrl + "file:///E:/Workspace2/SimpleCalculator/src/main/resources/Calculator.html");
    driver.findElement(By.id("1")).click();
    driver.findElement(By.id("2")).click();
    driver.findElement(By.id("3")).click();
    driver.findElement(By.id("+")).click();
    driver.findElement(By.id("5")).click();
    driver.findElement(By.id("6")).click();
    driver.findElement(By.id("3")).click();
    driver.findElement(By.id("=")).click();
    driver.findElement(By.id("5")).click();
    driver.findElement(By.id("6")).click();
    driver.findElement(By.id("3")).click();
    driver.findElement(By.id("/")).click();
    driver.findElement(By.id("4")).click();
    driver.findElement(By.id("5")).click();
    driver.findElement(By.id("=")).click();
    driver.findElement(By.id("clear")).click();
    driver.findElement(By.id("4")).click();
    driver.findElement(By.id("5")).click();
    driver.findElement(By.id("2")).click();
    driver.findElement(By.id("+")).click();
    driver.findElement(By.id("6")).click();
    driver.findElement(By.id("5")).click();
    driver.findElement(By.id("3")).click();
    driver.findElement(By.id("=")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

