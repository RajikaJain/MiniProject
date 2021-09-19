package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	       String baseUrl = "http://127.0.0.1:8000/accounts/login";
	       String expectedResult = "Join now";
	       driver.get(baseUrl);
	       String actualResult =driver.findElement(By.linkText("Join now")).getText();
	       if(actualResult.equals(expectedResult))
	       {System.out.println("Join now hyperlink is present");
	        driver.findElement(By.linkText("Join now")).click();
	        if(driver.getTitle().equals("Gatherly- Join now")) {
	     	   System.out.println("Join now url redirected to Gatherly- Subscription ");
	        }
	        else System.out.println("Test case fail : Redirected to wrong url/ Redirected link is not present");
	       }
	       else
	     	  System.out.println("Join now hyperlink is not present");
	}

}
