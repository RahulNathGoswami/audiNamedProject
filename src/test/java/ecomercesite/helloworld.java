package ecomercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	}

}
