package FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties_File {
	public static  String getProperty(String key) throws FileNotFoundException{
	String value=null;
	FileInputStream fis=new FileInputStream("Input/OR.properties");
	Properties prop=new Properties();
	try {
		prop.load(fis);
		value=prop.getProperty(key);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	return value;
	
	}

	
}
