package com.mahabub.project.WeLearn_Automation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class eDetailing_Submission extends BaseDriver{
	
	public String url = "http://103.209.40.121:2600/";
	
	@Test
	public void uploadEdetailing () throws InterruptedException {
		
		driver.get(url);
		driver.manage().window();
		Thread.sleep(1000);
		
		// ============================   L O G   I N   =====================================
		
		driver.findElement(By.name("UserName")).sendKeys("BDIslamE");
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
		driver.findElement(By.xpath("(//a[normalize-space()='e-Detailing'])[3]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click(); //Selecting the e-Detailing tr1 == first, tr2 == second
		Thread.sleep(500);
		
		driver.findElement(By.name("FileData")).sendKeys("C:\\Users\\Mahabub\\Downloads\\video1.mp4");
		Thread.sleep(1000);
		driver.findElement(By.name("RespondDetails")).sendKeys("Description Test Data");
		Thread.sleep(2000);
		driver.findElement(By.name("RespondDetails")).sendKeys("\n" + "We're gonna Submit it. Ready...!!!");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit eDetailing']")).click(); //Submit Button Here
	}
	

}

