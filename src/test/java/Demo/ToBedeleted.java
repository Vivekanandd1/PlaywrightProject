package Demo;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class ToBedeleted {
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//		com.microsoft.playwright.BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1366, 768));
		Page page = browser.newPage();
		page.navigate("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		page.locator("input[name='firstname']").fill("John");
		page.locator("input[name='lastname']").fill("Shalby");
		page.locator("//input[@type='email']").fill("johnShalby@gmail.com");
		page.locator("#input-password").fill("johnshalby@123");
		Thread.sleep(5000);
		page.locator("text=Continue").click();
		
	}

}
