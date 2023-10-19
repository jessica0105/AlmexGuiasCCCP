package almex;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlmexTest {

	public static void main(String[] args) {

		String rutaEdge = System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", rutaEdge);
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");	
		
		/*String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");*/
	}

}