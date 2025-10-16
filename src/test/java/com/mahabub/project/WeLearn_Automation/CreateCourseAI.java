package com.mahabub.project.WeLearn_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateCourseAI extends BaseDriver {

	public String url = "http://103.209.40.121:2600/";

    @Test
    public void fillCreateCourseForm() throws InterruptedException {

    	driver.get(url);
		driver.manage().window().maximize();
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
		
		
	

        driver.findElement(By.id("title_en")).sendKeys("Test Course Title");
        Thread.sleep(500);

        new Select(driver.findElement(By.id("CourseCategoryId"))).selectByIndex(2);
        Thread.sleep(500);

        Select sub = new Select(driver.findElement(By.id("CourseSubCategoryId")));
        if (sub.getOptions().size() > 1) sub.selectByIndex(1);
        Thread.sleep(500);

        Select brand = new Select(driver.findElement(By.id("MultipleBrands")));
        if (brand.getOptions().size() > 2) {
            brand.selectByIndex(1);
            brand.selectByIndex(2);
        }
        Thread.sleep(500);

        String[] dropdowns = {"LevelId","TypeId","DiseasesId","SystemId","AreaId","SpecificationId"};
        for (String id : dropdowns) {
            Select s = new Select(driver.findElement(By.id(id)));
            if (s.getOptions().size() > 1) s.selectByIndex(1);
            Thread.sleep(500);
        }

        if (!driver.findElement(By.id("ContentShow2")).isSelected())
            driver.findElement(By.id("ContentShow2")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("(//span[@class='bootstrap-switch-label'])[2]")).click();//open for all
		Thread.sleep(3000);

        

    }
}
