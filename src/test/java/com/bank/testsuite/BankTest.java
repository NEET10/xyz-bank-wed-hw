package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    OpenAccountPage openaccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage =new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();
    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){

        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginButton();
        //	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();
        //	enter FirstName
        addCustomerPage.enterFirstName("James");
        //	enter LastName
        addCustomerPage.enterLastName("Bond");
        //	enter PostCode
        addCustomerPage.enterPostcode("BH6 6BH");
        //	click On "Add Customer" Button
        addCustomerPage.setClickOnAddCustomerButton();
        //	popup display
        switchToAlert();
        //	verify message "Customer added successfully"
        String expectedMessage1 = "Customer added successfully";
        String actualMessage1 = getTextFromAlert();
        Assert.assertTrue(actualMessage1.contains(expectedMessage1));
        //	click on "ok" button on popup.
        acceptAlert();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        //click on homeLink
        homePage.clickOnHomeLink();
        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginButton();
        //click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccount();
        //	Search customer that created in first test
        openaccountPage.searchCreatedCustomerName("James Bond");
        //	Select currency "Pound"
        openaccountPage.searchPound("Pound");
        //	click on "process" button
        openaccountPage.clickOnProcessButton();
        //	popup displayed
        switchToAlert();
        //	verify message "Account created successfully"
        String expectedMessage1 = "Account created successfully";
        String actualMessage1 = getTextFromAlert();
        Assert.assertTrue(actualMessage1.contains(expectedMessage1));
        //	click on "ok" button on popup.
        acceptAlert();
    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
        //click on homeLink
        homePage.clickOnHomeLink();
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLoginButton();
        //	search customer that you created.
customerLoginPage.selectCustomerNameFromYourNameField("James Bond");
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	verify "Logout" Tab displayed.
       Assert.assertEquals(accountPage.getTextLogout(),"Logout","Logout text not displayed");
        //	click on "Logout"
        accountPage.clickOnLogoutTab();
        //	verify "Your Name" text displayed.
        Assert.assertEquals(customerLoginPage.getTextYourName(),"Your Name :");
    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        //click on homeLink
        homePage.clickOnHomeLink();
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLoginButton();
        //	search customer that you created.
        customerLoginPage.selectCustomerNameFromYourNameField("James Bond");
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        //	Enter amount 100
        accountPage.enterDepositAmount("100");
        //	click on "Deposit" Button
        accountPage.clickOnDepositButton();
        //	verify message "Deposit Successful"
        Assert.assertEquals(accountPage.getDepositSuccessfulText(),"Deposit Successful");
    }
    @Test
    public void  customerShouldWithdrawMoneySuccessfully(){
        //click on homeLink
        homePage.clickOnHomeLink();
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLoginButton();
        //	search customer that you created.
        customerLoginPage.selectCustomerNameFromYourNameField("James Bond");
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //click on "Withdrawal" Tab
        accountPage.clickOnWithdrawalTab();
        //	Enter amount 50
        accountPage.enterWithdrawalAmount("50");
        //	click on "Withdrawal" Button
        accountPage.clickOnWithdrawalButton();
        //	verify message "Transaction Successful"
        Assert.assertEquals(accountPage.getTransactionSuccessfulText(),"Transaction successful");

    }
}
