package additemtest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AddItemPage;
import util.BrowserFactory;


public class AdditemTest {
	
	WebDriver driver;
	
	String ItemName = "Bikal";
	String DueMonth = "Jan";
	String DueYear = "2023";
	String DueDate = "3";

	@Test
	public void Test1() {
	driver = BrowserFactory.init();

		AddItemPage additem = PageFactory.initElements(driver, AddItemPage.class);
//		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
//		dashboardpage.VerifyDashboardHeader();
	
		for (int i = 0; i < 5; i++) {
			additem.AddingItem(ItemName);
			additem.DueDay(DueDate);
			additem.DueMonth(DueMonth);
			additem.DueYear(DueYear);
			additem.ClickAdd();
		}
		additem.Toggle();
		//BrowserFactory.tearDown();
	}

	@Test
	public void Test2() {
	
		driver = BrowserFactory.init();

		AddItemPage additem = PageFactory.initElements(driver, AddItemPage.class);
//		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
//		dashboardpage.VerifyDashboardHeader();

		additem.CLICKONSINGLEITEM();
		additem.RemoveItem();
		//BrowserFactory.tearDown();
	}
	@Test
	public void Test3() {
		driver = BrowserFactory.init();

		AddItemPage additem = PageFactory.initElements(driver, AddItemPage.class);
		
		additem.Toggle();
		additem.RemoveItem();
		
		
		
	}
	
}
