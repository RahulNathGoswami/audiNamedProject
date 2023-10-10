package ecomercesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectNewLook {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));

		username.sendKeys("rahul");

		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));

		lastname.sendKeys("nath goswami");

		WebElement radiobtn = driver.findElement(By.xpath("//input[@class=\"bcRadioButton\"]"));

		radiobtn.click();

		WebElement option = driver.findElement(By.xpath("//input[@id=\"englishchbx\"]"));

		option.click();

		WebElement option1 = driver.findElement(By.xpath("//input[@id=\"hindichbx\"]"));

		option1.click();

		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));

		email.sendKeys("rahul.123@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));

		password.sendKeys("1234567890");

		WebElement clear = driver.findElement(By.xpath("//button[@id=\"clearbtn\"]"));

		clear.click();

		driver.close();

	}
}