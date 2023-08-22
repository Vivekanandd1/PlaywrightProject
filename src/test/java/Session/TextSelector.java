package Session;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

import java.util.Iterator;

import com.microsoft.playwright.*;
public class TextSelector {
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		LaunchOptions lo = new LaunchOptions();
		lo.setChannel("chrome");
		lo.setHeadless(false);
		Browser browser = playwright.chromium().launch(lo);
		Page page = browser.newPage();
		/*page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		Locator CSText = page.locator("text=Contact Sales");
		int test = CSText.count();
		System.out.println(test);
		
		//nth item clicking 
		Locator PPText = page.locator("text=privacy policy");
		int PPcount = PPText.count();
		System.out.println(PPcount);
		for (int i=0;i<PPcount;i++) {
			String text = PPText.nth(i).textContent();
			System.out.println(text);
			if(text.contains("Service Privacy Policy")) {
				PPText.nth(i).click();
				break;
			}
		}*/
		
		page.navigate("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		Thread.sleep(5000);
		page.locator("form button:has-text('Login')").click();
		
	}

}
