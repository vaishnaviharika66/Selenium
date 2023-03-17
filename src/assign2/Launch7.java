package assign2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch7 {

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("vaishu");
		driver.findElement(By.name("submit")).submit();
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertmessage");
		alert.accept();
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	

	}

}
