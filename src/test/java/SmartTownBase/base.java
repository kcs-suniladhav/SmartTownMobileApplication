package SmartTownBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base 
{
	public static AppiumDriverLocalService service;
	 public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	        // TODO Auto-generated method stub
	        String sPath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\smarttown.apk";
	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Krina-0907");
	        cap.setCapability(MobileCapabilityType.APP, sPath);
	        System.out.println("Capability Set");
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	        System.out.println("Driver Return");
	        return driver;

	 

	    }

	 

	    public void startService() {
	       service = AppiumDriverLocalService.buildDefaultService();
	        service.start();

	 

	    }

	 

	    public void stopService() {
	       service.stop();
	    }
}
