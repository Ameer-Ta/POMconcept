package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagelayer.addcustomerclass;
import pagelayer.customersclass;
import pagelayer.homepage;
import pagelayer.managerclass;
import pagelayer.openaccount;


public class addnewcustomerclass {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		homepage home_obj = new homepage(driver);
		
		Thread.sleep(2000);
		home_obj.clickOnBankManagerLoginButton();
		home_obj.clickOnBankManagerLoginButton();
		managerclass manager_obj = new managerclass(driver);
//		manager_obj.clickOnAddCustomerButton();
//		addcustomerclass add_cust_obj = new addcustomerclass(driver);
//		add_cust_obj.enterFirstName("Ameer");
//		Thread.sleep(3000);
//		add_cust_obj.enterLastName("Mohammad");
//		Thread.sleep(3000);
//		add_cust_obj.enterPostCode("506132");
//		Thread.sleep(3000);
//		add_cust_obj.clickonaddcustomerbtn();
//		Thread.sleep(3000);
//		add_cust_obj.clickOnOkAlertPopup();
//		manager_obj.clickOnOpenAccountButton();
//		openaccount open_acct=new openaccount(driver);
//		open_acct.clickonopenaccountbtn();
//		Thread.sleep(3000);
//		open_acct.selectdropdown();
//		Thread.sleep(3000);
//		open_acct.selectdropdowncurrency();
//		Thread.sleep(3000);
//		open_acct.clickOnprocessbtn();
//		Thread.sleep(3000);
//		open_acct.clickOnOkAlertPopup();
//		Thread.sleep(3000);
		manager_obj.clickOnCustomersButton();
		customersclass cust_class = new customersclass(driver);
		cust_class.entertextinsearch();
		cust_class.clickondelete();

}
}


