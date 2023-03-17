package assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("vaishnaviharika944@gmail.com");
		WebElement pwd = driver.findElement(By.name("passwd"));
		pwd.sendKeys("Selenium@123");
		WebElement signin = driver.findElement(By.name("SubmitLogin"));
		signin.click();
		driver.close();
		
	}

}
