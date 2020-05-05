package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DescendingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();	//Click on table head to sort table by fruit name (Descending)
		
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[2]")); //Get all fruit name element
		
		ArrayList<String> originalList = new ArrayList<String>();			//Create new ArrayList for original list
		
		for(int i=0; i<list.size(); i++) {
			originalList.add(list.get(i).getText());						//Get all fruit name and add it in original list
		}
		
		System.out.println("---Original List---");
		for (String o:originalList) {
			System.out.println(o);											//Print original list
		}
		
		ArrayList<String> copiedList = new ArrayList<String>();				//Create another ArrayList for copied list (clone of original list)
		
		for(int j=0; j<originalList.size(); j++) {
			copiedList.add(originalList.get(j));							//Add original list items in copied list
		}
		
		Collections.sort(copiedList);										//Perform sort method on copied list by Collection framework
		Collections.reverse(copiedList); 									//Reverse the sorted list to get descending order list
		
		System.out.println("---Sorted List---");
		for(String s:copiedList) {
			System.out.println(s);											//Print sorted list
		}
		
		Assert.assertTrue(copiedList.equals(originalList));					//Validate sorted list is equal to original list
		
		driver.close();
	}

}
