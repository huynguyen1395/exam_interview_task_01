package com.demo.exam.steps.serenity;

import com.demo.exam.pages.LoginPage;
import net.thucydides.core.annotations.Step;

//define steps on login page
public class LoginSteps {
    LoginPage loginPage;
    @Step
    public void is_the_login_email_page() {
    	loginPage.open();
    }

    @Step
    public void enter_email(String email) {
    	loginPage.input_email(email);
    }
    
    @Step
    public void enter_password(String password) {
    	loginPage.input_password(password);
    }
}