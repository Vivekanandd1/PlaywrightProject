package GettingStarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Signup {
	
	public static void main(String[] args) {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		Page page = browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/signup");
		PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
		page.getByPlaceholder("Name").fill("Vatsal");
		page.locator("#email").fill("Vatsal@yopmail.com");
		page.getByPlaceholder("Password").fill("Vatsal@123");
		page.getByText("Java").click();
		page.getByText("Selenium").click();
		PlaywrightAssertions.assertThat(page.locator("//label[text()='Java']//preceding::input[1]")).isChecked();
		PlaywrightAssertions.assertThat(page.locator("//label[text()='Java']//preceding::input[1]")).isChecked();
		page.locator("#state").selectOption("Goa");
		String[] hobbies = {"Singing","Reading"};
		page.locator("#hobbies").selectOption(hobbies);
		page.locator("css=.submit-btn").click();
		
		 page.close();
	      browser.close();
		
	}

}
