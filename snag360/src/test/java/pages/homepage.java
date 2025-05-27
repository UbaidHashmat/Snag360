package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class homepage extends Base_page {

	public homepage(WebDriver driver) {
		super(driver);
		
		}
	@FindBy(xpath="//a[normalize-space()='Setup']")
	WebElement click_setup_bttn;
	
	@FindBy(xpath="//p[@class='text-center fw-bold title ']")
	WebElement add_project;
	
	@FindBy(xpath="//input[@placeholder='Enter Your Project Name']")
	WebElement enter_project_name;
	
	@FindBy(xpath="//button[normalize-space()='Save And Proceed']")
	WebElement save_button;
	
	
	
	
	public void click_setup_button() {
		click_setup_bttn.click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,9700)");
	}
	
	public void add_project() {
		add_project.click();
		
		}
	public void enter_project_name(String projectname) {
		enter_project_name.sendKeys(projectname);
	}
	
	public void save_button() {
		save_button.click();
	}
	
	

}
