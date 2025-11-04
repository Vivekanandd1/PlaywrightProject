package Session;
import com.microsoft.playwright.*;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class ShadowDomElements {
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		LaunchOptions lo = new LaunchOptions();
		lo.setChannel("chrome");
		lo.setHeadless(false);
		Browser  browser = playwright.chromium().launch(lo);
		Page page = browser.newPage();
//		page.navigate("https://books-pwakit.appspot.com/");
//		
//		page.locator("book-app[apptitle='BOOKS'] #input").fill("ShadowDomElemet");
//		
//		String text = page.locator("book-app[apptitle='BOOKS'] .books-desc").textContent();
//		System.out.println(text);
		
		page.navigate("https://selectorshub.com/shadow-dom-in-iframe/");
//		page.frameLocator("pact1").locator("div[@id='app2']/input[@id='pizza']").fill("VegLoaded");
        page.frameLocator("//iframe[contains(@id,'pact')]").locator("div[id='snacktime'] #tea").fill("Green Tea	");
		
        Thread.sleep(5000);
		
		browser.close();
		
	}

}
