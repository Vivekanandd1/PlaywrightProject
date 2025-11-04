package Session;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

import java.util.List;

import com.microsoft.playwright.*;

public class LocatorConcepts {
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
        page .navigate("https://www.orangehrm.com/en/30-day-free-trial");
//		Getting a single locator and filling data inside it.
		Locator username = page.locator("input#Form_getForm_subdomain");
		username.fill("DeshmukhD");
		
		//Now Fetching the list of Dom elements form webbrowser.
		Locator countryList = page.locator("Select#Form_getForm_Country option");
		Locator country = page.locator("select#Form_getForm_Country");
//		System.out.println(Countrycount);
		
//		page.getByLabel("Country").selectOption("India");
		
		country.selectOption("India");
		
		List<String> Countylisttext = countryList.allTextContents();
		
		for (String e : Countylisttext ) {
			System.out.println(e);
		}
		
		Thread.sleep(4000);
		
		browser.close();
		
		
	}

}
