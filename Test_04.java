package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://127.0.0.1:8000/accounts/login";
        String expectedTitle ="Gatherly";
        driver.get(baseUrl);
        //String actualResult = driver.findElement(By.className("land-meta")).getText();
  	    // System.out.println("Company logo is : "+actualResult);
          String actualResult = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/h1")).getText();
        if(actualResult.equals(expectedTitle))
        {
     	   System.out.println("Company logo is : "+actualResult);
        	System.out.println("Test Case Successful");
        	
        }

	}

}
