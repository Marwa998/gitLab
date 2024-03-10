import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCase {
	WebDriver driver= new ChromeDriver();
@BeforeTest
public void MySetUp() {
	String myURL="https://www.saucedemo.com/";
	driver.get(myURL);
	
			
}
@Test
public void Login() throws InterruptedException {
driver.findElement(By.id("user-name")).sendKeys("standard_user\r\n"+ "");	
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();

}


}