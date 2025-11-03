package Trainee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class Content_Completion extends BaseDriver{
	
	public String url = "http://103.209.40.121:2600/";
	
	
	@Test
	public void basic() throws InterruptedException {
		driver.get(url);
		driver.manage().window();
		Thread.sleep(500);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
		
		// ============================   L O G   I N   ==================
		
		driver.findElement(By.name("UserName")).sendKeys("BDHalderB");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.className("btn")).click();
		
		// ===========================  M O D U L E   C H A N G E   T O   T R A I N E E   ==================
		
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(500);
				
		driver.findElement(By.xpath("//div[@class='col text-center pt-3 pb-3 mega-part']//b[contains(text(),'Trainee')]")).click();
		Thread.sleep(1000);
		
		// ===========================  T R A I N E E   ==================
		
		WebElement AssignedCourseList = driver.findElement(By.xpath("(//span[contains(text(),'Assigned Courses List')])[2]"));
		AssignedCourseList.click();
		Thread.sleep(500);
		
		WebElement asignTab = driver.findElement(By.id("assign-tab"));
		asignTab.click();
		Thread.sleep(500);
		
		//For Assigned first course, first div2 is course serial
		WebElement selecCourse = driver.findElement(By.xpath("//div[@id='assignCourseList']/div[2]/a[1]/div[1]/div[2]"));
		
//		WebElement selecCourse = driver.findElement(By.xpath("(//div[@class='item first'])[1]"));
		selecCourse.click();
		Thread.sleep(500);
		//
		
		WebElement section = driver.findElement(By.xpath("(//div[contains(@class,'row row-space-6')])[1]/div[3]"));
		section.click();
		Thread.sleep(1000);
		
		// div3 is content serial
		WebElement content = driver.findElement(By.xpath("(//div[contains(@class,'row row-space-6')])[1]/div[3]/div[2]/div[1]/div[1]/div[2]"));
		content.click();
		Thread.sleep(2000);
		

		// Wait until the button is no longer "disabled"
		wait.until(ExpectedConditions.not(
		    ExpectedConditions.attributeContains(
		        By.id("btn-complete"), "class", "disabled"
		    )
		));

		// Now click the button
		driver.findElement(By.id("btn-complete")).click();
		Thread.sleep(500);

		
		
//		WebElement complete = driver.findElement(By.id("btn-complete-text"));
//		Thread.sleep(60000);
//		complete.click();
//		Thread.sleep(2000);
//		
	}
	

}

