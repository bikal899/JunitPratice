package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class DashboardPage {
	WebDriver driver;

		public DashboardPage(WebDriver driver) {
			this.driver = driver;

		}
		@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
		WebElement DASHBOARDHEADER;
//		
//		public void VerifyDashboardHeader() {
//			Assert.assertEquals(DASHBOARDHEADER.getText(), "NSS-TODO List v 1.1", "WRONGPAGE");
//			
//		}
}

