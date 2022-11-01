package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;



public class Appium {
	
	
	@Test
	public void appium() throws MalformedURLException {
		WebDriver driver;
	
		try{DesiredCapabilities cap = new DesiredCapabilities();
		  
		  cap.setCapability("platformName", "iOS");
		  cap.setCapability("platformVersion", "16.0");
		  cap.setCapability("deviceName", "iPhone 8");
		  
		  cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		  //cap.setCapability("app","/Applications/Appium Server GUI.app/Contents/Resources/app/node_modules/appium/node_modules/appium-webdriveragent/WebDriverAgent.xcodeproj");
		 
		  URL url = new URL("http://0.0.0.0:4723/wd/hub");
		  
		  IOSDriver dri = new IOSDriver(url, cap);
		  
	} catch (Exception e){
		e.printStackTrace();
		
		
		
	}
	}
}
	

 
