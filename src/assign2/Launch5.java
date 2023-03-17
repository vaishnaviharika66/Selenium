package assign2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch5 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		WebElement table = driver.findElement(By.className("dataTable"));
		Thread.sleep(20000);

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		if (rows.size() > 1) {
			for (int i = 1; i < rows.size(); i++) {
				List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
				String companyName = cells.get(0).getText();

				System.out.println(companyName);
			}
		} else {
			System.out.println("No companies found in the table.");

		}
		driver.close();
	}
}
