package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class openaccount {
	private WebElement openaccount_butn;
	private WebElement customer_name;
	private WebElement currency;
	private WebElement process_btn;
	private WebDriver driver;

	public openaccount(WebDriver driver)
	{
		this.driver=driver;
		openaccount_butn=driver.findElement(By.xpath("//button[normalize-space()='Open Account']"));
		customer_name=driver.findElement(By.xpath("//select[@id='userSelect']"));
		currency=driver.findElement(By.xpath("//select[@id='currency']"));
		process_btn=driver.findElement(By.xpath("//button[contains(text(),'Process')]"));
	}
	public void clickonopenaccountbtn()
	{
		openaccount_butn.click();
	}

	public void customer_name()
	{
		customer_name.click();
	}


	public void selectdropdown() {
		Select customer_namedropdown=new Select(customer_name);
		customer_namedropdown.selectByValue("5");

	}

	public void currency()
	{
		currency.click();
	}


	public void selectdropdowncurrency()
	{
		Select currency_dropdown=new Select(currency);
		currency_dropdown.selectByValue("Dollar");
	}
	public void clickOnprocessbtn()
	{
		process_btn.click();
	}
	public void clickOnOkAlertPopup()
	{
		driver.switchTo().alert().accept();
	}
}
