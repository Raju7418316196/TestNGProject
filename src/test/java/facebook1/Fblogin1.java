package facebook1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Fblogin1   {
    WebDriver driver;
 
    @BeforeClass
 public void setUp(){
	 
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   
 }
@Test
public void loginToFacebook() {
    driver.get("https://www.facebook.com");
    
     driver.findElement(By.id("email")).sendKeys("7418316196");
    driver.findElement(By.name("pass")).sendKeys("Raju7418316196"); 
    driver.findElement(By.id("u_0_5_Hh")).click();
}
@AfterClass
public void tearDown() {
	 driver.close();
    
	 


}
}
