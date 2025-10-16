package com.mahabub.project.WeLearn_Automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Create_A_Course extends BaseDriver{
	
	public String url = "http://103.209.40.121:2600/";
	
	@Test
	public void Create_Course() throws InterruptedException{
		
		driver.get(url);
		driver.manage().window();
		Thread.sleep(1000);
		
		
		// ============================   L O G   I N   =====================================
		
		driver.findElement(By.name("UserName")).sendKeys("BDHalderB");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.className("btn")).click();
				
		
		// ===========================  M O D U L E   C H A N G E   ==================
			
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(500);
				
		driver.findElement(By.xpath("//div[@class='col text-center pt-3 pb-3 mega-part']//b[contains(text(),'Training Management')]")).click();
		Thread.sleep(1000);
				
		// ===========================  T R A I N I N G    M A N A G E M E N T   ======================================
		//driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("(//span[contains(text(),'Courses')])[1]")).click();
		driver.findElement(By.xpath("//div[@class='widget widget-stats bg-white fixed-height d-flex justify-content-center ']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='title_en']")).sendKeys("Test Title");//title
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@id='select2-CourseCategoryId-container']")).click();//category drop-down
		Thread.sleep(500);
		driver.findElement(By.xpath("(//option[normalize-space()='Cardio Metabolic incl. Insulin'])[1]")).click();//select category
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@id='select2-TypeId-container']")).click();//Type drop-down
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[normalize-space()='Knowledge']")).click();//select type
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='ContentShow2'])[1]")).click();//content Show type
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='bootstrap-switch-label'])[2]")).click();//open for all
		Thread.sleep(3000);
		
	}

}