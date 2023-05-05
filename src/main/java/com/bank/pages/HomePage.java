package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By homeLink = By.xpath("//button[contains(text(),'Home')]");
    public void clickOnHomeLink(){
        clickOnElement(homeLink);
    }
    By customerLogin = By.xpath("//button[normalize-space()='Customer Login']");
    public void clickOnCustomerLoginButton(){
        clickOnElement(customerLogin);
    }
    By bankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
    public void clickOnBankManagerLoginButton(){
        clickOnElement(bankManagerLogin);
    }

}
