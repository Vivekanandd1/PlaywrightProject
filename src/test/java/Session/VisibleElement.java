package Session;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VisibleElement {
	public static void main(String[] args) {
		Playwright playwright  = Playwright.create();
		LaunchOptions lo = new LaunchOptions();
		lo.setChannel("chrome");
		lo.setHeadless(false);
		Browser browser = playwright.chromium().launch(lo);
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in/");
		List<String> linkstext = page.locator("a:visible").allInnerTexts();
		for (int i=0;i<linkstext.size();i++) {
			System.out.println(linkstext.get(i));
		}
		
	}

}
