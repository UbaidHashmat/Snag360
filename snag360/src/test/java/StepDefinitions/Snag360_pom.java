package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.Base_page;
import pages.Stages_page;
import pages.Towers_page;
import pages.homepage;
import pages.login_pom;;



public class Snag360_pom  {
	
	public Snag360_pom() {
		
		
	}
	WebDriver driver = null;
	login_pom lp1;
	Stages_page sp;
	homepage hp;
	Towers_page tp;
    

@Given("browser is open")
public void browser_is_open() {
	
	System.out.println("I am inside POM CLASS");
    System.out.println("Inside step- Browser is open");
    driver = new ChromeDriver();
    
   
}

@Given("user is on login page")
public void user_is_on_login_page() {
    System.out.println("Inside step- user is on login page");
    driver.get("https://lockated.com/login");
    driver.manage().window().maximize();
}

@When("^user enters (.*)and(.*)$")
public void user_enters_id_password(String id, String password) throws InterruptedException  {
    System.out.println("Inside step-User enters id & password");
	
	lp1= new login_pom(driver);
	lp1.setid("demo@lockated.com");
	lp1.setPass("123456");
	
    Thread.sleep(3000);
    
    }

@When("hit login button")
public void hit_login_button() {
    System.out.println("Inside step- User hit login button");
    lp1.clickLogin();
   
    // driver.findElement(By.xpath("//input[@id='submitlogin']")).click();
}

@Then("user is on home page")
public void user_is_on_home_page() {
    System.out.println("Inside step- User is on home page");
    //driver.quit();
}  
    @Then("users click snag360 button")
    public void Users_click_snag360_button() throws Throwable {
    	System.out.println("Snag button clicked");
    	Thread.sleep(3000);
    	lp1.click_snag360();
    	
    }	
    @When("user click setup button")
	public void user_click_setup_button() throws Throwable {
		System.out.println("Setup button clicked");
		//WebDriver driver = null;
		homepage hp = new homepage(driver);
		hp.click_setup_button();
		Thread.sleep(3000);
		
	}
    @And("user click add project")
    public void user_click_add_project() {
    	System.out.println("Add project button clicked");
    	homepage hp = new homepage(driver);
    	hp.add_project();
    	
    	//driver.quit();
    }
    
    @When("user enter project name")
    public void user_enter_project_name() {
      System.out.println("User enters project name");
      homepage hp= new homepage(driver);
      hp.enter_project_name("Snag automation 61");
      
    }
    
    @Then("user click on save button")
    public void user_click_on_save_button() {
    	System.out.println("user click save button");
        homepage hp= new homepage(driver);
        hp.save_button();
    }
    @And("click dropdown select purpose")
    public void click_dropdown_select_purpose() throws Throwable {
    	System.out.println("dropdown selected");
    	 Stages_page sp= new Stages_page(driver);
    	Thread.sleep(3000);
    	sp.click_dropdown_select_purpose();
    	
    	 
    	 } 
    @Then ("click on create btn")
    public void click_on_create_btn() throws Throwable {
    	
    	System.out.println("Users click create button");
    	Stages_page sp= new Stages_page(driver);
    	sp.click_dropdown_select_purpose();
    	
    	Thread.sleep(3000);
    	sp.click_create_btn();
    	
    	
    }
    @And ("click on phases")
    public void click_on_phases() throws Throwable {
    	System.out.println("user click on phases");
    	Stages_page sp = new Stages_page(driver);
    	Thread.sleep(2000);
    	sp.click_on_phases();
    	
    }
    
    @Then ("enter phases name")
    public void enter_phases_name(){
    	System.out.println("users enter phases name");
    	Stages_page sp = new Stages_page(driver);
    	sp.enter_phases_name("Phase 1");
    	
    }
    
    @When ("user select purpose")
    public void user_select_pupose() {
    	System.out.println("purpose selected");
    	Stages_page sp = new Stages_page(driver);
    	sp.select_pupose1();
    	
    	
    	}
    @And ("click create button")
    public void click_create_button() {
    	System.out.println("phases create button clicked");
    	Stages_page sp = new Stages_page(driver);
    	sp.click_create_button();
    }
    
    @Then("click on Stages button")
    public void click_on_Stages_button() {
    	System.out.println("users click on Stages button");
    	Stages_page sp = new Stages_page(driver);
    	sp.click_on_Stages_button();
    }
    
    @And("select phase")
    public void select_phase() {
    	System.out.println("user selected the phase");
    	 sp = new Stages_page(driver);
    	 sp.select_phase();
    }
    
    @Then ("enter stage name")
    public void enter_stage_name() {
    	System.out.println("user entered stage name");
    	sp = new Stages_page(driver);
    	sp.enter_stage_name("Project Stage");
    }
    	@When("Click on create bttn")
    	public void Click_on_create_bttn() {
    		sp = new Stages_page(driver);
    		sp.Click_on_create_bttn();
    	}
    	
    	@Then ("Click on proceed button")
    	public void Click_on_proceed_button() {
    		sp= new Stages_page(driver);
    		sp.Click_on_proceed_button();
    	}
    	
    	@And("user enters towers")
    	public void user_enters_towers() {
    		
    		tp =  new Towers_page(driver);
    		tp.enter_tower("1");
    	}
    	
    	@Then("Clicks add button")
    	public void Clicks_add_button() throws Throwable {
    		tp =new Towers_page(driver);
    		tp.Click_add_button();
    		Thread.sleep(3000);
    	}
    	
    	@When("scroll down")
    	public void scroll_down() throws Throwable {
    		tp.scroll_down();
    		Thread.sleep(3000);
    		
    	}
    	
    	@And("Click on Towers proceed button")
    	public void Clicks_on_Towers_proceed_button() {
    		tp = new Towers_page(driver);
    		tp.Click_on_Towers_proceed_button();
    	}
    	
    	
    		
    	
    }



