package Trainee;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class eDetailing_Review extends BaseDriver{

	public String url = "http://103.209.40.121:2600/";
	
	@Test
	public void Review() throws InterruptedException{
		
		driver.get(url);
		driver.manage().window();
		Thread.sleep(1000);
		
		// ============================   L O G   I N   =====================================
		
		driver.findElement(By.name("UserName")).sendKeys("BDHalderB");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.className("btn")).click();
		
		// ===========================  M O D U L E   C H A N G E   T O   T R A I N E E   ==================
		
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(500);
				
		driver.findElement(By.xpath("//div[@class='col text-center pt-3 pb-3 mega-part']//b[contains(text(),'Trainee')]")).click();
		Thread.sleep(1000);
	
		// ===========================  M E N U   S E L E C T   ====== ================================
		
		driver.findElement(By.xpath("//ul[contains(@class,'sub-menu')]//span[contains(text(),'e-Detailing')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ul[@class='sub-menu']//a[normalize-space()='e-Detailing Review List']")).click();
		Thread.sleep(1000);
		
		// ===========================  R E V I E W E R   P A G E   ======================================
		
		driver.findElement(By.xpath("//a[@class='btn btn-sm btn-primary']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//video[@id='VideoPlayer']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//video[@id='VideoPlayer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@id='ReviewerMarksList_0__ReviewMarks'])[1]")).sendKeys("8");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@id='ReviewerMarksList_1__ReviewMarks'])[1]")).sendKeys("8");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit Result']")).click();
		Thread.sleep(1000);

		
		
	}
}
