package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customersclass {
	private WebElement customers_btn;
	private WebElement searchbox_text;
	private WebElement delete_btn;

	public customersclass(WebDriver driver)
	{
		searchbox_text=driver.findElement(By.xpath("//input[@placeholder='Search Customer']"));
		delete_btn=driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
	}
	
	public void clickOnCustomersButton()
	{
		customers_btn.click();
	}
	
	public void entertextinsearch()
	{
		searchbox_text.sendKeys("Albus");
	}
	public void clickondelete()
	{
		delete_btn.click();
	}
	
}
