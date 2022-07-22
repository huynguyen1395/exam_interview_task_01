package com.demo.exam.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.Keys;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

//this is Create mail page
public class CreateMailPage extends PageObject {

	@FindBy(xpath = "//*[contains(text(),'Compose')]")
	private WebElementFacade composeButton;

	@FindBy(xpath = "//*[contains(@name, 'Recipients')]")
	private WebElementFacade recipientsText;

	@FindBy(xpath = "//*[contains(@name, 'to')]")
	private WebElementFacade recipientInput;

	@FindBy(xpath = "//*[contains(@name, 'subjectbox')]")
	private WebElementFacade subjectText;

	@FindBy(xpath = "//*[contains(@aria-multiline, 'true')]")
	private WebElementFacade bodyText;

	@FindBy(xpath = "//*[contains(@data-tooltip, 'Send ‪(Ctrl-Enter)')]")
	private WebElementFacade sendButton;

	@FindBy(xpath = "//*[contains(text(), 'Message sent')]")
	private WebElementFacade sentMessageText;

	public void click_compose_mail() {
		waitFor(composeButton).isClickable();
		composeButton.click();
	}

	public void input_address_email(String recipient) {
		recipientInput.type(recipient);
	}

	public void input_subject_email(String subject) {
		subjectText.type(subject);
	}

	public void input_body_email(String body) {
		bodyText.type(body);
		bodyText.sendKeys(Keys.ENTER);
	}

	public void click_button_send_mail() {
		sendButton.click();
	}

	public void check_sent_email_success() {
		boolean check_result = waitFor(sentMessageText).isVisible();
		assertTrue(check_result);
	}
}