package assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch9 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click.click();
		String mainWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("vaishnaviharika918@gmail.com");
		WebElement sub = driver.findElement (By.name("btnLogin"));
		sub.click();
		Thread.sleep(2000);
		driver.close();	
		driver.switchTo().window(mainWindowHandle);
	}

}
