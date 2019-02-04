package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//Screen s=new Screen();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.manage().window().maximize();
		// login 
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//enter the name of the employee.......
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("Tungala");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mahesh");
		
		// click on browser button to upload a file....
		Thread.sleep(2000);
	/*	WebElement Browse = driver.findElement(By.id("photofile"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Browse);*/
		driver.findElement(By.id("photofile")).click();
		//upload file thru auto-it script....
	  Runtime.getRuntime().exec("E:\\Mahesh\\FileUpload2.exe");
	    //s.click("E:\\Mahesh\\Upload.sikuli\\drive.png");
	//s.doubleClick("E:\\Mahesh\\Upload.sikuli\\folder.png");
		//s.doubleClick("E:\\Mahesh\\Upload.sikuli\\file.png");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		//Thread.sleep(3000);
		//swith back to the parent frame.......
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		driver.close();
	}
}
