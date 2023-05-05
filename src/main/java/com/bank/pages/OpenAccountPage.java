package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By searchCreatedCustomer = By.xpath("//select[@name='userSelect']");
    public void searchCreatedCustomerName(String name){
        selectByVisibleTextFromDropDown(searchCreatedCustomer,name);
    }
    By searchPound = By.xpath("//select[@id='currency']");
    public void searchPound(String currency){
        selectByVisibleTextFromDropDown(searchPound,currency);
    }
    By processButton = By.xpath("//button[normalize-space()='Process']");
    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }
}
