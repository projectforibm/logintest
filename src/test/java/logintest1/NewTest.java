package logintest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
		WebDriver driver;
		  @Test
		  public void f() throws InterruptedException {
			//Login

					driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
					driver.findElement(By.name("password")).sendKeys("1234");//In keyboard it is not fetching the data
					/*driver.findElement(By.xpath("//input[@value='1']")).click();
						driver.findElement(By.xpath("//input[@value='2']")).click();
						driver.findElement(By.xpath("//input[@value='3']")).click();
						driver.findElement(By.xpath("//input[@value='4']")).click();
						driver.findElement(By.xpath("//input[@value='Submit']")).click();*/
					String Expectedurl = "Cyclos";
					String actualurl = driver.getTitle();
					Assert.assertEquals(Expectedurl, actualurl);
					System.out.println(actualurl);

					
		  }
		  @BeforeTest
		  public void beforeTest() {
			  driver=new FirefoxDriver();
				driver.get("http://localhost:8585/do/login");
		  }

		  @AfterTest
		  public void afterTest() {
			  System.out.println("Successfull");
			  driver.close();
		  }
}
