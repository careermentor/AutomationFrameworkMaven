package org.wipro.automation.aumw.utiltiesPkg;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropFiles 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./target/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./target/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./target/data.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
}
