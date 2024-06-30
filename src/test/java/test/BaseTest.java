package test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class BaseTest {

	AppiumDriver driver;
	
	@BeforeTest
	public void AppiumTest() throws MalformedURLException, URISyntaxException{
		
//			AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//					.withIPAddress("127.0.0.1").usingPort(4723).build();
//			service.start();
			
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("MiroslavEmulator");
			options.setApp("//Users//miroslavjuro//eclipse-workspace//AppiumProject//src//test//java//resources//General-Store.apk");
			driver = new AppiumDriver(new URI("http://127.0.0.1:4723").toURL(), options);	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			options.setNoReset(true);
			
//			driver.quit();
//			service.stop();
		}
	
	
	
	
	
}
	
	

