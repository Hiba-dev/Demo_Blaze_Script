package main;

import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class store_class {
	
	public void checkout() throws InterruptedException {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
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
       
      //Wait for the alert to appear
       WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
       w.until(ExpectedConditions.alertIsPresent());

       
      //Switch to the alert
       Alert alert = driver.switchTo().alert();
       
      //Get the text from the alert
       String alertText = alert.getText();
       
     //Accept the alert (clicking OK)
       alert.accept();
       
       WebElement closebtn = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]"));
       closebtn.click();
       
       /////LOGIN/////
       WebElement login = driver.findElement(By.id("login2"));
       login.click();
       
       Thread.sleep(2000);
       
       WebElement usernamee = driver.findElement(By.id("loginusername"));
       usernamee.sendKeys("hiba33094");
       
       WebElement passwordd = driver.findElement(By.cssSelector("input#loginpassword"));
       passwordd.sendKeys("hiba123");
       
       WebElement loginbtn = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
       loginbtn.click();
       
     //Wait for the alert to appear
       WebDriverWait d=new WebDriverWait(driver, Duration.ofSeconds(40));
       w.until(ExpectedConditions.alertIsPresent());

       
      //Switch to the alert
       Alert alertt = driver.switchTo().alert();
       
      //Get the text from the alert
       String alerttText = alert.getText();
       
     //Accept the alert (clicking OK)
       alertt.accept();
       
       WebElement product = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
       product.click();
}
}
