package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Towers_page extends Base_page {

	public Towers_page(WebDriver driver) {
		super(driver);
		
		}
	@FindBy(xpath="//input[@id=('number')]")
	WebElement enters_tower;
	
	@FindBy(xpath="//button[@class=('configure-buttons create col-sm-1 btncreate purple-btn1 py-1 px-4')]")
	WebElement Clicks_add_button;
	
	@FindBy(xpath="//a[normalize-space()='Save & Proceed']")
	WebElement Click_on_Towers_proceed_button;
	
	
	
	
	public void enter_tower(String towers_no) {
		
		enters_tower.sendKeys(towers_no);
	}
	
	public void Click_add_button() {
		Clicks_add_button.click();
		
	}
	
	public void scroll_down() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
		
	}

	
	public void Click_on_Towers_proceed_button() {
		
		Click_on_Towers_proceed_button.click();
	}
	
	
}
