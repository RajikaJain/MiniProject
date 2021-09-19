package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testt_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      String baseUrl = "http://127.0.0.1:8000/accounts/login";
      String expectedResult = "Forgot Password?";
      driver.get(baseUrl);
      String actualResult =driver.findElement(By.linkText("Forgot Password?")).getText();
      if(actualResult.equals(expectedResult))
      {System.out.println("Forgot password link is present");
       driver.findElement(By.linkText("Forgot Password?")).click();
       if(driver.getTitle().equals("Forgot Password")) {
    	   System.out.println("Forgot password url redirected to correct page");
       }
       else System.out.println("Test case fail : Redirected to wrong url/ Redirected link is not present");
      }
      else
    	  System.out.println("Forgot password link is not present");
      

}
}