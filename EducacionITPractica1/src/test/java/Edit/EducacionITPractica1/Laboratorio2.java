package Edit.EducacionITPractica1;

import org.testng.annotations.Test;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Laboratorio2 {
	
	WebDriver driver;
	String driverPath = "../EducacionITPractica1/Drivers/chromedriver.exe";
	String urlPath = "https://www.facebook.com/";
	
	@Test
	public void lab2_E1() {
		
		// Configuracion de propiedades del driver
		System.setProperty("webdriver.chrome.driver", driverPath);
				
		//Instanciar el WebDriver
		driver = new ChromeDriver();
				
		//Ingresa a la url de pruebas
		driver.get(urlPath);
				
		//Completar el formulario
		//Nombre
		WebElement nombre = driver.findElement(By.cssSelector("#u_0_m"));
		nombre.sendKeys("Rafael");
		
		//Apellido
		WebElement apellido = driver.findElement(By.xpath("//input[@id='u_0_o']"));
		apellido.sendKeys("Gonzalez");
		
		//Email
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("ralf_gonzalez2002@hotmail.com");
		
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
		WebElement sexo = driver.findElement(By.xpath("//*[contains(@id,'0_7')]"));
		sexo.click();
		
		//Boton Registrarte
		WebElement btnRegistrarte = driver.findElement(By.xpath("//*[text() = 'Registrarte']"));
		btnRegistrarte.click();
		
	}

}
