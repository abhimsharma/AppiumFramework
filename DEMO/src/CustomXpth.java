import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class CustomXpth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
