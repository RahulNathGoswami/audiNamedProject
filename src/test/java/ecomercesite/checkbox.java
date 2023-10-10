package ecomercesite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// WebElement check =driver.findElement(By.xpath("//input[@id='englishchbx']"));
	
//	check.click();
	
	List<WebElement> Allcheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement e :Allcheckbox) {
	 String roo =  e.getText();
		
if(roo.equals("Hindi")) {
	e.click();
}
	}
}
	
	
}
