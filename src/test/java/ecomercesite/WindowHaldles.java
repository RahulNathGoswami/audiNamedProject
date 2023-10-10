package ecomercesite;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHaldles {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();

		String parentID = driver.getWindowHandle();

		WebElement button = driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]"));

		button.click();

		Set<String> childID = driver.getWindowHandles();

		for (String r : childID) {

			if (!parentID.equals(r)) {

				driver.switchTo().window(r);

			WebElement text =	driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
				
			text.sendKeys("Rahul Nath Goswami");
			}

		}

	}
}
