package main;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class store_class {

	public void checkout() throws InterruptedException {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\hiba.ahmed\\Downloads\\geckodriver-v0.33.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/");	
		driver.manage().window().maximize();
		
	//////SIGN IN//////
			WebElement signin = driver.findElement(By.xpath("//a[@id='signin2']"));
			signin.click();
		   
		   Thread.sleep(2000);
		   
	       WebElement username = driver.findElement(By.xpath("//input[@id='sign-username']"));
	       username.sendKeys("Hiba");
	       
	       WebElement password = driver.findElement(By.id("sign-password"));
	       password.sendKeys("hiba123");
	       
	       WebElement signinbtn = driver.findElement(By.xpath("//button[@onclick='register()']"));
	       signinbtn.click();
	       
	       Thread.sleep(2000);
	       
	      //Switch to the alert
	       Alert alert = driver.switchTo().alert();
	       
	      alert.getText();
	       
	     //Accept the alert (clicking OK)
	       alert.accept();
	       
	       Thread.sleep(1000);
	       
	       WebElement closebtn = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]"));
	       closebtn.click();
	       
	       Thread.sleep(2000);
	       
	       /////LOGIN/////
	       
	       WebElement login = driver.findElement(By.xpath("//a[@id='login2']"));
	       login.click();
	       
	       Thread.sleep(1000);
	       
	       WebElement usernamee = driver.findElement(By.id("loginusername"));
	       usernamee.sendKeys("Hiba");
	       
	       WebElement passwordd = driver.findElement(By.cssSelector("input#loginpassword"));
	       passwordd.sendKeys("hiba123");
	       
	       WebElement loginbtn = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
	       loginbtn.click();
	       
	       Thread.sleep(2000);  
	    
	       
	       //////Categories/////
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//a[@href = 'prod.html?idp_=1']")).click();
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
	       Thread.sleep(2000);
	       
	       //Switch to the alert
	       Alert alert1 = driver.switchTo().alert();
	       
	      alert.getText();
	       
	     //Accept the alert (clicking OK)
	       alert1.accept();
	       
	       Thread.sleep(1000);
	       
	       ///CART PAGE///
	       driver.findElement(By.id("cartur")).click();
	       Thread.sleep(2000);
	       
	       ///DELETE Product///
	       driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/a")).click();
	       Thread.sleep(2000);
	       ///PLACE ORDER///
	       driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
	       Thread.sleep(2000);
	       
	       driver.findElement(By.id("name")).sendKeys("Hiba	");
	       driver.findElement(By.id("country")).sendKeys("Pakistan");
	       driver.findElement(By.id("city")).sendKeys("Karachi");
	       driver.findElement(By.id("card")).sendKeys("1111111111111111");
	       driver.findElement(By.id("month")).sendKeys("January");
	       driver.findElement(By.id("year")).sendKeys("2024");
	       driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();   
	       driver.close();
}
}
