package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Ex2 {
@Test
public void deleteEmp(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	String expTitle="Google";
	String actTitle=driver.getTitle();
	Assert.assertEquals(actTitle, expTitle);
	driver.close();
	
}
@Test(groups={"a"})
public void method2(){
	Assert.assertEquals(11, 11);
}
}
