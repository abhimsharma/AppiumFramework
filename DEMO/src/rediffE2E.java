import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rediff.com");
        
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("Abhishek");
        driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("123456");
        driver.findElement(By.cssSelector(".signinbtn")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\'div_login_error\']/b")).getText());
        driver.close(); 
	}

}
