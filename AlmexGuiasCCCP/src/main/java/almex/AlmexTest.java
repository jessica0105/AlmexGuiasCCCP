package almex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import comun.LeerProperties;
//import org.openqa.selenium.chrome.ChromeDriver;

public class AlmexTest {
public static Logger log = Logger.getLogger(AlmexTest.class);
static LeerProperties prop = new LeerProperties();

	public static void main(String[] args) {

		String rutaEdge = System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", rutaEdge);
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--inprivate");
		WebDriver driver = new EdgeDriver(option);
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait (20, TimeUnit.MILLISECONDS);
		prop.getSystemProperties();
		
		driver.get(System.getProperty("URLCONSOLIDADO"));	
		///WebElement txt_usuarioById = driver.findElement(By.id("txtUserName"));
		//txt_usuarioById.sendKeys("sa");
		driver.findElement(By.id("txtUserName")).sendKeys("sa");
		// txt_usuarioById.clear();
		//driver.findElement(By.id("txtPassword")).sendKeys("qa");
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		txt_passwordById.sendKeys("qa");
		txt_passwordById.sendKeys(Keys.ENTER);

		WebElement select_areausuariosById = driver.findElement(By.id("ddlListaAreasUsuarios"));
		select_areausuariosById.click();
		WebElement area =driver.findElement(By.xpath("//*[@id=\"ddlListaAreasUsuarios\"]/option[70]"));
		area.click();
		//#ddlListaAreasUsuarios > option:nth-child(70)
		//Select dropdown=new Select (area);
		// dropdown.selectByIndex(2);
		
		
		try {
			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
			if(link_welcome.getSize()!=null ) {
				System.out.println("Login fue exitoso");
			}
		} catch(NoSuchElementException e) {
			System.out.println("El login no fue exitoso");
		}
		
		
		//log.info("Se abrirá un URL");
		//driver.get("http://qalis.almex.com.mx/Consolidado_Almex/login.aspx?ReturnUrl=%2fConsolidado_Almex%2fdefault.aspx");	
	
		
		/*String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");*/
		//
	}

	/*private static void sendKeys(Keys enter) {
		// TODO Auto-generated method stub
		
	}*/

}//end class