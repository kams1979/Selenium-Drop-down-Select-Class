package DropDownSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_seperate_methods {
	static WebDriver d;
	
	private static void launch() {
     d=new ChromeDriver();
     d.get("https://www.facebook.com/");
	}
	  private static void sbi(WebElement we,int i) {
      Select s=new Select(we);
      s.selectByIndex(i);
	}
	  private static void sbi1(WebElement e,String s) {
		  Select t=new Select(e);
		  t.selectByValue(s);

	}
	  private static void sbi2(WebElement r,String f) {
		  Select v=new Select(r);
		  v.selectByVisibleText(f);

	}

		
       
	
	public static void main(String[] args) {
		launch();
		 d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		 d.findElement(By.name("firstname")).sendKeys("kams");
		 d.findElement(By.name("lastname")).sendKeys("kavin");
		 d.findElement(By.name("reg_email__")).sendKeys("9940155509");
		 d.findElement(By.id("password_step_input")).sendKeys("kavin2006");
		 sbi(d.findElement(By.id("day")),19);
		 sbi1(d.findElement(By.id("month")),"4");
		 sbi2(d.findElement(By.id("year")),"1979");
		  d.findElement(By.className("_58mt")).click();
			
		
	}

}

