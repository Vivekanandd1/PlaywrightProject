package Session;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

public class CodeGun_gen {

	  public static void main(String[] args) throws InterruptedException {
		  try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));

		      Page page = browser.newPage();
//		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Amazon.in Amazon.in https://www.amazon.in")).click();
//		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Audible Download Audio Books")).click();
		      page.navigate("https://www.amazon.in/");
		      page.navigate("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		      page.navigate("https://www.amazon.in/Van-Heusen-Sport-Regular-VSKPWRGFR16516_Teal_L/dp/B07HJ99JJH/ref=zg_bs_c_apparel_sccl_1/261-8963022-9839531?pd_rd_w=FBbpQ&content-id=amzn1.sym.7dd29d48-66c1-486c-967d-2ed40101f2ea&pf_rd_p=7dd29d48-66c1-486c-967d-2ed40101f2ea&pf_rd_r=32Q9SMXCX6NSGC6CDYS5&pd_rd_wg=mCSGq&pd_rd_r=cc435348-35e3-4f6d-b38a-4d6055efb00c&pd_rd_i=B07HJ99JJH&psc=1");
		      page.navigate("https://www.amazon.in/gp/product/handle-buy-box/ref=dp_start-bbf_1_glance");
		      page.navigate("https://www.amazon.in/cart/smart-wagon?newItems=C258bc6cc-fba1-40ed-a1b2-ced4e0880edd,1&ref_=sw_refresh");
		      page.getByLabel("Amazon.in", new Page.GetByLabelOptions().setExact(true)).click();
		    }
	  }
	}


