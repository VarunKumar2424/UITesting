package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromebrowser {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.getcalley.com/");
		TakesScreenshot TS=(TakesScreenshot)driver;
		File Chromebrowser=TS.getScreenshotAs(OutputType.FILE);
		
		File ChromebrowserTrg=new File("C:\\Users\\Varun Kumar\\eclipse-workspace\\UITesting\\ChromeBrowser\\Chromebrowser1920.png");
		FileUtils.copyFile(Chromebrowser, ChromebrowserTrg);


	}

}
