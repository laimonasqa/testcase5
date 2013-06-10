package example;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class FirstTst extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.chitchatbingo.co.uk/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testTest231323() throws Exception {
		selenium.open("/ccbingo/bingo/home/");
		selenium.click("css=span.topnavtext");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=newPlayer.firstName", "efsdfsfe");
		selenium.type("name=newPlayer.lastName", "kjgjkgkjg");
		selenium.type("id=emailId", "hjhjkgkjg@hjkhjll.com");
		selenium.select("id=birthday_month", "label=Oct");
		selenium.select("id=birthday_day", "label=18");
		selenium.select("id=birthday_year", "label=1978");
		selenium.type("name=newPlayer.address.mobilePhone", "7589346589463589");
		selenium.click("id=next1");
		selenium.type("id=userId", "mrt_pop");
		selenium.type("id=userId", "mrt_popu");
		selenium.type("name=newPlayer.password", "111111");
		selenium.click("name=newPlayer.personalInformation.confirmedAge18");
		selenium.click("name=newPlayer.personalInformation.termsAccepted");
		selenium.click("id=registration_button_practice");
		selenium.type("id=nicknameform_input", "tester%");
		selenium.click("id=nicknameform_bt");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
