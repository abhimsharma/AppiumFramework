import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demoSelenium {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object for chrome driver
		// we will strictly implement methods of webdriver
		/* 
		  Class name = ChromeDriver();
		  x driver = new x();
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");// hit url on the browser
		System.out.println(driver.getTitle());// valiate if your page title is correct
		System.out.println(driver.getCurrentUrl());// validte if you are landed on correct url
		//System.out.println(driver.getPageSource());//shows complete page source code
		driver.get("https://yahoo.com");
		driver.navigate().back();//navigate back to the previous page
		//navigate().forward() is used to forward to next page
		driver.close();//closes current browser
		driver.quit();//closes all the pages opened by selenium script
	}

}
 