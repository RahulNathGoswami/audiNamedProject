package ecomercesite;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowhendel {
 public static void main(String[] args) {
	
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	  driver.manage().window().maximize();
	  
	  
	 String parentID = driver.getWindowHandle();
	          
	 WebElement btn= driver.findElement(By.xpath("//button[@id=\"newTabsBtn\"]"));
	 
btn.click();	 
	 
	 
	  Set<String> allwindow =  driver.getWindowHandles();
	 
	 for(String r: allwindow) {
		 
		 if(!parentID.equals(r)) {
		 
		 driver.switchTo().window(r);
		 
	String title =	 driver.getTitle();
		 if(title.contains("AlertsDemo")) {
			 
			 
		WebElement fieldd =	  driver.findElement(By.xpath("//button[@id=\"alertBox\"]"));
			 
			 fieldd.click();
			 
		Alert ok= driver.switchTo().alert();
			 
			 ok.accept();
			 
			 break;
		 }	 
}
}
}}