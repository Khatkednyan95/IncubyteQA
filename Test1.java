package auto;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		
		// for login in gmail AC
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dnyaneshwarkhatke0062@gmail.com");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).clear();
		 //click compose button
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		//Enter email ID
		driver.findElement(By.id(":12u")).sendKeys("EmailID of user you want to send email");
		//Enter subject 
		driver.findElement(By.id(":13c")).sendKeys("Incubyte");
		//Enter body
		driver.findElement(By.id(":126")).sendKeys("Automation QA test for Incubyte");
		
		driver.findElement(By.id(":13m")).click();
	    driver.close();
		 
	}

}
