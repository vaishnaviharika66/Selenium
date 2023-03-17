package assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch8 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver(); 
    driver.get("https://demo.guru99.com/test/guru99home/");

       driver.manage().window().maximize();
       driver.switchTo().frame("a077aa5e"); 

		System.out.println("We are switch to the iframe");
 		driver.findElement(By.xpath("html/body/a/img")).click();
 		Thread.sleep(2000);
		  
   
			System.out.println("We are done");
  }
}	


