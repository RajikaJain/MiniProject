package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	       String baseUrl = "http://127.0.0.1:8000/accounts/login";
	       String expectedResult = "Take the tour";
	       driver.get(baseUrl);
	       String actualResult =driver.findElement(By.linkText("Take the tour")).getText();
	       if(actualResult.equals(expectedResult))
	       {System.out.println("Take the tour hyperlink is present");
	        driver.findElement(By.linkText("Take the tour")).click();
	        if(driver.getTitle().equals("Gatherly- Take the tour")) {
	     	   System.out.println("Take the tour url redirected to Gatherly- Take the tour ");
	        }
	        else System.out.println("Test case fail : Redirected to wrong url/ Redirected link is not present");
	       }
	       else
	     	  System.out.println("Gatherly- Take the tour hyperlink is not present");
	}

}
