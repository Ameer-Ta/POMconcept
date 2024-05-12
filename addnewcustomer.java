package testlayer1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagelayer.customersclass;
import pagelayer.managerclass;
import pagelayer1.addcustomerpage;
import pagelayer1.homepage;
import pagelayer1.managepage;

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	home_obj.clickOnBankManagerLoginButton();
	home_obj.clickOnBankManagerLoginButton();
	managerclass manager_obj = new managerclass(driver);
	manager_obj.clickOnAddCustomerButton();
	addcustomerclass add_cust_obj = new addcustomerclass(driver);
	add_cust_obj.enterFirstName("Ameer");
	Thread.sleep(3000);
	add_cust_obj.enterLastName("Mohammad");
	Thread.sleep(3000);
	add_cust_obj.enterPostCode("506132");
	Thread.sleep(3000);
	add_cust_obj.clickonaddcustomerbtn();
	Thread.sleep(3000);
	add_cust_obj.clickOnOkAlertPopup();
	manager_obj.clickOnOpenAccountButton();
	
	
}

	}

}
