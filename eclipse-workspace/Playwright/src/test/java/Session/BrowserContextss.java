package Session;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class BrowserContextss {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		com.microsoft.playwright.BrowserContext brcntxt1 = browser.newContext();
	    Page pg1 = brcntxt1.newPage();
	    pg1.navigate("https://www.google.co.in/");
	    System.out.println("Title of pg1 is  " + pg1.title());
		
	    com.microsoft.playwright.BrowserContext brcntxt2 = browser.newContext();
	    Page pg2 = brcntxt2.newPage();
	    pg2.navigate("https://twitter.com/login?lang=en");
	    System.out.println("Title of pg2 is  " + pg2.title());
	
		
	}

}
