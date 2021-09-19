package TestLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver = new ChromeDriver();
           String baseUrl = "http://127.0.0.1:8000/accounts/login";
           String expectedTitle ="Django Social Network | Login";
           driver.get(baseUrl);
           if(driver.getTitle().equals(expectedTitle))
           {
        	   System.out.println("Login page title is : "+driver.getTitle());
           	System.out.println("Test Case Successful");
           	
           }
	}

}
