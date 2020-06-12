import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromeBrowser {
	
public static void main(String args[]) {
	
		// TODO Auto-generated method stub
        
	System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("This is my first code");//takes you to the emailid box and writes the sentence
        driver.findElement(By.name("pssword")).sendKeys("abhi1234");
        driver.findElement(By.linkText("Forgotten account?")).click();
        
}

}
