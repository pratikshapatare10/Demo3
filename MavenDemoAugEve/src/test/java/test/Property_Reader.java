package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Reader {

	Properties pro;
	String path="D:\\Pratiksha\\chromedriver_win32 (3)\\chromedriver.exe";
	
	public Property_Reader()
	{
		pro=new Properties();
		
		try {
			FileInputStream f=new FileInputStream(path);
			pro.load(f);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUrl()
	{
		return pro.getProperty("url");
	}
	
	public String getChromePath()
	{
		return pro.getProperty("chromepath");
	}
}
