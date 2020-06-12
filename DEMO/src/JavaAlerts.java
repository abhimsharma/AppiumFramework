import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Abhishek";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("rahulshettyacademy.com/AutomationPractice.");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();//important 
		System.out.println(driver.switchTo().alert().getText());

	}

}
