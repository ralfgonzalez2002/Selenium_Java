package Edit.EducacionITPractica1;
import org.testng.annotations.Test;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Laboratorio1 {
	@Test
	public void lab1_E1() {
		// Configuracion de propiedades del driver
		System.setProperty("webdriver.chrome.driver", "../EducacionITPractica1/Drivers/chromedriver.exe");
		
		//Instanciar el WebDriver
		WebDriver driver = new ChromeDriver();
		
		//Ingresa a la url de pruebas
		driver.get("https://selenium.dev/");
		
		//Cierre del navegador
		driver.close();
	}
	
	@Test
	public void lab1_E2() {
		// Configuracion de propiedades del driver
		System.setProperty("webdriver.gecko.driver", "../EducacionITPractica1/Drivers/geckodriver.exe");
		
		//Instanciar el WebDriver
		WebDriver driver = new FirefoxDriver();
		
		//Maximiza la pantalla
		driver.manage().window().maximize();
		
		//Ingresa a la url de pruebas
		driver.get("https://selenium.dev/");
		
		//Cierre del navegador
		driver.close();
	}
	
	@Test
	public void lab1_E3() {
		// Configuracion de propiedades del driver
		System.setProperty("webdriver.chrome.driver", "../EducacionITPractica1/Drivers/chromedriver.exe");
		
		//Instanciar el WebDriver
		WebDriver driver = new ChromeDriver();
		
		//Ingresa a la url de pruebas
		driver.get("https://selenium.dev/");
		
		//Ingresa texto al textbox
		driver.findElement(By.id("gsc-i-id1")).sendKeys("python");
		
		//Presiona tecla enter sobre el elemento textbox
		driver.findElement(By.id("gsc-i-id1")).sendKeys(Keys.ENTER);
		
		//Cierre del navegador
		driver.close();
	}

}
