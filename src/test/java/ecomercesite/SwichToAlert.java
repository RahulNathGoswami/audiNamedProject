package ecomercesite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichToAlert {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.manage().window().maximize();

		WebElement clickme = driver.findElement(By.xpath("id=\"promptBox\""));

		clickme.click();

		Alert a = driver.switchTo().alert();

		a.sendKeys("hello");
		a.accept();
	}
}
