package hrms_tc;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001 {
  //public static void main(String args[]) {
	
@Test	
public void tc001 () {	
	System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Driver\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println(driver.getTitle());
	Reporter.log(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println(driver.getTitle());
	Reporter.log(driver.getTitle());
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
