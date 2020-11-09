package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class paginaInicio {
	WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	WebElement btnSignIn;
	
	@FindBy(xpath = "//title[contains(text(),'My Store')]")
	WebElement title;
	
	public paginaInicio(WebDriver driver){
		this.driver = driver;
		
		//Inicializa todos los elementos con un espera implícita
		PageFactory.initElements(new AjaxElementLocatorFactory (driver, 20), this);
	}
	
	public void clickOnSignIn() {
		btnSignIn.click();
	}
	
	
}
