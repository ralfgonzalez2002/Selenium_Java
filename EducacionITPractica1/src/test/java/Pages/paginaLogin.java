package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginaLogin {
	
	WebDriver driver;

	@FindBy(xpath = "//input[@id='email_create']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement btnCreateAnAccount;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement titleForm;
	
	public paginaLogin(WebDriver driver){
		this.driver = driver;
		
		//Inicializa todos los elementos con un espera implícita
		PageFactory.initElements(new AjaxElementLocatorFactory (driver, 20), this);	
	}
	
	public void createAnAccount(String email) {
		txtEmailAddress.sendKeys(email);
		btnCreateAnAccount.click();
	}
	
	public String getTextTitleForm() {
		return titleForm.getText();
	}
	

}
