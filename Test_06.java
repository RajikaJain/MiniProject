package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       String baseUrl = "http://127.0.0.1:8000/accounts/login";
       String expectedResult = "Follow Us on";
       driver.get(baseUrl);
       String actualResult =driver.findElement(By.linkText("Follow Us on")).getText();
       if(actualResult.equals(expectedResult))
       {System.out.println("Follow Us on hyperlink is present");
        driver.findElement(By.linkText("Follow Us on")).click();
        if(driver.getTitle().equals("Facebook-Login Page")) {
     	   System.out.println("Follow Us on url redirected to Facebook page");
        }
        else System.out.println("Test case fail : Redirected to wrong url/ Redirected link is not present");
       }
       else
     	  System.out.println("Follow Us on link is not present");
       
	}

}
