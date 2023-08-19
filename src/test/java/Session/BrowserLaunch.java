package Session;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		//1. Create websocket connection with server
		Playwright playwright = Playwright.create();
		/*headless mode on*/
		//Browser browser = driver.chromium().launch();
		/*headless mode off */
		//2.Starting the browser 
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		//3.Opening blank page behind the scene	
		Page page = browser.newPage();
		//4. Navigation to the mentioned URL
		page.navigate("https://www.flipkart.com/");
		
		String title = page.title();
		System.out.println("the title is " + title);
		
		String url = page.url();
		System.out.println("the url is "+ url);
		//5.Closing the browser
		browser.close();
		//6.Closing the websocket connection with server
		playwright.close();
	}
	

}
