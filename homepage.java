package pagelayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	private WebDriver driver;

		private WebElement bank_manager_login_btn;
		public void AddCustomerPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
		private WebElement bank_manager_btn;
		
		
		


		public void clickOnBankManagerLoginButton()
		{
			bank_manager_login_btn.click();
		
	
	}

}
