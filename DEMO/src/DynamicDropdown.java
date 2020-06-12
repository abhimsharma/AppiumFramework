import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		/*
		 this chennai xpath can also be written using the parent child xpth concept
		 wrtie xpath for the whole dropdown and give space and and give xpath of the chennai
		 i.e., //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] 
		 */
	}

}
