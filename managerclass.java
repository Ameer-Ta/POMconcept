package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class managerclass {
	private WebElement add_customer_btn;
	private WebElement open_account_btn;
	private WebElement customers_btn;
	
	public managerclass(WebDriver driver)
	{
		add_customer_btn = driver.findElement(By.xpath("(//button[@class='btn btn-lg tab'])[1]"));
		open_account_btn = driver.findElement(By.xpath("(//button[@class='btn btn-lg tab'])[2]"));
		customers_btn = driver.findElement(By.xpath("(//button[@class='btn btn-lg tab'])[3]"));
	}
	
	public void clickOnAddCustomerButton()
	{
		add_customer_btn.click();
	}
	
	public void clickOnOpenAccountButton()
	{
		open_account_btn.click();
	}
	
	public void clickOnCustomersButton()
	{
		customers_btn.click();
	}

	

}

