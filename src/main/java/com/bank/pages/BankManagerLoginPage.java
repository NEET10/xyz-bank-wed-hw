package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");

    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
    }

    By openAccount = By.xpath("//button[normalize-space()='Open Account']");

    public void clickOnOpenAccount() {
        clickOnElement(openAccount);
    }

    By customers = By.xpath("//button[normalize-space()='Customers']");

    public void clickOnCustomers() {
        clickOnElement(customers);

    }
}