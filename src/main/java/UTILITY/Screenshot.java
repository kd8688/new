package UTILITY;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	public static void TakeScreenshot (WebDriver obj, String Name) throws IOException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime currentTime = LocalDateTime.now();
		String d = dtf.format(currentTime);
		File source = ((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Owner\\Desktop\\project\\FB\\"+d+Name+".jpg");
		FileHandler.copy(source, destination);
		
	}

}
