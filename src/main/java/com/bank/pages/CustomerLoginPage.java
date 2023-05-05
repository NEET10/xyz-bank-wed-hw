package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By yourNameCustomerField = By.xpath("//select[@id='userSelect']");
    public void selectCustomerNameFromYourNameField(String customerName){
        selectByVisibleTextFromDropDown(yourNameCustomerField,customerName);
    }
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    By textYourName = By.xpath("//label[contains(text(),'Your Name :')]");
    public String getTextYourName(){
        return getTextFromElement(textYourName);
    }
}
