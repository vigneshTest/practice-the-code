package com.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config_Reader {
	public static Properties pro;

	public Config_Reader() throws Throwable {
		File path = new File(
				"C:\\Users\\vicky\\eclipse-workspace\\Seleniumclasses\\Maven_Programs\\src\\test\\java\\com\\propertyfile\\Datas.properties");
		FileInputStream fle = new FileInputStream(path);

		pro = new Properties();
		pro.load(fle);
	}

	public String geturl() {
		String url = pro.getProperty("url");
		return url;
	}

	private String username() {
		String username = pro.getProperty("username");
		return username;
	}

}