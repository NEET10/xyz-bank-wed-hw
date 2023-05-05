package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By addFirstName = By.xpath("//input[@placeholder='First Name']");
    public void enterFirstName(String firstname){
        sendTextToElement(addFirstName,firstname);
    }
    By addLastName = By.xpath("//input[@placeholder='Last Name']");
    public void enterLastName(String lastname){
        sendTextToElement(addLastName,lastname);
    }
    By addPostcode = By.xpath("//input[@placeholder='Post Code']");
    public void enterPostcode(String postcode){
        sendTextToElement(addPostcode,postcode);
    }
    By clickOnAddCustomer = By.xpath("//button[@type='submit']");
    public void setClickOnAddCustomerButton(){
        clickOnElement(clickOnAddCustomer);
    }

}
