package assign2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Launch10 {
	static WebDriver driver;
	public static void takeScreenshot(String fileName) throws IOException {
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(f, new File("C:\\vaishu\\"+fileName+".jpg"));
	}
	
	 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		WebElement d = driver.findElement(By.linkText("Draggable"));
		d.click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable = driver .findElement(By.id("draggable"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(draggable, 150, 100).perform();
		Thread.sleep(2000);
		driver.close();
		

	}
	
		
	
	}


