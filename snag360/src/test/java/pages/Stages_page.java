package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Stages_page extends Base_page {
	public Stages_page(WebDriver driver) {
		super(driver);
		
		}
	@FindBy(xpath="//select[@id=('snag_purpose_purpose_name')]")
	WebElement click_dropdown_select_purpose;
	
	@FindBy(css="form[id='new_snag_purpose'] button[class='purple-btn1 w-50 ms-4 createbtn']")
	WebElement click_create_btn;
	
	@FindBy(xpath="//li[@id='phase-tab']")
	WebElement click_on_phases;
	
	@FindBy(xpath="//input[@id=(\"snag_phase_name\")]")
	WebElement enter_phases_name;
	
	@FindBy(xpath="//select[@id=('snag_phase_purpose_id')]")
	WebElement user_select_purpose;
	
	@FindBy(xpath="//form[@id='new_snag_phase']//button[@class='purple-btn1 w-50 ms-4 createbtn'][normalize-space()='Create']")
	WebElement click_create_button;
	
	@FindBy(xpath="//li[@id=('stage-tab')]")
	WebElement click_on_Stages_button;
	
	@FindBy(xpath="//select[@id=('snag_audit_stage_phase_id')]")
	WebElement select_phase;
	
	@FindBy(xpath="//button[@class=('purple-btn1 w-50 createbtn')]")
	WebElement Click_on_create_bttn;
	
	@FindBy(xpath="//input[@id=('snag_stage_name')]")
	WebElement enter_stage_name;
	
	@FindBy(xpath="//a[@class=('purple-btn1 px-5 py-2 ')]")
	WebElement Click_on_proceed_button;
	
	public void click_dropdown_select_purpose() {
		click_dropdown_select_purpose.click();
		By purpose = By.id("snag_purpose_purpose_name");
	    Select dropdown = new Select(driver.findElement(purpose));
		dropdown.selectByVisibleText("Snagging");
	}

	
	public void click_create_btn() {
		
		click_create_btn.click();
	}
	
	public void click_on_phases(){
		
		click_on_phases.click();
	}
	
	public void enter_phases_name(String phasename) {
		
		enter_phases_name.sendKeys(phasename);
	}
	
	public void select_pupose1() {
		user_select_purpose.click();
		By purpose =By.id("snag_phase_purpose_id");
		Select dropdown = new Select(driver.findElement(purpose));
		dropdown.selectByVisibleText("Snagging");
		
	}
	public void click_create_button() {
		click_create_button.click();
	}
	
	public void click_on_Stages_button() {
		click_on_Stages_button.click();
	}
	public void select_phase() {
		select_phase.click();
		By phase = By.id("snag_audit_stage_phase_id");
		Select dropdown = new Select(driver.findElement(phase));
		dropdown.selectByVisibleText("Phase 1 - Snagging");
		
	}
	
	public void enter_stage_name(String stagename) {
		enter_stage_name.sendKeys("stagename");
		
	}
	public void Click_on_create_bttn() {
		Click_on_create_bttn.click();
	}
	
	public void Click_on_proceed_button() {
		Click_on_proceed_button.click();
	}

}
