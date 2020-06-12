import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//div[@class='SDkEP']/div/div[2]/input")).sendKeys("Sachin");
		driver.findElement(By.linkText("Google Search")).click();
	}

}
