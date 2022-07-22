package com.demo.exam.steps.serenity;
import com.demo.exam.pages.CreateMailPage;
import net.thucydides.core.annotations.Step;

//define steps on create mail page
public class CreateMailSteps {
    CreateMailPage createMailPage;
    @Step
    public void click_compose_mail() {
    	createMailPage.click_compose_mail();
    }
    
    @Step
    public void input_address_email(String recipient) {
    	createMailPage.input_address_email(recipient);
    }
    
    @Step
    public void input_subject_email(String subject) {
    	createMailPage.input_subject_email(subject);
    } 
    
    @Step
    public void input_body_email(String body) {
    	createMailPage.input_body_email(body);
    } 
    
    @Step
    public void click_button_send_mail() {
    	createMailPage.click_button_send_mail();
    } 
    
    @Step
    public void check_sent_email_success() {
    	createMailPage.check_sent_email_success();
    } 
}