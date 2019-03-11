package com.trinh.product;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.trinh.product.persistence.Listings;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void getLists() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0810\\eclipse-workspace\\Selenium Lib Files\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();

		webdriver.get(
				"https://providence.craigslist.org/search/apa?query=federal+hill&availabilityMode=0&sale_date=all+dates");
	
		WebDriverWait wait = new WebDriverWait(webdriver, 20);
		ArrayList<WebElement> listings = (ArrayList<WebElement>) webdriver.findElements(By.className("result-row"));
		System.out.println("this show or no?");
		System.out.println(listings.toString());
		
		ArrayList<Listings> all_Listings = new ArrayList<>();
		for (WebElement X: listings) {
		Listings temp = new Listings();
		//	System.out.println("get text here");
			System.out.println(X.getText());
			temp.setDescription(X.getText());
			
		//	System.out.println("get href");
			
			//System.out.println("tag name");
			
			System.out.println(X.findElement(By.tagName("a")).getAttribute("href"));
			temp.setURL(X.findElement(By.tagName("a")).getAttribute("href"));
			
			
		 
			
		}
		webdriver.close();
		
		for (Listings X : all_Listings) {
			System.out.println(X.toString());
		}
		
	
	}

}
