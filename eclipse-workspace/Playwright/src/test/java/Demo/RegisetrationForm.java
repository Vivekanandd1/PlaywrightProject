package Demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RegisetrationForm {
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		page.locator("input[name='firstname']").fill("John");
		page.locator("input[name='lastname']").fill("shalby");
		page.locator("//input[@type='email']").fill("shalby.john@gmail.com");
		page.locator("//input[@type='password']").fill("john@123");
	    Thread.sleep(3000);
		page.locator("#input-newsletter-yes").click();
		page.locator(".form-check-input").last().click();
		Thread.sleep(3000);
		page.locator("text=Continue").click();
		Thread.sleep(3000);
		browser.close();
		
		playwright.close();
		
	}
	
	

}
