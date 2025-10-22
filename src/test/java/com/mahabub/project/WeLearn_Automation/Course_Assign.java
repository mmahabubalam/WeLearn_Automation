package com.mahabub.project.WeLearn_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Course_Assign  extends BaseDriver{
	
	public String url = "http://103.209.40.121:2600/";
		
	@Test
	public void CourseAssign() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		// ============================   L O G   I N   ==================
		
		driver.findElement(By.name("UserName")).sendKeys("BDHalderB");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.className("btn")).click();
		
		// ===========================  M O D U L E   C H A N G E   T O   T R A I N E E   ==================
		
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(500);
				
		driver.findElement(By.xpath("//div[@class='col text-center pt-3 pb-3 mega-part']//b[contains(text(),'Trainee')]")).click();
		Thread.sleep(500);
		
		// ===========================  T R A I N E E   ==============================
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Course Assign']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[normalize-space()='Assign'])[2]")).click();
		Thread.sleep(500);
		
		// ==========================  C O U R S E   S E L E C T   ==================
		
		driver.findElement(By.xpath("//input[@id='CourseName']")).sendKeys("Cosmology");
		driver.findElement(By.xpath("//button[@id='filter_Submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='myTable']/tbody[1]/tr[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Employees Assign')]")).click();
		Thread.sleep(500);
		
		// ==========================  A S S I G N I N G    U S E R   ==================
		
		//1st drop down		    
		driver.findElement(By.xpath("(//span[@id='select2-SearchTypeId-container'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(@class,'select2-results__option') and normalize-space(text())='Single Employee']")).click();
	    Thread.sleep(500);
	    
//	     //2nd dropdown
	    driver.findElement(By.xpath("//span[@class='select2-selection__placeholder']")).click();
	    Thread.sleep(500);
	    
	    WebElement searchBox = driver.findElement(By.xpath("//input[@role='searchbox']"));
	    Thread.sleep(500);
	    searchBox.sendKeys("JoyAZM");//Assigned User
	    Thread.sleep(500);
	    searchBox.sendKeys(Keys.ENTER);
	    Thread.sleep(500);
	    
	    
	    driver.findElement(By.xpath("//button[@id='empfilter_Submit']")).click();
	    Thread.sleep(1000);
	    
	    WebElement checkBox =  driver.findElement(By.xpath("(//input[@id='AssignEmployeesList_0__IsSelected'])[1]"));
	    
	    if(!checkBox.isSelected()) {
	        checkBox.click();
	        Thread.sleep(500);
	         }
	    
		
	    
	    //Date Picker Start Date
	    driver.findElement(By.xpath("(//input[@id='AssignEmployeesList_0__SelectedCourseList_0__StartDate'])[1]")).click();
//	    Thread.sleep(500);
	    
	    WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select yearSelect = new Select(yearDropdown);
	    yearSelect.selectByVisibleText("2025");
	    Thread.sleep(500);

	    WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select monthSelect = new Select(monthDropdown);
	    monthSelect.selectByVisibleText("Oct");
	    Thread.sleep(500);
	    
	    driver.findElement(By.xpath("//a[normalize-space()='25']")).click();
	    Thread.sleep(500);
	    
	    
	    
	    
	  //Date Picker End Date
	    driver.findElement(By.xpath("(//input[@id='AssignEmployeesList_0__SelectedCourseList_0__EndDate'])[1]")).click();
//	    Thread.sleep(500);
	    
	    WebElement yearDropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select yearSelect1 = new Select(yearDropdown1);
	    yearSelect1.selectByVisibleText("2025");
	    Thread.sleep(500);

	    WebElement monthDropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select monthSelect1 = new Select(monthDropdown1);
	    monthSelect1.selectByVisibleText("Dec");
	    Thread.sleep(500);
	        
	    driver.findElement(By.xpath("//a[normalize-space()='31']")).click();
	    Thread.sleep(500);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement location = driver.findElement(By.xpath("//button[@id='EmployeeAssignSubmit']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", location);
	    
	    driver.findElement(By.xpath("//button[@id='EmployeeAssignSubmit']")).click();
	    Thread.sleep(1000);
	    
		
	}

}
