package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pom {
	// we can create Without pagefactory, with pagefactory
		WebDriver driver;
	    //constructor
		
		public login_pom(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
			//Locators
			


	@FindBy(xpath="//input[@id='uemail']")
	WebElement email_txt;
	@FindBy(xpath="//input[@id='spree_user_password']")
	WebElement pass_txt;
	@FindBy(xpath="//input[@id='submitlogin']")
	WebElement click_btn;
	
	@FindBy(xpath="//a[normalize-space()='Snag 360']")
	WebElement click_snag360_btn;
	
	//Action methods

public void setid(String id) {
email_txt.sendKeys(id);

}

public void setPass(String password) {
pass_txt.sendKeys(password);

}

public void clickLogin() {
click_btn.click();
}

public void click_snag360() {
	click_snag360_btn.click();


}


}
