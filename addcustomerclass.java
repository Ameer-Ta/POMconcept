package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addcustomerclass {
	
	private WebElement firstname_txtbox;
	private WebElement lastname_txtbox;
	private WebElement post_code_txtbox;
	private WebElement add_customer_btn;
	private WebDriver driver;

	public addcustomerclass(WebDriver driver)
	{
		this.driver=driver;
		firstname_txtbox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		lastname_txtbox =driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		post_code_txtbox = driver.findElement(By.xpath("//input[@placeholder='Post Code']"));
		add_customer_btn = driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public void enterFirstName(String firstname) {
		firstname_txtbox.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		lastname_txtbox .sendKeys(lastname);
	}
	public void enterPostCode(String post_code) {
		post_code_txtbox.sendKeys(post_code);
	}
	public void clickonaddcustomerbtn() {
		add_customer_btn.click();
	}
	public void clickOnOkAlertPopup()
	{
		driver.switchTo().alert().accept();
	}
}
