package Tests;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.paginaInicio;
import Pages.paginaLogin;


public class Laboratorio3_E2 {
	
	WebDriver driver;
	String driverPath = "../EducacionITPractica1/Drivers/chromedriver.exe";
	String urlPath = "http://automationpractice.com/index.php";
	
	@BeforeSuite
	public void setUp() {
		// Configuracion de propiedades del driver
		System.setProperty("webdriver.chrome.driver", driverPath);
						
		//Instanciar el WebDriver
		driver = new ChromeDriver();
						
		//Ingresa a la url de pruebas
		driver.get(urlPath);
	}
	
	@Test
	public void irRegistroLogin() {
		paginaInicio home = new paginaInicio(driver);
		home.clickOnSignIn();
		
		paginaLogin login = new paginaLogin(driver);
		String expectedResult = "Authentication";
		Assert.assertEquals(login.getTextTitleForm(), expectedResult.toUpperCase());
	}
	
	@Test
	public void crearCuentaInvalida() throws IOException {
		paginaInicio home = new paginaInicio(driver);
		home.clickOnSignIn();
		
		paginaLogin login = new paginaLogin(driver);
		login.createAnAccount("rafael@mailinator.com");
		
		String textForm = login.getTextTitleForm();
		String expectedResult = "Authentication";
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen,new File("..\\EducacionIt\\Evidencias\\Test.png"));
		Assert.assertEquals(textForm, expectedResult.toUpperCase());
		
	}
}
