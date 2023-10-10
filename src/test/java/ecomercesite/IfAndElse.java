package ecomercesite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfAndElse {

	

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");

		driver.manage().window().maximize();

		WebElement down = driver.findElement(By.xpath("//button[@type=\"button\"]"));

		down.click();

		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li/a"));

		for (WebElement e : dropdown) {

			String value = e.getText();

			if (value.equals("javaScript")) {
				e.click();
				break;
			}

		}

	}
}