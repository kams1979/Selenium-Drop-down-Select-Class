package DropDownSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newpro {
	
	static WebDriver driver;
	
	private static void pro1() {
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().fullscreen();
	}
     
	
	
       private static void selectval (WebElement Val,int V){
	   Select s=new Select(Val);
	   s.selectByIndex(V);
    }
       
   private static void selectval1 (WebElement month,int i) {
	   Select s1=new Select(month);
	   s1.selectByIndex(i);
}
   
   private static void selectval2 (WebElement yer,int a) {
	   Select s2=new Select(yer);
	   s2.selectByIndex(a);
   }
   
   
         public static void main(String[] args) throws InterruptedException {
	   pro1();
	   WebElement element = driver.findElement(By.xpath("//a[@rel='async'][1]"));
		element.click();
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.name("firstname"));
		element2.sendKeys("preethi");
		WebElement element3 = driver.findElement(By.name("lastname"));
		element3.sendKeys("Kumar");
		WebElement element4 = driver.findElement(By.name("reg_email__"));
		element4.sendKeys("9940155509");
		WebElement element5 = driver.findElement(By.id("password_step_input"));
		element5.sendKeys("kavi2006");
		selectval(driver.findElement(By.id("day")),19);
		selectval1(driver.findElement(By.id("month")),3);
		selectval2(driver.findElement(By.id("year")),44);
		WebElement Gender = driver.findElement(By.className("_58mt"));
		Gender.click();
		
	
}
   
   
}
