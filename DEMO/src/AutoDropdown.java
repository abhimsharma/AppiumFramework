import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in");
		WebElement source = driver.findElement(By.id("fromPlaceName"));
		source.clear();
		source.sendKeys("Bang"); //should select bangalore
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.id("toPlaceName"));
		destination.sendKeys("Che");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
		
}

}