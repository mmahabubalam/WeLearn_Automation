package com.mahabub.project.WeLearn_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


/*
 *Assigned Employee name at line: 75
 *Reviewer name at line 115
 * 
 */


public class eDetailing_Assign  extends BaseDriver{

	public String url = "http://103.209.40.121:2600/";
	
	@Test
	public void eDetailingCreate() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(500);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		// ============================   L O G   I N   =====================================
		
		driver.findElement(By.name("UserName")).sendKeys("BDHalderB");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.className("btn")).click();
		
		// ===========================  M O D U L E   C H A N G E   T O   T R A I N E E   ==================
		
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='col text-center pt-3 pb-3 mega-part']//b[contains(text(),'Trainee')]")).click();
		Thread.sleep(1000);
		
		// ===========================  T R A I N E E   ======================================
		
		driver.findElement(By.xpath("//ul[contains(@class,'sub-menu')]//span[contains(text(),'e-Detailing')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(text(),'e-Detailing Summary')]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(@href,'/Trainee/eDetailing/EmployeeAssign?did=NA==')]")).click(); //select a detail for assign
		Thread.sleep(500);
				
				
		// ===========================  A S S I G N   P A G E   ======================================
		

	    //1st dropdown
		driver.findElement(By.xpath("//span[@id='select2-SearchTypeId-container']")).click();
	    Thread.sleep(500);
	    
	    driver.findElement(By.xpath("//li[contains(@class,'select2-results__option') and normalize-space(text())='Single Employee']")).click();
	    Thread.sleep(500);

	    //2nd dropdown
	    driver.findElement(By.xpath("//span[@id='select2-SearchEmployeeId-container']")).click();
	    Thread.sleep(500);
	    
	    WebElement searchBox = driver.findElement(By.xpath("//input[contains(@class,'select2-search__field')]"));
	    Thread.sleep(500);
	    searchBox.sendKeys("BDIslamE");
	    Thread.sleep(1000);
	    searchBox.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);

	    driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	    Thread.sleep(500);
	    
	 // =========================== S E A R C H    R E S U L T    P A G E   ===================================
	    
    	 //Date-picker
	    driver.findElement(By.xpath("//input[@id='eDetailingAssignList_0__SubmissionDeadline']")).click();
	    Thread.sleep(500);

	    WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select yearSelect = new Select(yearDropdown);
	    yearSelect.selectByVisibleText("2026");
	    Thread.sleep(500);

	    WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select monthSelect = new Select(monthDropdown);
	    monthSelect.selectByVisibleText("Dec");
	    Thread.sleep(500);
	    
	    driver.findElement(By.xpath("//a[normalize-space()='21']")).click();
	    Thread.sleep(500);
	    
	    
	    driver.findElement(By.xpath("//i[@class='fa-solid fa-user-plus btn btn-sm']")).click();
	  
	  
	  
	 // ===========================  R E V I E W E R   A D D   ======================================
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[@id='select2-EmployeeId-container']")).click();
	    Thread.sleep(500);
	    
	    WebElement searchBox1 = driver.findElement(By.xpath("//input[@role='searchbox']"));
	    Thread.sleep(500);
	    searchBox1.sendKeys("BDHalderB");
	    Thread.sleep(500);
	    searchBox1.sendKeys(Keys.ENTER);
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//button[@id='ReviewerAdd']")).click();
	    Thread.sleep(500);
	    
	    
	    
	    //Submit
	    driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Submit'])[1]")).click();
	    Thread.sleep(500);
				
	}
}
