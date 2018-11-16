package com.program.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {

		File file = new File("./src/test/resources/test.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);
		fis.close();
		
		//to read a single key value
		// String valueforKey= prop.getProperty("token");
		// System.out.println(valueforKey);

		//to read data
		Enumeration<Object> enumKeys = prop.keys();
		while (enumKeys.hasMoreElements()) {
			// Object s = enumKeys.nextElement();
			String key = (String) enumKeys.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
		
		//to write data
		FileOutputStream fos = new FileOutputStream(file);
		prop.setProperty("xpath","//sample");
		prop.store(fos, null);
		fos.close();

	}
}
