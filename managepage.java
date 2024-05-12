package pagelayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class managepage {

	public void ManagerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Obj repo 
	@FindBy(xpath="(//button[contains(@class,'btn btn-lg tab')])[1]")
	private WebElement add_customer_btn;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-lg tab')])[2]")
	private WebElement open_account_btn;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-lg tab')])[3]")
	private WebElement customers_btn;
	
	
	// action method 
	public void clickAddCustomerButton()
	{
		add_customer_btn.click();
	}
	
	public void clickOpenAccountButton()
	{
		open_account_btn.click();
	}
	
	public void clickCustomersButton()
	{
		customers_btn.click();
	}

}




