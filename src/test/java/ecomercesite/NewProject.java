package ecomercesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProject {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/");

		driver.manage().window().maximize();

		WebElement contact = driver
				.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/p/contactus.html\"]"));

		contact.click();

		WebElement username = driver.findElement(By.xpath("//input[@class=\"contact-form-name\"]"));

		username.sendKeys("rahul nath");

		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));

		email.sendKeys("r.grahul@1998@gmail.com");

		WebElement message = driver.findElement(By.xpath("//textarea[@class=\"contact-form-email-message\"]"));
		message.sendKeys("hello everyone");

		
	}

}
