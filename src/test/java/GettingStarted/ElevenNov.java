package GettingStarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class ElevenNov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser brw = null;
		Page page = null ;
		try {
		 brw = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		 page = brw.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
		
		page.locator("#email1").fill("admin@email.com");
		page.getByPlaceholder("Enter Password").fill("admin@123");
		page.locator("xpath=//button[@type='submit']").click();
		}
		finally {
			page.close();
			brw.close();
		}
		
	

	}

}
