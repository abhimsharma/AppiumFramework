import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class CustomCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abhishek");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();

	}

}
