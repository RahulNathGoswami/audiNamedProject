package ecomercesite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");

	    driver.manage().window().maximize();
	    
	    
	  WebElement button =   driver.findElement(By.xpath("//button[@type=\"button\"]"));
        	button.click();
			List<WebElement> drop =     driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li/a"));
        	
        	for(WebElement r: drop) {
        	
	    String value =      r.getText();
	          
	if(value.equals("JavaScript")     ) {
	r.click();
	break;
	}}
	
	}

}
