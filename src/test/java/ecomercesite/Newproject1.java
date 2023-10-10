package ecomercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Newproject1 {

	public static void main(String[] args) {
	
		
		WebDriver driver = new EdgeDriver(); 
		

	driver.get("https://www.hyrtutorials.com/");
	
	driver.manage().window().maximize();
	
	
	}

}
