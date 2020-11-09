package Tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


public class Laboratorio3_E1 {
	
	WebDriver driver;
	String driverPath = "../EducacionITPractica1/Drivers/chromedriver.exe";
	String urlPath = "https://www.facebook.com/";
	
	@BeforeSuite
	public void setUp() {
		// Configuracion de propiedades del driver
		System.setProperty("webdriver.chrome.driver", driverPath);
						
		//Instanciar el WebDriver
		driver = new ChromeDriver();
						
		//Ingresa a la url de pruebas
		driver.get(urlPath);
	}
	
	@BeforeTest
	public void irURL() {
		//Ingresa a la url de pruebas
		driver.get(urlPath);
	}
	
	@BeforeClass
	public void maxVentana() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void registroUsuario() throws InterruptedException {
		String urlActual = driver.getCurrentUrl();
		
		//Crear Cuenta
		WebElement btnCrearCuenta = driver.findElement(By.id("u_0_2"));
		btnCrearCuenta.click();
		
		Thread.sleep(5000);
		
		//Completar el formulario
		//Nombre
		WebElement nombre = driver.findElement(By.name("firstname"));
		nombre.sendKeys("Rafael");
			
		//Apellido
		WebElement apellido = driver.findElement(By.xpath("//input[@id='u_1_d']"));
		apellido.sendKeys("Gonzalez");
				
		//Email
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("ralf_gonzalez2002@mailinator.com");
				
		//Confirmacion de Email
		WebElement confirmacionEmail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmacionEmail.sendKeys("ralf_gonzalez2002@hotmail.com");
				
		//Password
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("1234567890");
				
		//Dia		
		WebElement dia = driver.findElement(By.id("day"));
		Select selectorDia = new Select(dia);
		selectorDia.selectByValue("26");
				
		//Mes
		WebElement mes = driver.findElement(By.id("month"));
		Select selectorMes = new Select(mes);
		selectorMes.selectByValue("5");
				
		//Anio
		WebElement year = driver.findElement(By.id("year"));
		Select selectorYear = new Select(year);
		selectorYear.selectByValue("1986");
				
		//Sexo
		WebElement sexo = driver.findElement(By.xpath("//input[@id='u_1_5']"));
		sexo.click();
				
		//Boton Registrarte
		WebElement btnRegistrarte = driver.findElement(By.name("websubmit"));
		btnRegistrarte.click();
		
		Assert.assertEquals(driver.getCurrentUrl(), urlActual);
	}
	
	@AfterClass
	public void finPrueba() {
		System.out.println("Fin Prueba");
	}
	
	@AfterTest
	public void cierraNavegador() {
		driver.close();
	}
	
	@AfterSuite
	public void finSuite() {
		System.out.println("Fin de la Suit");
	}

}
