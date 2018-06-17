package sampleGitTest;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class SampleGitTest {
	
	@Test
	public void logintest() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.get("https://www.bing.com");
        File src=((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(src,new File("C:\\seleniumworkspace\\samplegittest\\screenshot\\test.jpg"));

       

		
		
	}

}

