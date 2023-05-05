package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By logoutTab = By.xpath("//button[@class='btn logout']");
    public String getTextLogout(){
        return getTextFromElement(logoutTab);
    }

    public void clickOnLogoutTab(){
        clickOnElement(logoutTab);
    }
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }
    By enterDepositAmount = By.xpath("//input[@placeholder='amount']");
    public void enterDepositAmount(String amount){
        sendTextToElement(enterDepositAmount,amount);
    }
    By depositButton = By.xpath("//button[@type='submit']");
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }
    By depositSuccessful = By.xpath("//span[@class='error ng-binding']");
    public String getDepositSuccessfulText(){
        return getTextFromElement(depositSuccessful);
    }
    By withdrawalTab = By.xpath("//button[normalize-space()='Withdrawl']");
    public void clickOnWithdrawalTab(){
        clickOnElement(withdrawalTab);
    }
    By enterWithdrawalAmount = By.xpath("//input[@placeholder='amount']");
    public void enterWithdrawalAmount(String amount){
        sendTextToElement(enterWithdrawalAmount,amount);
    }
    By withdrawalButton = By.xpath("//button[normalize-space()='Withdraw']");
    public void clickOnWithdrawalButton(){
        clickOnElement(withdrawalButton);
    }
    By transactionSuccessful = By.xpath("//span[@class='error ng-binding']");
    public String getTransactionSuccessfulText(){
        return getTextFromElement(transactionSuccessful);
    }


}
