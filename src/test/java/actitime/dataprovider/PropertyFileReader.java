package actitime.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	Properties properties;

	public PropertyFileReader() {
		try {
			FileInputStream fis = new FileInputStream(
					getClass().getClassLoader().getResource("app.properties").getFile());
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String get(String key) {
		return this.properties.getProperty(key);
	}
}
