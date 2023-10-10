package ecomercesite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdwn {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");

		driver.manage().window().maximize();

		WebElement dropbutton = driver.findElement(By.xpath("//button[@class=\"btn btn-default dropdown-toggle\"]"));
		dropbutton.click();

		List<WebElement> dropwn = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li/a"));

		for (WebElement a : dropwn) {

			String value = a.getText();

			System.out.println(value);

		}

	}

}
