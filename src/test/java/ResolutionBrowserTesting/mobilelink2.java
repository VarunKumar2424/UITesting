package ResolutionBrowserTesting;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.testng.annotations.Test;


public class mobilelink2 {
	WebDriver driver;
	@Test(priority=1)
		    public void ChromeDriver() throws IOException {
		    	 WebDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();
		         
		         DevTools devTools = ((HasDevTools) driver).getDevTools();
		         devTools.createSession();
		         devTools.send(Emulation.setDeviceMetricsOverride(360,
		        		 640, 
		        		 100,
		        		 true, 
		        		 Optional.empty(),
		        		 Optional.empty(), 
		        		 Optional.empty(),
		        		 Optional.empty(),
		        		 Optional.empty(),
		        		 Optional.empty(),
		        		 Optional.empty(),
		        		 Optional.empty()));
		         
		         driver.get("https://www.getcalley.com/calley-call-from-browser/");
		         TakesScreenshot TS=(TakesScreenshot)driver;
					File Chromebrowser=TS.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(Chromebrowser,new File("C:\\Users\\Varun Kumar\\eclipse-workspace\\UITesting\\ChromeBrowser\\360,640\\"+timetamp()+"Screenshot2.png"));
			   }  
			   	private static String timetamp() {
				// TODO Auto-generated method stub
				return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
			} 
		    
			   	
     @Test(priority=2)
     public void EdgeTest() throws IOException {
    	 WebDriver driver=new EdgeDriver();
         driver.manage().window().maximize();
         
         DevTools devTools = ((HasDevTools) driver).getDevTools();
         devTools.createSession();
         devTools.send(Emulation.setDeviceMetricsOverride(360,
        		 640, 
        		 100,
        		 true, 
        		 Optional.empty(),
        		 Optional.empty(), 
        		 Optional.empty(),
        		 Optional.empty(),
        		 Optional.empty(),
        		 Optional.empty(),
        		 Optional.empty(),
        		 Optional.empty()));
         
         driver.get("https://www.getcalley.com/calley-call-from-browser/");
         TakesScreenshot TS=(TakesScreenshot)driver;
			File Edgebrowser=TS.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Edgebrowser,new File("C:\\Users\\Varun Kumar\\eclipse-workspace\\UITesting\\EdgeBrowser\\360,640\\"+timetamp1()+"Screenshot2.png"));
	   }  
	   	private String timetamp1() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
	}
@Test(priority=3)
public void ChromeDriver1() throws IOException {
	 WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
     
     DevTools devTools = ((HasDevTools) driver).getDevTools();
     devTools.createSession();
     devTools.send(Emulation.setDeviceMetricsOverride(414,
    		 896, 
    		 100,
    		 true, 
    		 Optional.empty(),
    		 Optional.empty(), 
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty()));
     
     driver.get("https://www.getcalley.com/calley-call-from-browser/");
     TakesScreenshot TS=(TakesScreenshot)driver;
		File Chromebrowser1=TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Chromebrowser1,new File("C:\\Users\\Varun Kumar\\eclipse-workspace\\UITesting\\ChromeBrowser\\414,896\\"+timetamp11()+"Screenshot2.png"));
   }  
   	private static String timetamp11() 
   	{
	// TODO Auto-generated method stub
	return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
} 

   	
@Test(priority=4)
public void EdgeTest1() throws IOException {
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();

DevTools devTools = ((HasDevTools) driver).getDevTools();
devTools.createSession();
devTools.send(Emulation.setDeviceMetricsOverride(414,
	 896, 
	 100,
	 true, 
	 Optional.empty(),
	 Optional.empty(), 
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty()));

driver.get("https://www.getcalley.com/calley-call-from-browser/");
TakesScreenshot TS=(TakesScreenshot)driver;
File Edgebrowser1=TS.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Edgebrowser1,new File("C:\\Users\\Varun Kumar\\eclipse-workspace\\UITesting\\EdgeBrowser\\414,896\\"+timetamp2()+"Screenshot2.png"));
}  
private String timetamp2() {
// TODO Auto-generated method stub
return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
}

@Test(priority=5)
public void ChromeDriver2() throws IOException {
	 WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
     
     DevTools devTools = ((HasDevTools) driver).getDevTools();
     devTools.createSession();
     devTools.send(Emulation.setDeviceMetricsOverride(375,
    		 667, 
    		 100,
    		 true, 
    		 Optional.empty(),
    		 Optional.empty(), 
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty(),
    		 Optional.empty()));
     
     driver.get("https://www.getcalley.com/calley-call-from-browser/");
     TakesScreenshot TS=(TakesScreenshot)driver;
		File Chromebrowser2=TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Chromebrowser2,new File("C:\\Users\\Varun Kumar\\eclipse-workspace\\UITesting\\ChromeBrowser\\375,667\\"+timetamp3()+"Screenshot2.png"));
   }  
   	private static String timetamp3() {
	// TODO Auto-generated method stub
	return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
} 

   	
@Test(priority=6)
public void EdgeTest2() throws IOException {
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();

DevTools devTools = ((HasDevTools) driver).getDevTools();
devTools.createSession();
devTools.send(Emulation.setDeviceMetricsOverride(375,
	 667, 
	 100,
	 true, 
	 Optional.empty(),
	 Optional.empty(), 
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty(),
	 Optional.empty()));

driver.get("https://www.getcalley.com/calley-call-from-browser/");
TakesScreenshot TS=(TakesScreenshot)driver;
File Edgebrowser2=TS.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Edgebrowser2,new File("C:\\Users\\Varun Kumar\\eclipse-workspace\\UITesting\\EdgeBrowser\\375,667\\"+timetamp4()+"Screenshot2.png"));
}  
private String timetamp4() {
// TODO Auto-generated method stub
return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
}}
