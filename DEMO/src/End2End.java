import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		if(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("0.5")) {
			System.out.println("Disabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("3");
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s1.selectByVisibleText("INR");
		
		driver.findElement(By.cssSelector(".ctl00$mainContent$btn_FindFlights")).click();

		
	}

}
