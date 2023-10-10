package ecomercesite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realcheckbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	
      int r =  allcheckbox.size();
		
		for(int i=0;i<r;i++) {
			
		//	allcheckbox.get(i).click();
			 
			if( allcheckbox.get(i).getAttribute("id").equals("englishchbx")||allcheckbox.get(i).getAttribute("id").equals("frenchchbx")   ) {
				
				allcheckbox.get(i).click();
			
		}
		
		
		}
		
		
	}

}
