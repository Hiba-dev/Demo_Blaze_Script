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
       username.sendKeys("hiba33094");
       
       WebElement password = driver.findElement(By.id("sign-password"));
       password.sendKeys("hiba123");
       
       WebElement signinbtn = driver.findElement(By.xpath("//button[@onclick='register()']"));
       signinbtn.click();
       
       Thread.sleep(2000);
       
      //Switch to the alert
       Alert alert = driver.switchTo().alert();
       
      //Get the text from the alert
       String alertText = alert.getText();
       
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
       usernamee.sendKeys("hiba33094");
       
       WebElement passwordd = driver.findElement(By.cssSelector("input#loginpassword"));
       passwordd.sendKeys("hiba123");
       
       WebElement loginbtn = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
       loginbtn.click();
       
       Thread.sleep(2000);  
       
      //Switch to the alert
       Alert alertt = driver.switchTo().alert();
       
      //Get the text from the alert
       String alerttText = alert.getText();
      
       
     //Accept the alert (clicking OK)
       alertt.accept();
       
       driver.findElement(By.xpath("//body/div[@id='logInModal']/div[1]/div[1]/div[3]/button[1]"));
      
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//a[@id='cartur']")).click();
       
       /*
       
       WebElement category = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
       category.click();
       
       Thread.sleep(1000);
       
       WebElement products = driver.findElement(By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));
       products.click(); */
}
}
