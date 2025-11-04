package Session;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.*;

public class FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		LaunchOptions lo = new LaunchOptions();
		lo.setChannel("chrome");
		lo.setHeadless(false);
		Browser browser = playwright.chromium().launch(lo);
		Page page = browser.newPage();
//		page.navigate("http://www.londonfreelance.org/courses/frames/index.html");
//		
//		String frame = page.frameLocator("frame[name='main']").locator("h2").textContent();
//		System.out.println(frame);
		
		page.navigate("https://www.formsite.com/templates/registration-form-templates/club-registration-signup-form/");
		
		page.locator("img[title='Club-Signup-Forms-and-Examples']").click();
		
		page.frameLocator("//iframe[contains(@id,'frame-one')]").locator("//input[@name='RESULT_TextField-3']").fill("vivek");
		
		Thread.sleep(5000);
		
		browser.close();
		
	}

}
