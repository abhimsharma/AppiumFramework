import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         driver.get("https://salesforce.com");
         driver.findElement(By.linkText("Login")).click();
         driver.findElement(By.id("username")).sendKeys("abhishek");
         driver.findElement(By.name("pw")).sendKeys("1234678");
         driver.findElement(By.linkText("Login")).click();

	}

	
}
