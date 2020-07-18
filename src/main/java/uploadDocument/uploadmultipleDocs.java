package uploadDocument;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadmultipleDocs {
	//https://www.youtube.com/watch?v=gWFUoJZHSNo

	public static void main(String[] args) throws IOException, InterruptedException {
	/*	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");*/
		
		File dir = new File("D:\\autoItImages");
		String allimgs="";
		File[] flist = dir.listFiles();
		for(File file:flist)
		{
			if(file.isFile())
			{
				allimgs=allimgs+"\""+file.getName()+"\" "+" ";
			}
		}
		//get the folder where all te images are there and click enter
		//Runtime.getRuntime().exec("d:\\getTheFolder.exe"+ " "+allimgs);
		
		Runtime.getRuntime().exec("d:\\getTheFolder.exe"+ " "+dir+File.separator);
		
		Thread.sleep(5000);
		//select all images and click open
		Runtime.getRuntime().exec("d:\\selectAllAndClickOpen.exe"+ " "+allimgs);
		
		Thread.sleep(3000);
		
		

	}

}
