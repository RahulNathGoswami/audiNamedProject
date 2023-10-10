package ecomercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognitomode {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions(); ///New Selium run in  browser code
		opt.addArguments("--remote-allow-origins=*");
		//option.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.manage().window().maximize();

	}

}
