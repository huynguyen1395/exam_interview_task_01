package com.demo.exam.pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import static com.demo.exam.common.Configs.BASE_URL;
import org.openqa.selenium.Keys;

//this is login page
@DefaultUrl(BASE_URL)
public class LoginPage extends PageObject {
	
	@FindBy(xpath = "//input[@type='email']")
    private WebElementFacade emailText;

	@FindBy(xpath = "//input[@type='password']")
    private WebElementFacade passwordText;
	
	@FindBy(xpath = "//a[contains(text(),'Inbox')]")
    private WebElementFacade inboxButton;
	
    
    public void input_email(String email) {
    	emailText.type(email);
    	emailText.sendKeys(Keys.ENTER);
    }
    
    public void input_password(String password){
    	waitFor(passwordText).isVisible();
    	passwordText.type(password);
    	passwordText.sendKeys(Keys.ENTER);
    }
}