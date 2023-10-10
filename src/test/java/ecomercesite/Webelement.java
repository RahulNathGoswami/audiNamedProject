package ecomercesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.xpath("//a[@id=\"navbtn_exercises\"]"));

		text.click();

	}

}
