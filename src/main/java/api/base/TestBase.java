package api.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public Properties prop;
	
	public TestBase() {
		
		try {
			prop=new Properties();
			FileInputStream fis = new FileInputStream("/automation.api/src/main/java/api/config/config.properties");
			prop.load(fis);
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
