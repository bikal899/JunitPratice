package page;
import org.junit.Assert;
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
		
		public void VerifyDashboardHeader() {
			WebElement VerifyDB = DASHBOARDHEADER;
			String VDB = VerifyDB.getText();
			Assert.assertEquals("WrongPage!!!!",VDB,"NSS-TODO List v 1.1" );
}
}
