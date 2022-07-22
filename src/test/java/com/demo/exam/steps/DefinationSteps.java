package com.demo.exam.steps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;
import com.demo.exam.steps.serenity.CreateMailSteps;
import com.demo.exam.steps.serenity.LoginSteps;
import com.demo.exam.common.*;

//Define steps 
public class DefinationSteps {
	Configs configs;

	@Steps
	LoginSteps loginSteps;
	
	@Steps
	CreateMailSteps createMailSteps;

	@BeforeScenario
	public void user_access_to_login_email_page() {
		loginSteps.is_the_login_email_page();
	}

	@Given("the user login with email '$email' and password '$password'")
	public void user_login(String email, String password) {
		loginSteps.enter_email(email);
		loginSteps.enter_password(password);
	}

	@When("the user compose email with '$emailAddress' and '$subject' and '$body'")
	public void user_compose_email(String emailAddress, String subject, String body) throws InterruptedException {
		createMailSteps.click_compose_mail();
		createMailSteps.input_address_email(emailAddress);
		createMailSteps.input_subject_email(subject);
		createMailSteps.input_body_email(body);
	}
	
	@Then("the user send email")
	public void user_send_mail() {
		createMailSteps.click_button_send_mail();
	}
	
	@Then("check sent email success")
	public void check_sent_mail() {
		createMailSteps.check_sent_email_success();
	}
}
