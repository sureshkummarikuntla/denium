package talentify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	       System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://talentify.in");
       Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='navbar-collapse-1']/ul/li[7]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("sureshkummarikuntla1995@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("suresh123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Welcome\n						   suresh.k')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Logout")).click();
	  }

}
